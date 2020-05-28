package payrollapp;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        CompanyRoster companyRoster = new CompanyRoster();
        printEmployees(companyRoster);
        printEmployeesPaycheck(companyRoster);
        obtainUserInput(companyRoster);
    }

        public static void printEmployees(CompanyRoster companyRoster){
            for(PayrollEmployee employee: companyRoster.getCompanyRoster()){
            System.out.println("The ID for " + employee.getFirstName() + " " + employee.getLastName() + "is: " + employee.getEmployeeId());
                }
            }

        public static void printEmployeesPaycheck(CompanyRoster companyRoster){
            for(PayrollEmployee employee: companyRoster.getCompanyRoster()){
            System.out.println("Paycheck total for " + employee.getFirstName() + " " + employee.getLastName() + "ID-" + employee.getEmployeeId() + " is: " + employee.getPaycheckTotal());
        }
    }

        public static void obtainUserInput(CompanyRoster companyRoster) {
            Scanner input = new Scanner(System.in);
            for (PayrollEmployee employee : companyRoster.getCompanyRoster()) {
                if (employee instanceof HourlyEmployee) {
                    System.out.println("How many hours did you work?");
                    ((HourlyEmployee) employee).setHoursWorked(input.nextInt());
                } if (employee instanceof PayrollSales) {
                    System.out.println("What was your commission?");
                    ((PayrollSales) employee).setSalesCommission(input.nextDouble());
                } if (employee instanceof ReceiveBonus) {
                    System.out.println("What was your bonus?");
                    ((ReceiveBonus) employee).receiveBonus(input.nextDouble());
                }
            }
        }
    }


