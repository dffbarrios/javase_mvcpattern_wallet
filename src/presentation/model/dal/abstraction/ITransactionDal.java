package presentation.model.dal.abstraction;

import java.util.List;
import presentation.model.pojo.TblTransaction;

/**
 *
 * @author Diego SNP3004EX
 */
public interface ITransactionDal {
    void insert(TblTransaction transaction);
    void update(TblTransaction transaction);
    //void delete(TblTransaction transaction);
    List<TblTransaction> get();
}
