package payrollapp;

public class PayrollExecutive extends PayrollEmployee implements ReceiveBonus {
    private double payPeriodEarnings = 20000.00;
    public PayrollExecutive(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);

    }

    public double payInsurance() {
        return 10.00;
    }

    @Override
    public void receiveBonus(double bonus) {
        paycheckTotal += (bonus * 3);
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }
}
