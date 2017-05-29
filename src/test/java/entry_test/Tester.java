package entry_test;

import static org.junit.Assert.*;
import org.junit.Test;

import calculator.Calculator;

public class Tester {
	@Test
	public void someTest() {
		assertEquals(true, true);
		assertEquals(9, Calculator.add(4, 5));
	}
}
