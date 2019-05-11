import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MyCalculatorTest{
	@Test
	public void testAdd() {
		MyCalculator cal = new MyCalculator();
		assertEquals(17, cal.Add(8,9));
		assertEquals(-13, cal.Add(-23,10));
	}
	@Test
	public void testMultiply() {
		MyCalculator cal = new MyCalculator();
		assertEquals(65, cal.Multiply(5,13));
		assertEquals(36, cal.Multiply(-12,-3));
		assertEquals(-16, cal.Multiply(-4,4));
	}
	@Test
	public void testDivide() {
		MyCalculator cal = new MyCalculator();
		assertEquals(1.5, cal.Divide(3,2));
		assertEquals(-5, cal.Divide(10,-2));
		Assertions.assertThrows(ArithmeticException.class, () -> cal.Divide(5, 0));
	}
}