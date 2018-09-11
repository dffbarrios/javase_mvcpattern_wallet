package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import mvc.controller.util.Dates;
import mvc.model.dal.implement.AccountDal;
import mvc.model.dal.implement.CategoryDal;
import mvc.model.dal.implement.ConceptDal;
import mvc.model.dal.implement.TransactionDal;
import mvc.model.dal.pojo.TblAccount;
import mvc.model.dal.pojo.TblCategory;
import mvc.model.dal.pojo.TblConcept;
import mvc.model.dal.pojo.TblTransaction;
import mvc.view.JFFTransaction;

/**
 *
 * @author Diego SNP3004EX
 */
public class TransactionController implements ActionListener, KeyListener, ItemListener {
    
    JFFTransaction view;
    
    public TransactionController(){
        initView();
    }
    
    
    public void initView(){
        
       view = new JFFTransaction();       
       
       view.jcbox_category.addActionListener(this);
       view.jcbox_concept.addActionListener(this);
       
       view.jcbox_category.addItemListener(this);
       
       view.jtf_originacc.addKeyListener(this);
       
       view.jbtn_report.addActionListener(this);
       view.jbtn_send.addActionListener(this);
       view.jbtn_search.addActionListener(this);
       view.jbtn_backacc.addActionListener(this);
       view.jbtn_backcon.addActionListener(this);
       view.jbtn_close.addActionListener(this);
       
       view.jmitem_close.addActionListener(this);
       
       view.fillJcomboBox(this.fillCategory(), view.jcbox_category);
       view.fillJcomboBox(this.fillConcept(), view.jcbox_concept);
   }
    
    public ArrayList<String> fillCategory(){
       try{
           
           List<TblCategory> category ;
           ArrayList<String> categoryDesc = new ArrayList<String>();
           categoryDesc.add("Seleccione una opción...");
           
           CategoryDal categoryDal = new CategoryDal();
           category = categoryDal.get();           
           
           for(TblCategory cat: category ){
               categoryDesc.add(cat.getCatName());
           }
           
           return categoryDesc;
           
       }catch(Exception ex){
           view.lauchMessage(ex.toString());
           return new ArrayList<String>();
       }
    }
    
    public ArrayList<String> fillConcept(){
        try{

            List<TblConcept> concept ;
            ArrayList<String> conceptDesc = new ArrayList<String>();
            conceptDesc.add("Seleccione una opción...");

            ConceptDal conceptDal = new ConceptDal();
            concept = conceptDal.get();           

            for(TblConcept con: concept ){
                conceptDesc.add(con.getConName());
            }

            return conceptDesc;

        }catch(Exception ex){
            view.lauchMessage(ex.toString());
            return new ArrayList<String>();
        }
   }
   
    public void insert(){
         try{
             boolean validateAccount = false;
             boolean isTranslate = isTranslate(); 
             
             if(isTranslate){
                 validateAccount = existAccount(view.jtf_destinyacc.getText()) && existAccount( view.jtf_originacc.getText());
             }else{
                validateAccount = existAccount(view.jtf_originacc.getText());
             }
             
             if(validateAccount){
                 if((Double)view.jspn_amount.getValue() > 0){
                     
                     int curretDateId = Dates.getCurrentDateIntFormat();
                     String category = view.jcbox_category.getSelectedItem().toString();
                     double ammount = (Double) view.jspn_amount.getValue();
                     
                     ConceptDal conceptDal = new ConceptDal();
                     AccountDal accountDal = new AccountDal();
                     CategoryDal categoryDal = new CategoryDal();                     
                     TransactionDal  transactionDal = new TransactionDal();
                        
                     boolean transactionComplete = false;
                     if(isTranslate){
                        // transactionComplete =
                        //         this.insert(uniqueId, view.jtf_originacc.getText(), ammount*-1, view.jcbox_category.getSelectedItem().toString())
                        //         && this.insert(uniqueId, view.jtf_destinyacc.getText(), ammount, "INGRESOS");
                     transactionComplete =
                                 this.insert(curretDateId, view.jtf_originacc.getText(), ammount, view.jcbox_category.getSelectedItem().toString())
                                 && this.insert(curretDateId, view.jtf_destinyacc.getText(), ammount, "INGRESOS");
                     }else{
                        //ammount = view.jcbox_category.getSelectedItem().toString().equals("INGRESOS") ? ammount : ammount*-1;
                        this.insert(curretDateId, view.jtf_originacc.getText(), ammount, view.jcbox_category.getSelectedItem().toString()); 
                        view.lauchMessage("¡Transacción exitosa agregado!");
                     }              
                     
                 }else{
                    view.lauchMessage("Ingrese un monto valido");
                 }
             }else{
                view.lauchMessage("Verifique el número de la(s) cuenta(s)");
             }
        }catch(Exception ex){
            view.lauchMessage(ex.toString());
        }
    } 
    
