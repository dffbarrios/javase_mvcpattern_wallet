/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc.model.dal.implement;

import java.util.List;
import mvc.model.dal.dao.Connection;
import mvc.model.dal.pojo.TblTransaction;
import mvc.model.dal.util.Exceptions;
import mvc.model.dal.contract.ITransactionDal;

/**
 *
 * @author Diego SNP3004EX
 */
public class TransactionDal implements ITransactionDal {

    @Override
    public void insert(TblTransaction transaction) {
        Connection session = new Connection();

        try{
            session.getSession().persist(transaction);
            session.getTransaction().commit();   
            
        }catch(Exception ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.insertTransactionError, ex);
            
        }finally{
              session.closeSession();
        }       
    }

    @Override
    public void update(TblTransaction transaction) {
        Connection session = new Connection();
        
        try{
            session.getSession().update(transaction);
            session.getTransaction().commit();
           
        }catch(Exception ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.updateTransactionError, ex);
        
        }finally{
            session.closeSession();        
        }
    }

    @Override
    public List<TblTransaction> get() {
        
        List<TblTransaction> transactions;
        Connection session = new Connection();
             
        try{
            transactions = session.getSession().createQuery("from TblTransaction").list();    
        
        }catch(Exception ex){
            
            session.tryRollBack();
            throw new RuntimeException(Exceptions.getTransactionError, ex);
        
        }finally{
            //session.closeSession();
        }  
        
        return transactions;  
    }    
}
