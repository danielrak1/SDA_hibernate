package menu;

import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("_________________________");
        System.out.println("|->      Welcome!     <-|");
        System.out.printf("%22s\n", "Choose wisely");
        System.out.println("Select the option on menu");
        System.out.println("1 - Add new employee");
        System.out.println("2 - Update existing employee");
        System.out.println("3 - Delete employee");
        System.out.println("4 - Find employee  by ID");
        System.out.println("5 - List all employees");
        System.out.println("6 - List all employees by department");
        System.out.println("7 - Exit the program");
        System.out.print("Choose: ");

        int choice = input.nextInt();
        SubMenu subMenu = new SubMenu();

        switch (choice) {
            case 1:
                subMenu.addNewEmployee();
                break;
            case 2:
                subMenu.updateEmployee();
                break;
            case 3:
                subMenu.deleteEmployee();
                break;
            case 4:
                subMenu.findEmployeeById();
                break;
            case 5:
                subMenu.listAllEmployees();
                break;
            case 6:
                subMenu.listEmployeeByDepartment();
                break;
            case 7:
                System.out.println("Thank you  for using our program");
                System.exit(0);
        }


    }
}
