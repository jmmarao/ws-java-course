package section21.task.model.daos;

import section21.task.config.database.DB;
import section21.task.model.daos.impl.DepartmentDAOJDBC;
import section21.task.model.daos.impl.SellerDAOJDBC;

public class FactoryDAO {
    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC(DB.getConnection());
    }

    public static DepartmentDAO createDepartmentDAO() {
        return new DepartmentDAOJDBC(DB.getConnection());
    }
}
