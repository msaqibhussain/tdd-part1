

import org.junit.*;

import junit.framework.TestCase;

public class MultiCurrencyTest extends TestCase {

	@Test public void testMultiply(){
		CurrencyUtil cu=new CurrencyUtil();
		Currency twoDollar=new Currency(2.00, "$");
		Currency threeDollar=new Currency(3.00, "$");
		Currency tenDollar=new Currency(10.00, "$");
		Currency twentyDollar=new Currency(20.00, "$");
		Currency sixteenDollar=new Currency(16.00, "$");
		Currency fifteenRupee=new Currency(15.00, "Rs.");
		
		assertTrue(tenDollar.equals(cu.muliply(5, twoDollar)));
		assertTrue(twentyDollar.equals(cu.muliply(10, twoDollar)));
		assertFalse(sixteenDollar.equals(cu.muliply(5, threeDollar)));
		assertFalse(fifteenRupee.equals(cu.muliply(5, threeDollar)));
	}
}
