package presentation.model.dal.abstraction;

import java.util.List;
import presentation.model.pojo.TblCategory;

/**
 *
 * @author Diego SNP3004EX
 */
public interface ICategoryDal {
    List<TblCategory> get();
}
