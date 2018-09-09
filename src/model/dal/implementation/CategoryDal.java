package model.dal.implementation;

import java.util.List;
import model.dao.Connection;
import model.pojo.TblCategory;
import model.dal.exceptions.Exceptions;
import model.dal.abstraction.ICategoryDal;

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
