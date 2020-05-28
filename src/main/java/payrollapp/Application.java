package payrollapp;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CompanyRoster companyRoster = new CompanyRoster();
            System.out.println(companyRoster.getPayrollEmployees().toString());
        }
    }



