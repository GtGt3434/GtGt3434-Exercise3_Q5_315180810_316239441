package Question5.Exercise3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Question5.Exercise3.StatusClass.Status;

/**
 * Unit test for simple App. test
 */
public class AppTest {

	/**
	 * Test case for Route 1: A-B-C-D-F-L
	 * 
	 * This test verifies that a purchase with a cart total of 1000.0, credit rating
	 * of 100, and gold status is approved.
	 */
	@Test
	public void Route1() {
		double cart = 1000.0;
		int creditCard = 100;
		StatusClass.Status status = Status.gold;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	/**
	 * Test case for Route 2: A-B-C-D-E-F-L
	 * 
	 * This test verifies that a purchase with a cart total of 7000.0, credit rating
	 * of 700, and gold status is approved.
	 */
	@Test
	public void Route2() {
		double cart = 7000.0;
		int creditCard = 700;
		StatusClass.Status status = Status.gold;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	/**
	 * Test case for Route 3: A-B-C-D-E-L
	 * 
	 * This test verifies that a purchase with a cart total of 9000.0, credit rating
	 * of 300, and gold status is not approved.
	 */
	@Test
	public void Route3() {
		double cart = 9000.0;
		int creditCard = 300;
		StatusClass.Status status = Status.gold;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	/**
	 * Test case for Route 4: A-B-C-G-H-F-L
	 * 
	 * This test verifies that a purchase with a cart total of 1000.0, credit rating
	 * of 100, and silver status is approved.
	 */
	@Test
	public void Route4() {
		double cart = 1000.0;
		int creditCard = 100;
		StatusClass.Status status = Status.silver;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	/**
	 * Test case for Route 5: A-B-C-G-H-J-F-L
	 * 
	 * This test verifies that a purchase with a cart total of 5000.0, credit rating
	 * of 800, and silver status is approved.
	 */
	@Test
	public void Route5() {
		double cart = 5000.0;
		int creditCard = 800;
		StatusClass.Status status = Status.silver;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	/**
	 * Test case for Route 6: A-B-C-G-H-J-L
	 * 
	 * This test verifies that a purchase with a cart total of 5000.0, credit rating
	 * of 200, and silver status is not approved.
	 */
	@Test
	public void Route6() {
		double cart = 5000.0;
		int creditCard = 200;
		StatusClass.Status status = Status.silver;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	/**
	 * Test case for Route 7: A-B-C-G-I-F-L
	 * 
	 * This test verifies that a purchase with a cart total of 1000.0, credit rating
	 * of 200, and other status is approved.
	 */
	@Test
	public void Route7() {
		double cart = 1000.0;
		int creditCard = 200;
		StatusClass.Status status = Status.other;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	/**
	 * Test case for Route 8: A-B-C-G-I-K-F-L
	 * 
	 * This test verifies that a purchase with a cart total of 3000.0, credit rating
	 * of 900, and other status is approved.
	 */
	@Test
	public void Route8() {
		double cart = 3000.0;
		int creditCard = 900;
		StatusClass.Status status = Status.other;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	/**
	 * Test case for Route 9: A-B-C-G-I-K-L
	 * 
	 * This test verifies that a purchase with a cart total of 6700.0, credit rating
	 * of 340, and other status is not approved.
	 */
	@Test
	public void Route9() {
		double cart = 6700.0;
		int creditCard = 340;
		StatusClass.Status status = Status.other;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

}
