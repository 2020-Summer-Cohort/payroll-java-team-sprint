<<<<<<< HEAD
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    public void createEmployeeClass() {
        PayrollEmployee underTest = new PayrollEmployee(001, "John", "Doe", 3000.00);
    }

    @Test
    public void createPayrollSalesClass() {
        PayrollEmployee underTest = new PayrollEmployee(001, "John", "Doe", 3000.00);

    }
=======


import org.junit.jupiter.api.Test;
import payrollapp.PayrollEmployee;

public class EmployeeTest {
    //int employee id
    // string first name
    @Test
    public void createPayrollEmployee(){
        PayrollEmployee underTest= new PayrollEmployee(001,"John","Doe");

    }


>>>>>>> f4b19a77ae8fb3043e7a7a2205ad17d2a9eade33
}
