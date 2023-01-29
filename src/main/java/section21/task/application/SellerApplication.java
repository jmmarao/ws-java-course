package section21.task.application;

import section21.task.model.daos.FactoryDAO;
import section21.task.model.daos.SellerDAO;
import section21.task.model.entities.Department;
import section21.task.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class SellerApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Seller> sellers;
        Department department = new Department(2, null);
        Seller sellerToFind;

        SellerDAO sellerDAO = FactoryDAO.createSellerDAO();

        System.out.println("======= Test 1: seller findById =======");
        sellerToFind = sellerDAO.findById(3);
        System.out.println(sellerToFind);

        System.out.println("\n======= Test 2: seller findByDepartment =======");
        sellers = sellerDAO.findByDepartment(department);
        for (Seller seller : sellers) {
            System.out.println(seller);
        }

        System.out.println("\n======= Test 3: seller findAll =======");
        sellers = sellerDAO.findAll();
        for (Seller seller : sellers) {
            System.out.println(seller);
        }

        System.out.println("\n======= Test 4: seller insert =======");
        Seller sellerToAdd = new Seller(null, "Scarlet Witch", "scarlet@email.com", new Date(), 3050.0, department);
        sellerDAO.insert(sellerToAdd);
        System.out.println("Inserted! New seller id: " + sellerToAdd.getId());

        System.out.println("\n======= Test 5: seller update =======");
        System.out.println(sellerDAO.findById(6));
        Seller sellerToUpdate = new Seller(6, "Black Panther", "panther@email.com", new Date(), 3000.0, department);
        sellerDAO.update(sellerToUpdate);
        System.out.println("Update completed!");
        System.out.println(sellerDAO.findById(6));

        System.out.println("\n======= Test 6: seller delete =======");
        System.out.println(sellerDAO.findById(2));
        sellerDAO.deleteById(2);
        System.out.println("Delete completed!");
        System.out.println(sellerDAO.findById(2));
    }
}
