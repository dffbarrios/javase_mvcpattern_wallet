package model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Diego SNP3004EX
 */
public class Connection {
    
    private Session session = null;
    private SessionFactory sessionFactory;
    private Transaction transaction = null;
    
    public Connection(){        
        this.session = null;
        this.transaction = null;
        this.sessionFactory = null;
        this.createSession();
    }
    
    private void createSession(){
        try{
            sessionFactory = new AnnotationConfiguration()
                                .configure()
                                .buildSessionFactory();
            
            this.session = this.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();  
            
        }catch(Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
        }
    }
    
    private SessionFactory getSessionFactory(){
        return this.sessionFactory;
    }
    
    public Session getSession(){
        return this.session;
    }
    
    public Transaction getTransaction(){
        return this.transaction;
    }
    
    public void closeSession(){
        this.session.close();
    }
    
    public void tryRollBack(){
        this.transaction.rollback();
    }
}