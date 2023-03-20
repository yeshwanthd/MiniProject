
import org.example.Calculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    Calculator calci = new Calculator();
    double delta=1e-15;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testRoot1()
    {
        double cal_value=calci.root(25.0);
        double exp_value=5.0;
        assertEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testRoot2()
    {
        double cal_value=calci.root(36.0);
        double exp_value=5.0;
        assertNotEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testFact1()
    {
        double cal_value=calci.factorial(5);
        double exp_value=120;
        assertEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testFact2()
    {
        double cal_value=calci.factorial(4);
        double exp_value=20;
        assertNotEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testPower1()
    {
        double cal_value=calci.power(2.0, 3.0);
        double exp_value=8.0;
        assertEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testPower2()
    {
        double cal_value=calci.power(4.0, 3.0);
        double exp_value=64.0;
        assertEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
}

