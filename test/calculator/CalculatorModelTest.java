package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorModelTest {

	protected CalculatorModel cm;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cm = new CalculatorModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddTwoNumbers() {
		cm.addTwoNumbers(4, 6);
		int result = cm.getCalculationValue();
		assertTrue(result == 10);
		cm.addTwoNumbers(6, 10);
		result = cm.getCalculationValue();
		assertTrue(result == 16);
	}

}
