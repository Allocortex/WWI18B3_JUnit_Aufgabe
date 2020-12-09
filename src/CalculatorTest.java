import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	// Aufgabe 1

	private Calculator calc;

	// helper method: returns the current result of the calculator instance
	private double reflectionGetResult() {
		Field field;
		try {
			field = calc.getClass().getDeclaredField("value");
			field.setAccessible(true);
			return (double) field.get(calc);
		} catch (Exception e) {
			return 0.0;
		}
	}

	// helper method: sets needed value to the calculator instance
	private void reflectionSetValue(double value) {
		Field field;
		try {
			field = calc.getClass().getDeclaredField("value");
			field.setAccessible(true);
			field.set(calc, value);
		} catch (Exception e) {
			// ignore
		}
	}

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	// why does this method fail?
	@Test
	public void testGetResult() {
		// given
		calc = new Calculator();
		reflectionSetValue(15.5);

		// when
		double actual = calc.getResult();

		// then
		assertEquals(15.5, actual);
	}

	@Test
	public void testAdd() {
		// given
		calc = new Calculator();

		// when
		calc.add(1);
		calc.add(7);
		calc.add(8.2);

		// then
		assertEquals(16.2, reflectionGetResult());
	}

	// to be implemented
	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	// to be implemented
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	// to be implemented
	@Test
	public void testDivideBy() {
		fail("Not yet implemented");
	}

	// to be implemented
	// hint: the "infinity"-value of a double variable can be accessed via the
	// class-constant "Double.POSITIVE_INFINITY"
	@Test
	public void testDivideByZero() {
		fail("Not yet implemented");
	}

	// Aufgabe 2
	//implement test-methods for the convertNumeralToRoman method.
	//please make sure to write enough tests to test all the different types of roman "numbers".
	//-> at least 6 Tests. Follow the given-when-then pattern.
	//example test-name "convert4ToRoman" -> would expect the input "4" and the output "IV".
	
}