import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class GoldbachTest {

	@Test
	public void testOne() {

		try {
			int n = 70;
			int[] r = MathApp.goldbach(n);
			assertEquals(false, MathApp.isPrime(r[0]));
			assertEquals(false, MathApp.isPrime(r[1]));
			assertEquals(n, r[0] + r[1]);
		} catch (Exception e) {

		}
	}

	@Test
	public void testSeq() {

		int max = 100;
		for (int n = 4; n <= max; n += 2)
			try {
				int[] r = MathApp.goldbach(n);
				assertEquals(true, MathApp.isPrime(r[0]));
				assertEquals(true, MathApp.isPrime(r[1]));
				assertEquals(n, r[0] + r[1]);
			} catch (Exception e) {

			}
	}

	@Test(expected = Exception.class)
	public void testError() throws Exception {
		MathApp.goldbach(-10);
	}

	@Test(timeout = 100)
	public void TestPerf() {
		try {
			int[] r = MathApp.goldbach(500);
		} catch (Exception e) {

		}
	}

}
