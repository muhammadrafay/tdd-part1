import static org.junit.Assert.*;

import org.junit.Test;


public class FrancTest {
	////Chapter 5
	@Test
	public void testFrancMultiplication() {
		Franc five= new Franc(5);
		assertEquals(new Franc(10), five.times1(2));
		assertEquals(new Franc(15), five.times1(3));
		assertTrue(new Franc(5).equals(new Franc(5))); //case true
		assertTrue(new Franc(10).equals(five.times1(2))); //case true		
		}
}
