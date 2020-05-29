import org.junit.jupiter.api.Test;
import payrollapp.PayrollSales;

public class PayrollSalesTest {
    @Test
    public void createPayrollSales() {
        PayrollSales underTestSales = new PayrollSales(002, "Jane", "Doe");
    }
}

