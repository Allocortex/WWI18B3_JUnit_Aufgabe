import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	//Aufgabe 1

	private Calculator calc;

	// returns the current result of the calculator instance
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

	@Test
	public void testGetResult()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// given
		calc = new Calculator();
		final Field field = calc.getClass().getDeclaredField("value");
		field.setAccessible(true);
		field.set(calc, 15.5);

		// when
		double actual = calc.getResult();

		// then
		assertEquals(15.5, actual);
	}

	@Test
	public void testAdd() {
		//given
		calc = new Calculator();
		
		// when
		calc.add(1);
		calc.add(7);
		calc.add(8.2);

		// then
		assertEquals(16.2, reflectionGetResult());
	}

	//to be implemented
	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	//to be implemented
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	//to be implemented
	@Test
	public void testDivideBy() {
		fail("Not yet implemented");
	}
	
	//to be implemented
	//hint: the "infinity"-value of a double variable can be accessed via the class-constant "Double.POSITIVE_INFINITY"
	@Test
	public void testDivideByZero() {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	//Aufgabe 2
	/*
	@Test
	public void convert1ToRoman() {
		//when
		
		//then
	}
	
	@Test
	public void convert4ToRoman() {
		//when
		
		//then
	}
	
	@Test
	public void convert5ToRoman() {
		//when
		
		//then
	}
	
	@Test
	public void convert10ToRoman() {
		//when
		
		//then
	}
	
	@Test
	public void convert56ToRoman() {
		//when
		
		//then
	}
	
	@Test
	public void convert127ToRoman() {
		//when
		
		//then
	}
	*/
}