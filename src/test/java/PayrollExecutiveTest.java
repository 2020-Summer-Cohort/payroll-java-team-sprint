import org.junit.jupiter.api.Test;
import payrollapp.PayrollExecutive;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayrollExecutiveTest {
    @Test
    public void shouldCreatePayrollExecutiveClass() {
        PayrollExecutive underTest = new PayrollExecutive(004, "John", "Smith");
    }

    @Test
    public void shouldPayInsurance() {
        PayrollExecutive underTest = new PayrollExecutive(004, "John", "Smith");
        double insuranceAmount = underTest.payInsurance();
        assertEquals(10.00, insuranceAmount);
    }

    @Test
    public void shouldHaveDoublePayPeriodEarnings() {
        PayrollExecutive underTest = new PayrollExecutive(004, "John", "Smith");
        double earningsAmount = underTest.getPayPeriodEarnings();
        assertEquals(20000.00, earningsAmount);
    }
}
