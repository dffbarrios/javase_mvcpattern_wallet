package model.dal.implementation;

import java.util.List;
import model.dao.Connection;
import model.pojo.TblAccounttype;
import model.dal.exceptions.Exceptions;
import model.dal.abstraction.IAccountType;

/**
 *
 * @author Diego SNP3004EX
 */
public class AccountTypeDal implements IAccountType {

    @Override
    public List<TblAccounttype> get() {
        
     List<TblAccounttype> accounttypes;
        Connection session = new Connection();
             
        try{
            accounttypes = session.getSession().createQuery("from TblAccounttype").list();    
        
        }catch(Exception ex){
            
            session.tryRollBack();
            throw new RuntimeException(Exceptions.getAccountTypeError, ex);
        
        }finally{
            session.closeSession();
        }  
        
        return accounttypes;  
    }
    
}
