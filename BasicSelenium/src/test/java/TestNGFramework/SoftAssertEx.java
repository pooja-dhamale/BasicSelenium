package TestNGFramework;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(false, false);
		System.out.println("Step3");
		System.out.println("Step4");
		System.out.println("Step5");
		soft.assertAll();
	}
	
	public void m2()
	{
		
		String expected="Pooja";
		String actual="pooja";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		soft.assertAll();
	}

}
