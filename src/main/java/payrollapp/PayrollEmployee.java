package payrollapp;

public class PayrollEmployee {
    private int employeeId;
    private  String firstName;
    private  String lastName;
    protected double paycheckTotal;

    public PayrollEmployee(int employeeId, String firstName, String lastName) {

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PayrollEmployee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPaycheckTotal() {
        return paycheckTotal;
    }
 public void setPaycheckTotal(double pct){
        paycheckTotal=pct;
 }

}



