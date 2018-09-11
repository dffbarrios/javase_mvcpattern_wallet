package mvc.model.dal.implement;

import java.util.List;
import mvc.model.dal.dao.Connection;
import mvc.model.dal.pojo.TblCategory;
import mvc.model.dal.util.Exceptions;
import mvc.model.dal.contract.ICategoryDal;

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

    @Override
    public TblCategory findByName(String categoryName) {
        
        Connection session = new Connection();
        TblCategory category;
        
        try{
            category = (TblCategory) session.getSession().createQuery("from TblCategory where catName = :catName")
                        .setParameter("catName", categoryName).uniqueResult();
            
        }catch(Exception Ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.findCategoryError);
            
        }finally{
            session.closeSession();            
        }
        
        return category;
    }
}
