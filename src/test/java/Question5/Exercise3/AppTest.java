package Question5.Exercise3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Question5.Exercise3.statusClass.Status;

/**
 * Unit test for simple App.
 */
public class AppTest {
//	 A-B-C-D-F-L
	@Test
	public void Route1() {
		double cart = 1000.0;
		int creditCard = 100;
		statusClass.Status status = Status.gold;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

//	 A-B-C-D-E-F-L
	@Test
	public void Route2() {
		double cart = 7000.0;
		int creditCard = 700;
		statusClass.Status status = Status.gold;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

//	 A-B-C-D-E-L
	@Test
	public void Route3() {
		double cart = 9000.0;
		int creditCard = 300;
		statusClass.Status status = Status.gold;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

//	 A-B-C-G-H-F-L
	@Test
	public void Route4() {
		double cart = 1000.0;
		int creditCard = 100;
		statusClass.Status status = Status.silver;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

//	 A-B-C-G-H-J-F-L
	@Test
	public void Route5() {
		double cart = 5000.0;
		int creditCard = 800;
		statusClass.Status status = Status.silver;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

//	 A-B-C-G-H-J-L
	@Test
	public void Route6() {
		double cart = 5000.0;
		int creditCard = 200;
		statusClass.Status status = Status.silver;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

//	 A-B-C-G-I-F-L
	@Test
	public void Route7() {
		double cart = 1000.0;
		int creditCard = 200;
		statusClass.Status status = Status.other;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

//	 A-B-C-G-I-K-F-L
	@Test
	public void Route8() {
		double cart = 3000.0;
		int creditCard = 900;
		statusClass.Status status = Status.other;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

//	 A-B-C-G-I-K-L
	@Test
	public void Route9() {
		double cart = 6700.0;
		int creditCard = 340;
		statusClass.Status status = Status.other;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

}
