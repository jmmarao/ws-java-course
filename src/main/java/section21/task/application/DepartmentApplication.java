package section21.task.application;

import section21.task.model.daos.DepartmentDAO;
import section21.task.model.daos.FactoryDAO;
import section21.task.model.entities.Department;

import java.util.List;

public class DepartmentApplication {
    public static void main(String[] args) {
        DepartmentDAO departmentDAO = FactoryDAO.createDepartmentDAO();

        System.out.println("======= Test 1: department findById =======");
        System.out.println(departmentDAO.findById(3));

        System.out.println("\n======= Test 2: department findByName =======");
        System.out.println(departmentDAO.findByName("Books"));

        System.out.println("\n======= Test 3: department findAll =======");
        List<Department> departments = departmentDAO.findAll();
        for (Department department : departments) {
            System.out.println(department);
        }

        System.out.println("\n======= Test 4: department insert =======");
        Department departmentToAdd = new Department(null, "Food");
        departmentDAO.insert(departmentToAdd);
        System.out.println("Inserted! New department id: " + departmentToAdd.getId());

        System.out.println("\n======= Test 5: department update =======");
        System.out.println(departmentDAO.findById(3));
        Department departmentToUpdate = new Department(3, "Clothes");
        departmentDAO.update(departmentToUpdate);
        System.out.println("Update completed!");
        System.out.println(departmentDAO.findById(3));

        System.out.println("\n======= Test 6: department delete =======");
        System.out.println(departmentDAO.findById(5));
        departmentDAO.deleteById(5);
        System.out.println("Delete completed!");
        System.out.println(departmentDAO.findById(5));
    }
}
