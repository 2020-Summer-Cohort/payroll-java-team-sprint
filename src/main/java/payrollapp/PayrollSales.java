package payrollapp;

public class PayrollSales extends PayrollEmployee {


    private double salesCommission;
    private double payPeriodEarnings;

    public PayrollSales(int employeeId, String firstName, String lastName, double paycheckTotal, double salesCommission, double payPeriodEarnings) {
        super(employeeId, firstName, lastName, paycheckTotal);
        this.salesCommission = salesCommission;
        this.payPeriodEarnings = payPeriodEarnings;
    }
    public double getSalesCommission() {
        return salesCommission;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    public void setPayPeriodEarnings(double payPeriodEarnings) {
        this.payPeriodEarnings = payPeriodEarnings;
    }
    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }
}
