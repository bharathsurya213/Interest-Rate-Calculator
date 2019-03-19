package testing;

import org.junit.Test;
import org.junit.runner.RunWith;

import testing.Interests.Demo;

import static org.junit.Assert.assertEquals;
@SuppressWarnings("unused")
public class Interests {
	@Test
	public void testInterests()//testing method to check whether both the simple and compound interests are calculated correct or not 
	{
		Demo testing=new Demo();
		assertEquals("Answer",1515,testing.calcSimpleInterest(20202,2.5,3));//checking simple interest is calculated correct or wrong
		assertEquals("Answer",1335,testing.calcCompoundInterest(1200,2,5.4));//checking compound interest is calculated correct or wrong
	}
	
    class Demo{
    	public int calcCompoundInterest(double principle,double rate,double time)//method to calculate compound interest 
    	{
    		double ci=0;
    		ci=principle*(Math.pow((1 + rate / 100), time)); 
    		return (int)ci;
    	}
    	public int calcSimpleInterest(double principle,double rate,double time)//method to calculate simple interest 
    	{
    		double si=0;
    		si=(principle*rate*time)/100;
    		return (int)si;
    	}
    }

}
