package TestNGFramework;

import org.testng.annotations.Test;

public class MultipleTestCasesUsingTestNG {

	@Test(priority=1)
	public void CreateAddress()
	{
		System.out.println("Address is Created Sussfully");
	}

	@Test(priority=0)
	public void modifyAddress()
	{
		System.out.println("Address is Modiefied Sussfully");
	}
	
	@Test(priority=2)
	public void deleteAddress()
	{
		System.out.println("Address is deletedModiefied Sussfully");
	}
}
