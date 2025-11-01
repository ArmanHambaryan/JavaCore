package homework.employee;

import homework.employee.exception.ThisIDNotEmployeeException;

import java.util.Scanner;


public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean found = true;
        while (found) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    found = false;
                    break;
                case ADD_EMPLOYEE:
                    adEmployee();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    System.out.println("please input id");
                    String id = scanner.nextLine();
                    try {
                        employeeStorage.searchEmployeeByID(id);
                    } catch (ThisIDNotEmployeeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    System.out.println("please input company");
                    String company = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompany(company);
                    break;
                default:
                    System.out.println("Wrong command! try again");


            }
        }


    }

    private static void adEmployee() {
        System.out.println("please input Employee Name ");
        String name = scanner.nextLine();
        System.out.println("please input Employee SurName ");
        String surname = scanner.nextLine();
        System.out.println("please input Employee EmployeeID ");
        String employeeid = scanner.nextLine();
        System.out.println("please input Employee salary ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("please input Employee company ");
        String company = scanner.nextLine();
        System.out.println("please input Employee position ");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, employeeid, salary, company, position);
        employeeStorage.add(employee);
        System.out.println("Employee added successfully ");


    }


}
