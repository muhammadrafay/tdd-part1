import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {
	@Test
	public void testMultiplicationChap1() {
		// //*************************////
		// //**********Chap1**********////
		// //*************************////
		Dollar five = new Dollar(5);
		 five.times(2); //5*2=10
		 assertEquals(10, five.amount);
	}
	
	@Test
	public void testMultiplicationChap2() {
		// //*************************////
		// //**********Chap2**********////
		// //*************************////
		Dollar five = new Dollar(5);
		// value of amount changes test fails
		/*
		 * five.times(2); //5*2=10 five.times(3); //10*3=30 assertEquals(15,
		 * five.amount); // fails assertEquals(30, five.amount); // passes
		 */

		// //making another object does not change the value of amount in Dollar
		// five object
		Dollar product = five.timesReturnDollar(2); // 5*2=10 returns object
		assertEquals(10, product.amount);
		product = five.timesReturnDollar(3); // 5*3=15 returns object
		assertEquals(15, product.amount);
	}

	@Test
	public void testEqualityChap3() {
		//objects as values
		assertTrue(new Dollar(5).equals(new Dollar(5))); //case true
		assertFalse(new Dollar(5).equals(new Dollar(6))); // case false
	}
	
	@Test
	public void testMultiplicationChap4() {
		Dollar five= new Dollar(5);
//		Dollar product= five.times(2);
//		assertEquals(10, product.amount);
//		product= five.times(3);
//		assertEquals(15, product.amount);
//		
		////rewrite for objects 
//		assertEquals(new Dollar(10), product);
//		product= five.times(3);
//		assertEquals(new Dollar(15), product);
		
		////no need to create temp obj
		assertEquals(new Dollar(10), five.timesReturnDollar(2));
		assertEquals(new Dollar(15), five.timesReturnDollar(3));
		}
}
