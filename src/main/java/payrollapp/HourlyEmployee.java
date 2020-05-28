package payrollapp;

public class HourlyEmployee extends PayrollEmployee  {
private int hoursWorked;
private double hourlyRate=20.00;
    public HourlyEmployee(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    @Override
    public void setPaycheckTotal() {
        paycheckTotal = hoursWorked * hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
