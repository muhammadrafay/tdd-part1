import static org.junit.Assert.*;

import org.junit.Test;


public class TestCases {
	@Test
	public void testMultiplication() {
		////*************************////
		////**********Chap1**********////
		////*************************////
		Dollar five= new Dollar(5);
		//five.times(2); //5*2=10
		//assertEquals(10, five.amount); 
		
		////*************************////
		////**********Chap2**********////
		////*************************////
		
		//value of amount changes test fails
		/*
		five.times(2); //5*2=10
		five.times(3); //10*3=30
		assertEquals(15, five.amount); // fails
		assertEquals(30, five.amount); // passes
		*/
		
		////making another object does not change the value of amount in Dollar five object
		Dollar product= five.timesReturnDollar(2); // 5*2=10 returns object
		assertEquals(10, product.amount); 
		product= five.timesReturnDollar(3); //5*3=15 returns object 
		assertEquals(15, product.amount);
		}
}
