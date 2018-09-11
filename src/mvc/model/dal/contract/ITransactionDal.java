package mvc.model.dal.contract;

import java.util.List;
import mvc.model.dal.pojo.TblTransaction;

/**
 *
 * @author Diego SNP3004EX
 */
public interface ITransactionDal {
    void insert(TblTransaction transaction);
    void update(TblTransaction transaction);   
    
    List<TblTransaction> get();    
     //void delete(TblTransaction transaction);
}
