

public class XbonacciTest {
    private Xbonacci variabonacci;

    public void setUp() throws Exception {
        variabonacci = new Xbonacci();
    }

    public void tearDown() throws Exception {
        variabonacci = null;
    }

    public void test111() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10));
    }

    public void test001() {
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10));
    }

    public void test011() {
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10));
    }

    public void testSize0() {
        assertArrayEquals(new double []{}, variabonacci.tribonacci(new double []{0,1,1},0));
    }

    public void testSize1() {
        assertArrayEquals(new double []{0}, variabonacci.tribonacci(new double []{0,1,1},1));
    }

    public void testSize2() {
        assertArrayEquals(new double []{0,1}, variabonacci.tribonacci(new double []{0,1,1},2));
    }

    public void testSize3() {
        assertArrayEquals(new double []{0,1,1}, variabonacci.tribonacci(new double []{0,1,1},3));
    }

    public void testNonIntegers() {
        assertArrayEquals(new double []{0,0.5,1,1.5}, variabonacci.tribonacci(new double []{0,0.5,1},4));
    }

    private void assertArrayEquals(double []expecteds, double[] actuals) {
        for(int i = 0; i < actuals.length; i++)
            assertEquals(expecteds[i], actuals[i], 1e-10);
    }
}