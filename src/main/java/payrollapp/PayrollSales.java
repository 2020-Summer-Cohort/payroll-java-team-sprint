package payrollapp;

public class PayrollSales extends PayrollEmployee {


    private double salesCommission;
    private double payPeriodEarnings;

    public PayrollSales(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
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
        this.payPeriodEarnings = 3000.00;
    }

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }
//
//    @Override
//    public double receiveBonus(bonus) {
//        return bonus;
//    }
}
