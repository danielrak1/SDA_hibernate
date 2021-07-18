package main;

import model.Employee;
import model.EmployeeDepartment;
import persistence.RepositoryEmployee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepositoryEmployee repEmp = new RepositoryEmployee();
        Employee employee = new Employee();

//        employee.setFirstName("Patrik");
//        employee.setLastName("Cat");
//        employee.setEmail("PAtrik@gmail.com");
//        employee.setPhoneNumber("9876-5432");
//        employee.setDateOfBirth("2006-07-06");
//        employee.setSalary(100);

        /*
        TODO: Save Employee method
        */
//
//        repEmp.saveEmployee(employee);

         /*
        TODO: Update Employee method
        */
//        employee.setEmployeeId(2);
//        repEmp.updateEmployee(employee);

         /*
        TODO: Delete Employee method
        */

//        repEmp.deleteEmployee(3);

        /*
       TODO:  List all employees method
        */

//        List<Employee> result = repEmp.listAllEmployees();
//        for (Employee emp : result)
//            System.out.println(emp.toString());

        /*
       TODO:  Find employee methods
        */

//        System.out.println(repEmp.findEmployeeById(2));

       /*
       TODO:  list employee by department
        */

//        List<Employee> list = repEmp.listEmployeeByDepartmentId(1);
//        for (Employee emp : list) {
//            System.out.println(emp.toString());
//        }

//        List<Employee> list2 = repEmp.listEmployeeByDepartmentName("HR");
//        for (Employee emp : list2) {
//            System.out.println(emp.toString());
//        }

         /*
       TODO:  list employee with department
        */

        List<EmployeeDepartment> list = repEmp.listEmpWithDept();
        for (EmployeeDepartment emp : list) {
            System.out.println(emp.toString());
        }

    }
}
