package payrollapp;

import java.util.ArrayList;

public class CompanyRoster extends PayrollEmployee {

    private double bonusAmount;
    private ArrayList<PayrollEmployee> companyRoster = new ArrayList<>();
        PayrollDeveloper employee2 = new PayrollDeveloper(002, "Jimmy", "Buffet");
        PayrollDeveloper employee3 = new PayrollDeveloper(003, "Cameron", "Resuta");
        PayrollDeveloper employee4 = new PayrollDeveloper(004, "Jason", "Orabella");
        PayrollSales employee5 = new PayrollSales(005, "James", "Smith");
        PayrollExecutive employee6 = new PayrollExecutive(006, "Jenny", "Day");
        HourlyEmployee employee7 = new HourlyEmployee(007, "Sara", "Thornsberry");
        HourlyEmployee employee8 = new HourlyEmployee(01, "Trey", "Grace");

    public void addEmployeeToCompanyRoster() {
        companyRoster.add(employee2);
        companyRoster.add(employee3);
        companyRoster.add(employee4);
        companyRoster.add(employee5);
        companyRoster.add(employee6);
        companyRoster.add(employee7);
        companyRoster.add(employee8);
    }

    public CompanyRoster(int employeeId, String firstName, String lastName) {
        super();
    }

    public CompanyRoster() {

    }

    public double calculatePay(double salary, double bonus, double commission, double insuranceFees) {
        return paycheckTotal += paycheckTotal + (salary + commission + bonus - insuranceFees);
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public void calculatePaycheckTotal(double bonusAmount) {
        for (PayrollEmployee employee : companyRoster) {
            employee.setPaycheckTotal();
            if (employee instanceof ReceiveBonus) {
                ((ReceiveBonus) employee).receiveBonus(bonusAmount);
            } if (employee instanceof Insurance) {
                ((Insurance) employee).payInsurance();
            }
        }
    }


    public ArrayList<PayrollEmployee> getCompanyRoster() {
        return companyRoster;
    }

    }