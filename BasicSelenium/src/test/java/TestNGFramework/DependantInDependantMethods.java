package TestNGFramework;

import org.testng.annotations.Test;

public class DependantInDependantMethods {
	
	@Test
	public void CreateAddress()
	{
		
		System.out.println("Address is Created Sucessfully");
	}

	@Test(dependsOnMethods = "CreateAddress")
	public void ModifyAddress()
	{
		System.out.println("Address is Modified Sucessfully");
	}

	@Test(dependsOnMethods = "CreateAddress")
	public void DeleteAddress()
	{
		System.out.println("Address is Deleted Sucessfully");
	}

}
