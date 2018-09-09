package model.dal.implementation;

import java.util.List;
import model.dao.Connection;
import model.pojo.TblConcept;
import model.dal.exceptions.Exceptions;
import model.dal.abstraction.IConceptDal;

/**
 *
 * @author Diego SNP3004EX
 */
public class ConceptDal implements IConceptDal {    

    @Override
    public void insert(TblConcept concept) {
        
        Connection session = new Connection();

        try{
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
}
