package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Kumar\\OneDrive\\Desktop\\jar files\\chromedriver142.exe");
		WebDriver driver= new  ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("number")).sendKeys("4");
		driver.findElement(By.xpath("//*[text()='Calculate!']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("number")).sendKeys("5");
		driver.findElement(By.xpath("//*[text()='Calculate!']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("number")).sendKeys("6");
		driver.findElement(By.xpath("//*[text()='Calculate!']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("number")).sendKeys("7");
		driver.findElement(By.xpath("//*[text()='Calculate!']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("number")).sendKeys("8");
		driver.findElement(By.xpath("//*[text()='Calculate!']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("number")).sendKeys("9");
		driver.findElement(By.xpath("//*[text()='Calculate!']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("number")).sendKeys("10");
		driver.findElement(By.xpath("//*[text()='Calculate!']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	    
	}

	}


