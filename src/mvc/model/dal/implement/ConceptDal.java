package mvc.model.dal.implement;

import java.util.List;
import mvc.model.dal.dao.Connection;
import mvc.model.dal.pojo.TblConcept;
import mvc.model.dal.util.Exceptions;
import mvc.model.dal.contract.IConceptDal;
import mvc.model.dal.pojo.TblCategory;

/**
 *
 * @author Diego SNP3004EX
 */
public class ConceptDal implements IConceptDal {    

    @Override
    public void insert(TblConcept concept) {
        
        Connection session = new Connection();

        try{
            if("".equals(concept.getConDesc()))
                concept.setConDesc(concept.getConName());
            
            session.getSession().persist(concept);
            session.getTransaction().commit();   
            
        }catch(Exception ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.insertConceptError, ex);
            
        }finally{
              session.closeSession();
        }       
    }

    @Override
    public void update(TblConcept concept) {
        
        Connection session = new Connection();
        
        try{
            session.getSession().update(concept);
            session.getTransaction().commit();
           
        }catch(Exception ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.updateConceptError, ex);
        
        }finally{
            session.closeSession();        
        }
    }
    
    @Override
    public List<TblConcept> get() {
        
        List<TblConcept> concepts;
        Connection session = new Connection();
             
        try{
            concepts = session.getSession().createQuery("from TblConcept").list();    
        
        }catch(Exception ex){
            
            session.tryRollBack();
            throw new RuntimeException(Exceptions.getConceptError, ex);
        
        }finally{
            session.closeSession();
        }  
        
        return concepts;  
    }

    @Override
    public TblConcept findByName(String conceptName) {
        
        Connection session = new Connection();
        TblConcept concept;
        
        try{
            concept = (TblConcept) session.getSession().createQuery("from TblConcept where conName = :cName")
                        .setParameter("cName", conceptName).uniqueResult();
            
        }catch(Exception Ex){
            session.tryRollBack();
            throw new RuntimeException(Exceptions.findConceptError);
            
        }finally{
            session.closeSession();            
        }
        
        return concept;
    }
}
