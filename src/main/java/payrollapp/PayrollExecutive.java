package payrollapp;

public class PayrollExecutive extends PayrollEmployee implements ReceiveBonus, Insurance {
    private double payPeriodEarnings = 20000.00;
    public PayrollExecutive(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);

    }

    @Override
    public void payInsurance() {
        paycheckTotal -= 10.00;
    }

    @Override
    public void receiveBonus(double bonus) {
        paycheckTotal += (bonus * 3);
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }
}
