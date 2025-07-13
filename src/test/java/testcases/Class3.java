package testcases;

import org.testng.annotations.Test;

public class Class3 {
	
	@Test(invocationCount = 4)
	public void invocationCount() {
		
		System.out.println("login");
	}

}
