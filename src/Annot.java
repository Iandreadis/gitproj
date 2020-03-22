import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annot {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@Before
	public void before() {
		System.out.println("Before method");
	}
	
	@After
	public void after() {
		System.out.println("After method");
	}
	
	@Test
	public void test1() {
		System.out.println("Running test 1");
	}

	@Test
	public void test2() {
		System.out.println("Running test 2");
	}
}
