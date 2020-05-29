package payrollapp;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CompanyRoster companyRoster = new CompanyRoster();
        companyRoster.addEmployeeToCompanyRoster();
        System.out.println("Welcome to your payroll app!");
        System.out.println("Here are your current employees with ID numbers.");
        printEmployees(companyRoster);
        companyRoster.calculatePaycheckTotal(500.00);
        obtainUserInput(companyRoster, input);
        printEmployeesPaycheck(companyRoster);
    }

        public static void printEmployees(CompanyRoster companyRoster){
            for(PayrollEmployee employee: companyRoster.getCompanyRoster()){
            System.out.println("The ID for " + employee.getFirstName() + " " + employee.getLastName() + "is: " + employee.getEmployeeId());
                }
            }

        public static void printEmployeesPaycheck(CompanyRoster companyRoster){
            for(PayrollEmployee employee: companyRoster.getCompanyRoster()){
            System.out.println("Paycheck total for " + employee.getFirstName() + " " + employee.getLastName() + "ID-" + employee.getEmployeeId() + " is: $" + employee.getPaycheckTotal());
        }
    }

        public static void obtainUserInput(CompanyRoster companyRoster, Scanner input) {
            for (PayrollEmployee employee : companyRoster.getCompanyRoster()) {
                if (employee instanceof HourlyEmployee) {
                    System.out.println("How many hours did " + employee.getFirstName() + " " + employee.getLastName() + " work? Example 00");
                    ((HourlyEmployee) employee).setHoursWorked(input.nextInt());
                } if (employee instanceof PayrollSales) {
                    System.out.println("What was "  + employee.getFirstName() + " " + employee.getLastName() + " commission? Example 10.00");
                    ((PayrollSales) employee).setSalesCommission(input.nextDouble());
                } if (employee instanceof ReceiveBonus) {
                    System.out.println("What was " + employee.getFirstName() + " " + employee.getLastName() + " bonus? Example 500.00");
                    ((ReceiveBonus) employee).receiveBonus(input.nextDouble());
                }
            }
        }
    }


