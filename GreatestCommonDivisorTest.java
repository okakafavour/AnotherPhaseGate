import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest{
	@Test
	public void testGreatestCommonDivisorTest(){
	GreatestCommonDivisor myGCD = new GreatestCommonDivisor();
	assertEquals(2, myGCD.getGreatestCommonDivisor(4,2));
	assertEquals(8, myGCD.getGreatestCommonDivisor(16,24));
	assertEquals(25,myGCD.getGreatestCommonDivisor(25,2525));
	
    }
 }
