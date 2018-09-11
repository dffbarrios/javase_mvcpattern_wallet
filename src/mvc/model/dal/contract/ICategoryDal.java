package mvc.model.dal.contract;

import java.util.List;
import mvc.model.dal.pojo.TblCategory;

/**
 *
 * @author Diego SNP3004EX
 */
public interface ICategoryDal {
    List<TblCategory> get();
    TblCategory findByName(String categoryName);
}
