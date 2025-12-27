package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Kumar\\OneDrive\\Desktop\\jar files\\chromedriver142.exe");
		WebDriver driver= new  ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//verifying textbox is displayed
		boolean textboxDisp = driver.findElement(By.id("number")).isDisplayed();
		if (textboxDisp==true) {
			System.out.println("Textbox is displayed");			
		}
		else {
			System.out.println("Textbox is not displayed");
		}
		
		//verifying textbox is enabled
		boolean textboxClickable = driver.findElement(By.id("number")).isEnabled();
		if (textboxClickable==true) {
			System.out.println("Textbox is clickable");			
		}
		else {
			System.out.println("Textbox is not clickable");
		}
		
		//verifying calculate button is displayed
		boolean calculateDisp = driver.findElement(By.xpath("//*[text()='Calculate!']")).isDisplayed();
		if (calculateDisp==true) {
			System.out.println("Calculate button is displayed");			
		}
		else {
			System.out.println("Calculate button is not displayed");
		}
		
		//verifying calculate button is clickable
		boolean calculateClickable = driver.findElement(By.xpath("//*[text()='Calculate!']")).isEnabled();
		if (calculateClickable==true) {
			System.out.println("Calculate button is clickable");			
		}
		else {
			System.out.println("Calculate button is not clickable");
		}
		
		//verifying about link is displayed
		boolean aboutDisp = driver.findElement(By.xpath("//*[text()='About']")).isDisplayed();
		if (aboutDisp==true) {
			System.out.println("About link is displayed");			
		}
		else {
			System.out.println("About link is not displayed");
		}
			
		//verifying about link is clickable
		boolean aboutClickable = driver.findElement(By.xpath("//*[text()='About']")).isEnabled();
		if (aboutClickable==true) {
				System.out.println("About link is clickable");			
		}
		else {
				System.out.println("About link is not clickable");
		}
		
		//verifying terms and conditions link is displayed
		boolean tcDisp = driver.findElement(By.xpath("//*[text()='Terms and Conditions']")).isDisplayed();
		if (tcDisp==true) {
				System.out.println("Terms and conditions link is displayed");			
		}
		else {
				System.out.println("Terms and conditions link is not displayed");
		}
		
		//verifying terms and conditions link is clickable
		boolean tcClickable = driver.findElement(By.xpath("//*[text()='Terms and Conditions']")).isEnabled();
		if (tcClickable==true) {
				System.out.println("Terms and conditions link is clickable");			
		}
		else {
				System.out.println("Terms and conditions link is not clickable");
		}
		
		//verifying privacy link is displayed
		boolean privacyDisp = driver.findElement(By.xpath("//*[text()='Privacy']")).isDisplayed();
		if (privacyDisp==true) {
				System.out.println("Privacy link is displayed");			
		}
		else {
				System.out.println("Privacy link is not displayed");
		}
		
		//verifying privacy link is clickable
		boolean privacyClickable = driver.findElement(By.xpath("//*[text()='Privacy']")).isEnabled();
		if (privacyClickable==true) {
				System.out.println("Privacy link is clickable");			
		}
		else {
				System.out.println("Privacy link is not clickable");
		}	
		driver.close();

	}

}