    public boolean insert(int transactionNumber, String accountNumber, double amount, String category ){
        try{
          
            ConceptDal conceptDal = new ConceptDal();
            AccountDal accountDal = new AccountDal();
            CategoryDal categoryDal = new CategoryDal();                     
            TransactionDal  transactionDal = new TransactionDal();
            
            TblTransaction transaction = new TblTransaction();
            
            transaction.setTraNumber(transactionNumber);
            transaction.setTblAccount(accountDal.findByNumber(accountNumber));
            transaction.setTraBalance(amount);
            
            transaction.setTblConcept(conceptDal.findByName(view.jcbox_concept.getSelectedItem().toString()));
            transaction.setTblCategory(categoryDal.findByName(category));
            
            transaction.setTraDate(new Date());
            transactionDal.insert(transaction);            
            return true;
            
        }catch(Exception ex){
            
            view.lauchMessage("Error enviando transacción" + ex.toString());
            return false;
        }
    }
    
    
    public boolean existAccount(String number){
        try{
            AccountDal accountDal = new AccountDal();
            TblAccount account = accountDal.findByNumber(number);
            return (account != null);
        }catch(Exception ex){
            view.lauchMessage("Error recuperando cuenta: " + ex);
            return false;
        }
    }
    
    public boolean isTranslate(){
        return (view.jtf_destinyacc.getText().length() > 5 && view.jtf_originacc.getText().length() > 5);
    }
    
    
    public Object[][] get(){
        try{
            TransactionDal transactionDal = new TransactionDal();
            List<TblTransaction> transactions = transactionDal.get();

            Object[][] model = new Object[transactions.size()][6];
            for(int i = 0; i< transactions.size(); i++){
                model[i][0] =  transactions.get(i).getTraNumber();
                model[i][1] = transactions.get(i).getTblAccount().getAccNumber();
                model[i][2] = transactions.get(i).getTblCategory().getCatName();
                model[i][3] = transactions.get(i).getTblConcept().getConName();
                model[i][4] = transactions.get(i).getTraBalance().toString() + " COP";
                model[i][5] = transactions.get(i).getTraDate().toString();
            }           
            return model;

        }catch(Exception ex){
            view.lauchMessage(ex.toString());
            return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == view.jbtn_send){           
           if(view.jcbox_concept.getSelectedIndex() != 0){
               this.insert();
               view.fillJTable(this.get());
           }else{
                view.lauchMessage("Seleccione un concepto");
           }
           
        }else if(e.getSource() == view.jbtn_search){
          view.fillJTable(this.get());
            
        }else if(e.getSource() == view.jbtn_backacc){
          view.dispose();
          new AccountController();
            
        }else if(e.getSource() == view.jbtn_backcon){
          view.dispose();
           new ConceptController();
            
        }else if(e.getSource() == view.jbtn_report){
          view.dispose();
           new ReportController();
            
        }        
        
        else if(e.getSource() == view.jbtn_close){
          System.exit(0);
        
        }else if(e.getSource() == view.jmitem_close){
           view.dispose();
           new MainController();
       }      
    }

    @Override
    public void keyTyped(KeyEvent e) {       
        if(view.jcbox_category.getSelectedIndex() == 3){
            
            view.jbtn_send.setEnabled(
                    view.jtf_originacc.getText().length() > 5 && view.jtf_destinyacc.getText().length() > 5);
        }else{
          view.jbtn_send.setEnabled(view.jtf_originacc.getText().length() > 5);   
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        boolean state = view.jcbox_category.getSelectedIndex() == 3;       
        
        if(state){
            view.jbtn_send.setEnabled(false);
        }else{
            view.jbtn_send.setEnabled(true);
        }
        
        view.jtf_destinyacc.setEnabled(state);
        view.jtf_destinyacc.setVisible(state);
        view.jlbl_destinyacc.setVisible(state);
      
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}    
}
