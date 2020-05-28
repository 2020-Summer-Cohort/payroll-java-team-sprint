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
}
