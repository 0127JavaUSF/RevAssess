import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MiscTest {
	Misc test;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		test = new Misc();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sumTest() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		Integer result = test.sum(array);
		assertTrue(result.intValue()==6);
	}
	
	@Test
	public void extractDigitTest() {
		ArrayList<Integer> digitList = test.extractDigit(new ArrayList<Integer>(), 123);
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(3);
		testList.add(2);
		testList.add(1);
		System.out.println(digitList);System.out.println(testList);
		assertEquals(digitList,testList);
	}
	
	@Test
	public void testPowerSumTest() {
		//testing 0 , 1, 123
		boolean test1 = (test.testPowerSum(0)==true);
		boolean test2 = (test.testPowerSum(1)==true);
		boolean test3 = (test.testPowerSum(123)==false);
		assertTrue(test1 & test2 & test3);
	}
	

}
