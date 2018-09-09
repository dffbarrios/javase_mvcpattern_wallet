package presentation.model.dal.implementation;

import java.util.List;
import presentation.model.dao.Connection;
import presentation.model.pojo.TblAccounttype;
import presentation.model.dal.exceptions.Exceptions;
import presentation.model.dal.abstraction.IAccountType;

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
