package mvc.model.dal.contract;

import java.util.List;
import mvc.model.dal.pojo.TblAccount;

/**
 *
 * @author Diego SNP3004EX
 */
public interface IAccountDal {
    void insert(TblAccount account);
    void update(TblAccount account);    
    List<TblAccount> get();
    
    //void delete(TblAccount account);
}
