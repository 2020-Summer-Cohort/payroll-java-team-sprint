import org.junit.jupiter.api.Test;
import payrollapp.PayrollDeveloper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayrollDeveloperTest {

    @Test
    public void createPayrollDeveloper() {
        PayrollDeveloper underTest = new PayrollDeveloper(004, "John", "Smith");
    }

    @Test
    public void shouldGetPayPeriodEarnings() {
        PayrollDeveloper underTest = new PayrollDeveloper(004, "John", "Smith");
        double earningsAmount = underTest.getPayPeriodEarnings();
        assertEquals(9000.00, earningsAmount);
    }
}
