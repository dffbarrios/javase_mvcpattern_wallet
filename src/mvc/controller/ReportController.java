package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import mvc.model.dal.implement.CategoryDal;
import mvc.model.dal.implement.TransactionDal;
import mvc.model.dal.pojo.TblCategory;
import mvc.model.dal.pojo.TblTransaction;
import mvc.view.JFFAccount;
import mvc.view.JFFReports;
import mvc.view.JFFTransaction;

/**
 *
 * @author Diego SNP3004EX
 */
public class ReportController implements ActionListener, ItemListener{

    JFFReports view;
    
    public ReportController(){
        initView();
    }
    
    
    public void initView(){
        
       view = new JFFReports();       
            
       view.jcbox_category.addItemListener(this);       
       view.jbtn_back.addActionListener(this);       
       view.jmitem_close.addActionListener(this);
       
       view.fillJcomboBox(this.fillCategory());
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
    
    public Object[][] get(){
        try{
            TransactionDal transactionDal = new TransactionDal();
            List<TblTransaction> transactions = transactionDal.get();

            Object[][] model = new Object[transactions.size()][6];
            
            int n = 0; int i=0;
            int l = transactions.size();
           
            
            while(n < l){
                n++;
                
                if(transactions.get(i).getTblCategory().getCatName().equals(view.jcbox_category.getSelectedItem().toString())){
                    model[i][0] =  transactions.get(i).getTraNumber();
                    model[i][1] = transactions.get(i).getTblAccount().getAccNumber();
                    model[i][2] = transactions.get(i).getTblCategory().getCatName();
                    model[i][3] = transactions.get(i).getTblConcept().getConName();
                    model[i][4] = transactions.get(i).getTraBalance().toString() + " COP";
                    model[i][5] = transactions.get(i).getTraDate().toString();
                }                
                i++;
            }            
            return model;

        }catch(Exception ex){
            view.lauchMessage(ex.toString());
            return null;
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.jbtn_back){           
           view.dispose();
           new TransactionController();
           
        }else if(e.getSource() == view.jmitem_close){
           view.dispose();
           new MainController();
       }      
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
       view.fillJTable(this.get());
    }
    
    
}
