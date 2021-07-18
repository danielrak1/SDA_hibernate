package menu;

import model.Department;
import model.Employee;
import persistence.RepositoryEmployee;

import java.util.List;
import java.util.Scanner;

public class SubMenu {
    RepositoryEmployee repEmp = new RepositoryEmployee();
    Scanner input = new Scanner(System.in);
    Employee emp = new Employee();

    public SubMenu() {

    }

    public void addNewEmployee() {
        System.out.println("Select the department id ");
        Department dept = new Department();
        dept.setDepartmentId(input.nextInt());
        emp.setDepartment(dept);


        System.out.println("Type the first name ");
        emp.setFirstName(input.next());

        System.out.println("Type the last name ");
        emp.setLastName(input.next());

        System.out.println("Type the date of birth name ");
        emp.setDateOfBirth(input.next());

        System.out.println("Type the email ");
        emp.setEmail(input.next());

        System.out.println("Type the phone number ");
        emp.setPhoneNumber(input.next());

        System.out.println("Enter the salary ");
        emp.setSalary(input.nextInt());



        repEmp.saveEmployee(emp);
    }

    public void updateEmployee() {

    }

    public void deleteEmployee() {

    }

    public void findEmployeeById() {

    }

    public void listEmployeeByDepartment() {

    }

    public void listAllEmployees() {
        List<Employee> listAll = repEmp.listAllEmployees();
        for (Employee emp : listAll) ;
        System.out.println(listAll.toString());
    }
}
