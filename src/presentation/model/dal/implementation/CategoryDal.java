package presentation.model.dal.implementation;

import java.util.List;
import presentation.model.dao.Connection;
import presentation.model.pojo.TblCategory;
import presentation.model.dal.exceptions.Exceptions;
import presentation.model.dal.abstraction.ICategoryDal;

/**
 *
 * @author Diego SNP3004EX
 */
public class CategoryDal implements ICategoryDal {

    @Override
    public List<TblCategory> get() {
        
        List<TblCategory> categories;
        Connection session = new Connection();
             
        try{
            categories = session.getSession().createQuery("from TblCategory").list();
            
        }catch(Exception ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.getCategoryError, ex);
            
        }finally{
            session.closeSession();
        }        
        return categories;
    }   
}
