package mvc.model.dal.contract;

import java.util.List;
import mvc.model.dal.pojo.TblConcept;

/**
 *
 * @author Diego SNP3004EX
 */
public interface IConceptDal {
    
    void insert(TblConcept concept);
    void update(TblConcept concept);
    
    List<TblConcept> get();
    TblConcept findByName(String conceptName);
    //void delete(TblConcept concept);
}
