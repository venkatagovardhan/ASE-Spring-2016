import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calculatetest {

	calculate calculation = new calculate();
	int miles = calculation.sum(4);
	int testSum = 6;

	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + miles+ " = " + testSum);
		assertEquals(miles, testSum);
	}

}