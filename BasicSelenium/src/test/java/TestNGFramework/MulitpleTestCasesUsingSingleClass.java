package TestNGFramework;

import org.testng.annotations.Test;

// execution takes place as per the characters method
@Test

public class MulitpleTestCasesUsingSingleClass {

	public void CreateAddress()
	{
		System.out.println("Address is Created Sussfully");
	}

	public void ModifyAddress()
	{
		System.out.println("Address is modified Sussfully");
	}

	public void DeleteAddress()
	{
		System.out.println("Address is Deleted Sussfully");
	}


}
