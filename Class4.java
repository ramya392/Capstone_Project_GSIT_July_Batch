package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Kumar\\OneDrive\\Desktop\\jar files\\chromedriver142.exe");
		WebDriver driver= new  ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		
	
		WebDriverWait w = new WebDriverWait(driver, 6);
		
		//click on about link
		driver.findElement(By.xpath("//*[text()='About']")).click();
		
		//verifying number of links are greater than 5
		List<WebElement> lc= w.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("a"), 5));
		if (lc.size()>5) {
			System.out.println("No of links are greater than 5");
			}
		else {
			System.out.println("No of links are not greater than 5");
		}
		
		//printing the link names
		List<WebElement> links = w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));

		
		for (WebElement link2 : links) {
		    System.out.println(link2.getText());
		}
		driver.close();
	}

}
