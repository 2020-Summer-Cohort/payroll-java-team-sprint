package payrollapp;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PayrollDeveloper employee2 = new PayrollDeveloper(002, "Jimmy", "Buffet");
        PayrollDeveloper employee3 = new PayrollDeveloper(003, "Cameron", "Resuta");
        PayrollDeveloper employee4 = new PayrollDeveloper(004, "Jason", "Orabella");
        PayrollSales employee5 = new PayrollSales(005, "James", "Smith");
        PayrollExecutive employee6 = new PayrollExecutive(006, "Jenny", "Day");
        HourlyEmployee employee7 = new HourlyEmployee(007, "Sara", "Thornsberry");
        HourlyEmployee employee8 = new HourlyEmployee(01, "Trey", "Grace");
    }


}
