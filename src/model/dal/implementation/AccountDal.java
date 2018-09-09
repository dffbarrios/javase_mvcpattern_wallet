/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dal.implementation;

import java.util.List;
import model.dao.Connection;
import model.pojo.TblAccount;
import model.dal.exceptions.Exceptions;
import model.dal.abstraction.IAccountDal;

/**
 *
 * @author Diego SNP3004EX
 */
public class AccountDal implements IAccountDal {

    @Override
    public void insert(TblAccount account) {
        
       Connection session = new Connection();

        try{
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
            session.closeSession();
        }  
        
        return accounts;  
    }   
}