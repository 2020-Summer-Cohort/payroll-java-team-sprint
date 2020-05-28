package payrollapp;

public class PayrollDeveloper extends PayrollEmployee implements ReceiveBonus {
    private double payPeriodEarnings = 9000.00;
    public PayrollDeveloper(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

//    @Override
//    public void receiveBonus(double bonus) {
//
//    }

    public double payInsurance() {
        return 80.00;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    @Override
    public void receiveBonus(double bonus) {
        paycheckTotal += bonus;
    }
}
