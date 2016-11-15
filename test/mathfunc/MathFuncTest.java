package mathfunc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathFuncTest {
    private MathFunc math;

    public MathFuncTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        math = new MathFunc();
    }
    
    @After
    public void tearDown() {
        math = null;
    }

    /**
     * Test of getCalls method, of class MathFunc.
     */
    @Test
    public void testGetCalls() {
        System.out.println("getCalls");
        //MathFunc instance = new MathFunc();
        int expResult = 0;
        //int result = instance.getCalls();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(0, math.getCalls());

        math.factorial(1);
        assertEquals(1, math.getCalls());

        math.factorial(1);
        assertEquals(2, math.getCalls());
    }

    /**
     * Test of factorial method, of class MathFunc.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        //int number = 0;
        //MathFunc instance = new MathFunc();
        //long expResult = 0L;
        //long result = instance.factorial(number);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(math.factorial(0) == 1);
        assertTrue(math.factorial(1) == 1);
        assertTrue(math.factorial(5) == 120);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegative() {
        math.factorial(-1);
    }

    /**
     * Test of plus method, of class MathFunc.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        int num1 = 0;
        int num2 = 0;
        MathFunc instance = new MathFunc();
        long expResult = 0L;
        long result = instance.plus(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
