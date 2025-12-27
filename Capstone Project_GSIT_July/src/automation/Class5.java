package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class5 
{
	//Add one scenario to automate one of the detected bug
	//After clicking the Calculate button with a negative integer, the application shows no output.
	//Expected Output: It should display a proper validation message."
	
	WebDriver driver;
	
	
	public static void main()throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Kumar\\OneDrive\\Desktop\\jar files\\chromedriver142.exe");
		WebDriver driver= new  ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	
	
	
		int num=-12;
		driver.findElement(By.id("number")).sendKeys(String.valueOf(num));
    	driver.findElement(By.id("getFactorial")).click();
    	Thread.sleep(2000);
			
	    String actualResult = driver.findElement(By.xpath("//p[@class='text-center top-space-20']")).getText();
	    System.out.println("Actual Result: " +actualResult);
	    
	    if(num>=0)
	    {
	    	long f=1;
			for(int i=1;i<=num;i++)
			{
				f=f*i;
			}
	    	  String expectedResult = "The factorial of " + num + " is: " +f;
	    	  Assert.assertEquals(actualResult,expectedResult,"validation failed for positive number!" );
	    	  
	    	  System.out.println("Expected Result: " +expectedResult);
	    }
	    else
	    {
	    	String expectedResult = "Enter the valid number"; 
	    	System.out.println("Expected Result: " +expectedResult);
            Assert.assertEquals(actualResult,expectedResult, "validation failed for negative number!(BUG)");
            
           
	    }	
	    
	   
	
	
		Thread.sleep(2000);
		driver.close();
	}
	

	
}