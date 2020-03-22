import static org.junit.Assert.*;

import org.junit.Test;

public class GoldbachParamTest {

	@Test
	public void test() {
		int[] args = { 10, 30, 50, 80, 100 };

		for (int i = 0; i < args.length; i++) {
			try {
				int[] r = MathApp.goldbach(args[i]);
				assertEquals(true, MathApp.isPrime(r[0]));
				assertEquals(true, MathApp.isPrime(r[1]));
				assertEquals(args[i], r[0] + r[1]);
			} catch (Exception e) {

			}
		}
	}

}
