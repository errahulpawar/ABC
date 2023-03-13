package testngExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng1 {
	
@BeforeClass
	public void login() {
		System.out.println("login completed");
		
	}
	
@AfterClass
public void logout() {
	System.out.println("logout completed");
	
}
	
@Test(priority=2)
	public void AddEmp() {
	 System.out.println("Add Emp successfully");
	 
	}
	
@Test(priority=1)
	public void DelEmp() {
	 System.out.println("Delete Emp successfully");
	 
}
}