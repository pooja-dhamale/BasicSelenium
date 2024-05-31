package TestNGFramework;

import org.testng.annotations.Test;

public class EnabledorDisabledparticularMethod {
		@Test
		public void CreateAddress()
		{
			
			System.out.println("Address is Created Sucessfully");
		}

		@Test(enabled=false)
		public void ModifyAddress()
		{
			System.out.println("Address is Modified Sucessfully");
		}

		@Test
		public void DeleteAddress()
		{
			System.out.println("Address is Deleted Sucessfully");
		}

	}



