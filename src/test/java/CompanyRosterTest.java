import org.junit.jupiter.api.Test;
import payrollapp.CompanyRoster;

public class CompanyRosterTest {

    @Test
    public void shouldCreateCompanyRosterClass() {
        CompanyRoster underTest = new CompanyRoster();
    }

    @Test
    public void createCalculatePayMethod() {
        CompanyRoster underTest = new CompanyRoster();
        double payResult = underTest.calculatePay(50000.00, 100.00, 50.00, 10.00);
    }
}
