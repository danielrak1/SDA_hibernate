package persistence;

import model.Employee;
import model.EmployeeDepartment;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class RepositoryEmployee {
    private final EntityManager entityManager;

    public RepositoryEmployee() {
        entityManager = DBUtil.getEntityManager();
    }

    public void saveEmployee(Employee employee) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            System.out.println("Employee saved successfully");

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Employee not saved, try again");
        }

    }

    public void updateEmployee(Employee employee) {
        try {
            entityManager.getTransaction().begin();
//            Employee employee1 = entityManager.find(Employee.class, employee.getEmployeeId());
            entityManager.merge(employee);
            entityManager.getTransaction().commit();
            System.out.println("Employee updated");
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
            System.out.println("Employee update failed");
        }
    }

    public void updateEmployeeSalary() {
        entityManager.getTransaction().begin();
        String sql = "Update Employee e SET e.salary := (e.salary *0.01";
        int result = entityManager.createQuery(sql).executeUpdate();
        entityManager.getTransaction().commit();
        if (result > 0) {
            System.out.println("Employees salary update successfull");
        }
    }


    public void deleteEmployee(int employeeId) {
        try {
            entityManager.getTransaction().begin();
            Employee employee = entityManager.find(Employee.class, employeeId);
            entityManager.remove(employee);
            entityManager.getTransaction().commit();
            System.out.println("Employee deleted successfully");
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
            System.out.println("Employee deletion failed");
        }

    }
    public List<Employee> listAllEmployees() {
        return entityManager.createQuery("FROM Employee").getResultList();
    }



    public Employee findEmployeeById(int employeeId) {
        return entityManager.find(Employee.class, employeeId);
    }

    public Employee findEmployeeById2(int employeeId) {
        String sql = "FROM Employee e WHERE e.employeeId = :id";
        return entityManager
                .createQuery(sql, Employee.class)
                .setParameter("id",employeeId)
                .getSingleResult();
    }

    public List listEmployeeByDepartmentId(int departmentId){
        String sql = "From Employee e WHERE e.department.departmentId= :dept";
        return entityManager
                .createQuery(sql)
                .setParameter("dept", departmentId)
                .getResultList();
    }

    public List listEmployeeByDepartmentName(String deptName){
        String sql = "From Employee e WHERE e.department.name= :deptN";
        return entityManager
                .createQuery(sql)
                .setParameter("deptN", deptName)
                .getResultList();
    }

    public List<EmployeeDepartment> listEmpWithDept(){
        String sql = "SELECT new model.EmployeeDepartment(e.employeeId, e.firstName, e.salary, " +
                "d.name) FROM Employee e JOIN e.department d";

        return entityManager.createQuery(sql).getResultList();

    }

}
