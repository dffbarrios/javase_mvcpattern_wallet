package mvc.controller;

import java.util.List;
import java.util.ArrayList;

import mvc.view.JFFAccount;
import mvc.view.JFFConcept;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.dal.pojo.TblAccount;
import mvc.model.dal.pojo.TblAccounttype;
import mvc.model.dal.pojo.TblConcept;

import mvc.model.dal.implement.AccountDal;
import mvc.model.dal.implement.AccountTypeDal;
import mvc.model.dal.implement.ConceptDal;

/**
 *
 * @author Diego SNP3004EX
 */
public class AccountController implements ActionListener, KeyListener {
   
    JFFAccount view;
    
    public AccountController(){
        initView();
    }    
    
    public void initView(){
        
       view = new JFFAccount();       
       
       view.jtf_number.addKeyListener(this);
       view.jbtn_save.addActionListener(this);		
       view.jbtn_search.addActionListener(this);
       
       view.jbtn_backcon.addActionListener(this);		
       view.jbtn_backtra.addActionListener(this);
       
       view.jbtn_close.addActionListener(this);
       view.jmitem_account.addActionListener(this);
       
       view.fillJcomboBox(this.fillAccountType());
   }
    
   public ArrayList<String> fillAccountType(){
       try{
           
           List<TblAccounttype> accounttypes;
           ArrayList<String> accountDesc = new ArrayList<String>();
           accountDesc.add("Seleccione una opción...");
           
           AccountTypeDal accountTypeDal = new AccountTypeDal();
           accounttypes = accountTypeDal.get();           
           
           for(TblAccounttype accounttype: accounttypes ){
               accountDesc.add(accounttype.getActName());
           }
           
           return accountDesc;
           
       }catch(Exception ex){
           view.lauchMessage(ex.toString());
           return new ArrayList<String>();
       }
   }
   
    public Object[][] get(){
       try{
           AccountDal accountDal = new AccountDal();
           List<TblAccount> account = accountDal.get();
           
           Object[][] model = new Object[account.size()][4];
           for(int i = 0; i< account.size(); i++){
               model[i][0] =  account.get(i).getAccNumber();
               model[i][1] = account.get(i).getTblAccounttype().getActName();
               model[i][2] = account.get(i).getAccBalance();
               model[i][3] = account.get(i).getAccCreationdate().toString();
           }           
           return model;
           
       }catch(Exception ex){
           view.lauchMessage(ex.toString());
           return null;
       }
   }
    
   public void insert(){
       try{
            AccountDal accountDal = new AccountDal();

            if(accountDal.findByNumber(view.jtf_number.getText()) != null){
                view.lauchMessage("¡Este número de cuenta ya esta registrado!");  
            }else{
                TblAccount account = new TblAccount(); 
                AccountTypeDal accountTypeDal = new AccountTypeDal();
                
                account.setAccStatus(true);
                account.setAccNumber(view.jtf_number.getText());
                account.setTblAccounttype(accountTypeDal.get()
                        .stream().filter(a -> a.getActName().equals(view.jcbox_type.getSelectedItem().toString()))
                        .findAny().orElse(null));
                account.setAccBalance(Double.parseDouble(view.jspn_balance.getValue().toString()));

                accountDal.insert(account);
                view.lauchMessage("¡Registro agregado!");
            }          

       }catch(Exception ex){
           view.lauchMessage(ex.toString());
       }
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == view.jbtn_save){         
            
            if(view.jcbox_type.getSelectedIndex() != 0){
                this.insert();
                view.fillJTable(this.get());
            }else{                
                view.lauchMessage("Seleccione tipo de cuenta");
            }   
            
        }else if(e.getSource() == view.jbtn_search){
          view.fillJTable(this.get());
           
        }else if(e.getSource() == view.jbtn_backcon){
           view.dispose();
           new ConceptController();
            
        }else if(e.getSource() == view.jbtn_backtra){
          view.dispose();
          new TransactionController();
            
        }else if(e.getSource() == view.jbtn_close){
          System.exit(0);
        
        }else if(e.getSource() == view.jmitem_account){
           view.dispose();
           new MainController();
       }      
    }

    @Override
    public void keyTyped(KeyEvent e) {        
        view.jbtn_save.setEnabled(view.jtf_number.getText().length() > 5);
    }

    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    
}
