import org.junit.jupiter.api.Test;
import payrollapp.PayrollSales;

public class PayrollSalesTest {
    @Test
    public void createPayrollSales() {
        PayrollSales underTestSales = new PayrollSales(002, "Jane", "Doe", 550.00, 200.00, 3000.00);
        }
    @Test
    public void receiveBonusSales(){
        PayrollSales underTestSales = new PayrollSales(002, "Jane", "Doe", 550.00, 200.00, 3000.00);

    }

    }

