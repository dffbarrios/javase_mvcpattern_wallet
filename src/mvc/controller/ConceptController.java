package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.dal.implement.ConceptDal;
import mvc.model.dal.pojo.TblConcept;
import mvc.view.JFFConcept;

/**
 *
 * @author Diego SNP3004EX
 */
public class ConceptController implements ActionListener, KeyListener {
   
    JFFConcept view;
    private boolean toUpdate;
    
   public ConceptController(){
       initView();
   } 
   
   public void initView(){
       
       toUpdate = false;
       view = new JFFConcept();
              
       view.jtf_desc.addKeyListener(this);		
       view.btn_save.addActionListener(this);
       view.jbtn_get.addActionListener(this);
       view.jbtn_close.addActionListener(this);
       view.jbtn_backacc.addActionListener(this);
       view.jbtn_backtra.addActionListener(this);
       view.jmitem_close.addActionListener(this);         
   }
   
   public void insert(){
       try{
            ConceptDal conceptDal = new ConceptDal();

            TblConcept concept = new TblConcept();
            concept.setConName(view.jtf_desc.getText());
            concept.setConDesc(view.jtxt_details.getText());
            concept.setConStatus(true);

            conceptDal.insert(concept);
            view.lauchMessage("¡Registro agregado!");

       }catch(Exception ex){
           view.lauchMessage(ex.toString());
       }
   }
   
   public Object[][] get(){
       try{
           ConceptDal conceptDal = new ConceptDal();
           List<TblConcept> concepts = conceptDal.get();
           
           Object[][] model = new Object[concepts.size()][3];
           for(int i = 0; i<concepts.size(); i++){
               model[i][0] =  concepts.get(i).getConId();
               model[i][1] = concepts.get(i).getConName();
               model[i][2] = concepts.get(i).getConDesc();
           }           
           return model;
           
       }catch(Exception ex){
           view.lauchMessage(ex.toString());
           return null;
       }
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == view.btn_save){           
           this.insert();
           view.fillJTable(this.get());
           
        }else if(e.getSource() == view.jbtn_get){
          view.fillJTable(this.get());
            
        }else if(e.getSource() == view.jbtn_close){
          System.exit(0);
        
        }else if(e.getSource() == view.jbtn_backacc){
          view.dispose();
          new AccountController();
        
        }else if(e.getSource() == view.jbtn_backtra){
          view.dispose();
          new TransactionController();
        
        }       
        else if(e.getSource() == view.jmitem_close){
           view.dispose();
           new MainController();
       }      
    }

    @Override
    public void keyTyped(KeyEvent e) {        
        view.btn_save.setEnabled(view.jtf_desc.getText().length() > 5);
    }

    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
}
