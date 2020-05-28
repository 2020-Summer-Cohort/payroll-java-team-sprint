package payrollapp;

public class HourlyEmployee extends PayrollEmployee  {
private int hoursWorked;
private double hourlyRate=20.00;
    public HourlyEmployee(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }
    public void hoursWorked(){
        hoursWorked();
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

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
