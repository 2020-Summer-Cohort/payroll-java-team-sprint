package payrollapp;

public class PayrollSales extends PayrollEmployee implements ReceiveBonus {


    private double salesCommission;
    private double payPeriodEarnings = 300.00;

    public PayrollSales(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);

    }

    @Override
    public void receiveBonus(double bonus) {
        paycheckTotal += bonus;
    }

    @Override
    public void setPaycheckTotal() {
        paycheckTotal = payPeriodEarnings + salesCommission;
    }

    @Override
    public double getPaycheckTotal() {
        return paycheckTotal;
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }


}
