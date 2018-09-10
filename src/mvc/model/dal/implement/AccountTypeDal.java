package mvc.model.dal.implement;

import java.util.List;
import mvc.model.dal.dao.Connection;
import mvc.model.dal.pojo.TblAccounttype;
import mvc.model.dal.util.Exceptions;
import mvc.model.dal.contract.IAccountType;

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
