package testngExamples;

import org.testng.annotations.Test;

public class Exp_testng {
	
	@Test // Test is equal to 1 testcase/test scenario in report
	
	public void login() {
		System.out.println("login completed");
		
	}
	@Test
	public void logout() {
		System.out.println("logout completed");
	}

}
