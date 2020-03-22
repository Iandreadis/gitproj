import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class PrimesParamTest {

	@Parameter(0)
	public int n;
	@Parameter(1)
	public boolean r;

	@Parameters
	public static Collection<Object[]> data() {

		Object[][] data = new Object[][] { { 7, true }, { 15, false }, { 32, false }, { 61, true } };
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		assertEquals("Result", r, MathApp.isPrime(n));
	}

}
