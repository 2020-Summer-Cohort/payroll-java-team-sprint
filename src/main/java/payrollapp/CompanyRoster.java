package payrollapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CompanyRoster extends PayrollEmployee {
    public CompanyRoster(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    public double calculatePay(double salary, double bonus, double commission, double insuranceFees) {
        return paycheckTotal += (salary + commission + bonus - insuranceFees);
    }

    Map<String, PayrollEmployee> payrollEmployees = new HashMap<>();

    public Collection getPayrollEmployeesCollection() {
        return payrollEmployees.values();
    }

}
