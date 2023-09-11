import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker sw1;
    @BeforeEach
    void setUp()
    {
        sw1 = new SalaryWorker("000001","James","Dinser",1978,20.0);
    }
    @Test
    void testToString()
    {
        super.toString();
    }
      @Test
    void getAnnualSalary()
    {
         sw1.setAnnualSalary(41600);
         assertEquals(41600, sw1.getAnnualSalary());
    }
    @Test
    void setAnnualSalary()
    {

    }
    @Test
    void calculateAnnualSalary() {
        sw1.calculateAnnualSalary();
        assertEquals(41600, sw1.getAnnualSalary());
    }
}