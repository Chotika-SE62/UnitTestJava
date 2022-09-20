import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void testAddNumber() {
		//บวก
		Calculator c1 = new Calculator();
		assertEquals(30,c1.add(10, 20));
		//System.out.println("Test");
	}
	
	@Test
	void testDivideNumber() {
		//หาร
		Calculator c2 = new Calculator();
		assertEquals(10,c2.divide(20, 2));
		//System.out.println("Test");
	}
	
	@Test
	void testDivideNumberByZero() {
		Calculator c3 = new Calculator();
		assertEquals(0,c3.divide(20, 0));
	}
	
	void testMatchNumber() {
		Calculator c4 = new Calculator();
		assertTrue(c4.match(5, 5));
	}
	
	void testNotMatchNumber() {
		Calculator c5 = new Calculator();
		assertFalse(c5.match(8, 5));
	}


}
