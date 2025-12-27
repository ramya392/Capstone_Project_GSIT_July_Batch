package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Kumar\\OneDrive\\Desktop\\jar files\\chromedriver142.exe");
		WebDriver driver= new  ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//verifying placeholder of textbox is Enter an integer
		String attTextbox =driver.findElement(By.id("number")).getAttribute("placeholder");
		System.out.println("Placeholder of textbox is " +attTextbox);
		if (attTextbox.contains("Enter an integer")) {
			System.out.println("Placeholder of the textbox is 'Enter an integer'");
		}
		else {
			System.out.println("Placeholder of the textbox is not 'Enter an integer'");	
		}
		
		//verifying title of the application contains factorial
		String titleApp= driver.getTitle();
		System.out.println("Title of the application is " +titleApp);
		if (titleApp.contains("Factorial")) {
			System.out.println("Title of the application contains 'Factorial'");		
		}
		else {
			System.out.println("Title of the application does not contain 'Factorial'");
		}
		
		//verifying URL of the application contains https
		String urlApp= driver.getCurrentUrl();
		System.out.println("URL of the application is " +urlApp);
		if (titleApp.contains("Factorial")) {
			System.out.println("URL of the application contains 'https'");		
		}
		else {
			System.out.println("URL of the application does not contain 'https'");
		}
		driver.close();


	}

}
