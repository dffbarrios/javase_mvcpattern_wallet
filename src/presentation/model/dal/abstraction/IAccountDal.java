package presentation.model.dal.abstraction;

import java.util.List;
import presentation.model.pojo.TblAccount;

/**
 *
 * @author Diego SNP3004EX
 */
public interface IAccountDal {
    void insert(TblAccount account);
    void update(TblAccount account);
    void delete(TblAccount account);
    List<TblAccount> get();
}
