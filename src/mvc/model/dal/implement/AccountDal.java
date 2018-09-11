/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc.model.dal.implement;

import java.util.Date;
import java.util.List;
import mvc.model.dal.contract.IAccountDal;
import mvc.model.dal.dao.Connection;
import mvc.model.dal.pojo.TblAccount;
import mvc.model.dal.util.Exceptions;

/**
 *
 * @author Diego SNP3004EX
 */
public class AccountDal implements IAccountDal {

    @Override
    public void insert(TblAccount account) {
        
       Connection session = new Connection();

        try{
            account.setAccCreationdate(new Date());
            session.getSession().persist(account);
            session.getTransaction().commit();   
            
        }catch(Exception ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.insertAccountError, ex);
            
        }finally{
              session.closeSession();
        }       
    }

    @Override
    public void update(TblAccount account) {
        Connection session = new Connection();
        
        try{
            session.getSession().update(account);
            session.getTransaction().commit();
           
        }catch(Exception ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.updateTransactionError, ex);
        
        }finally{
            session.closeSession();        
        }
    }

    @Override
    public List<TblAccount> get() {
         List<TblAccount> accounts;
        Connection session = new Connection();
             
        try{
            accounts = session.getSession().createQuery("from TblAccount").list();    
        
        }catch(Exception ex){
            
            session.tryRollBack();
            throw new RuntimeException(Exceptions.getTransactionError, ex);
        
        }finally{
            //session.closeSession();
        }  
        
        return accounts;  
    }   
    
    public TblAccount findByNumber(String accountNumber) {
        
        Connection session = new Connection();
        TblAccount account;
        
        try{
            account = (TblAccount) session.getSession().createQuery("from TblAccount where accNumber = :accountNumber")
                        .setParameter("accountNumber", accountNumber).uniqueResult();
            
        }catch(Exception Ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.findAccountError);
            
        }finally{
            session.closeSession();            
        }
        
        return account;
    }
}
