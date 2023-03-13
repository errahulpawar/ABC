package testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_WB_testng {
	
	WebDriver driver;
	
	@BeforeClass 
	
	public void startUp() {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
	}
	
	@AfterClass
	
	public void tearDown() {
		
		driver.close();
	}
	
	@Test 
	
	public void tc001 () throws Exception {
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		
	    System.out.println("login completed");
	    
	    Reporter.log("login completed");
	    
	    Reporter.log(driver.getTitle());
	    
	    driver.findElement(By.linkText("Logout")).click();
	    
	    Reporter.log("logout completed");
	    
	    
	}

}
