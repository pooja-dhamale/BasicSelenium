package TestNGFramework;

import org.testng.Assert;

public class HardSetEx {

	
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		
		Assert.assertEquals(true, true);
		System.out.println("Step3");
		System.out.println("Step4");
		System.out.println("Step5");
	}
	
	public void m2()
	{
		
		String expected="Pooja";
		String actual="pooja";
		
		Assert.assertEquals(actual, expected);
	}
}
