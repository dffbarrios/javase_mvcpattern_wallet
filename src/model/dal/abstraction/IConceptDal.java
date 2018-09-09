package model.dal.abstraction;

import java.util.List;
import model.pojo.TblConcept;

/**
 *
 * @author Diego SNP3004EX
 */
public interface IConceptDal {
    
    void insert(TblConcept concept);
    void update(TblConcept concept);
    //void delete(TblConcept concept);
    List<TblConcept> get();
}
