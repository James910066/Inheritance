import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1, w2;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001","James","Dinser",1982,35.50);
        w2 = new Worker("000002","bob","Joe",2009,20.00);
    }

    @Test
    void setID() {
        w1.setID("000001");
        assertEquals("000001",w1.getID());
    }

    @Test
    void setFirstName() {
        w1.setFirstName("James");
        assertEquals("James",w1.getFirstName());
    }

    @Test
    void setLastName() {
        w1.setLastName("Dinser");
        assertEquals("Dinser",w1.getLastName());
    }

    @Test
    void setTitle() {
        w1.setTitle("Mr.");
        assertEquals("Mr.",w1.getTitle());
    }

    @Test
    void setYOB() {
        w1.setYOB(2009);
        assertEquals(2009,w1.getYOB());
    }

    @Test
    void testToString() {
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(30.00);
        assertEquals(30.00,w1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        w1.calculateWeeklyPay(45);
        assertEquals(950,w1.calculateWeeklyPay(45));
    }

    @Test
    void displayWeeklyPay() {

    }
}