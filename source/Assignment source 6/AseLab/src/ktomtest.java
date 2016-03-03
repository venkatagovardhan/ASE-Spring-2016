

	import static org.junit.Assert.assertEquals;

import org.junit.Test;

	public class ktomtest {

		ktomunit calculation = new ktomunit();
		int kilometers = calculation.sum(4);
		int testSum = 2;

		@Test
		public void testSum() {
			System.out.println("@Test sum(): " + kilometers+ " = " + testSum);
			assertEquals(kilometers, testSum);
		}

	}