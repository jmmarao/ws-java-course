package section21.task.model.daos;

import section21.task.model.entities.Department;
import section21.task.model.entities.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller seller);
    void update(Seller seller);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment (Department department);
}
