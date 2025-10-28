package SeleniumExamples.Waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		
		
		driver = new ChromeDriver();
		
		driver.get(" https://testautomationpractice.blogspot.com/");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	
	driver.findElement(By.xpath("//input[@id='name']"));
	
	
	
	WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(2000));
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@name=\"start\"]"))));
	
	
	driver.findElement(By.xpath("//button[@name=\"start\"]")).click();
	
	
	
	FluentWait <WebDriver> fluentwait = new FluentWait<>(driver)
			//Wait <WebDriver> fluentwait = new FluentWait<>(driver)
			
	.withTimeout(Duration.ofSeconds(2000))
	.pollingEvery(Duration.ofSeconds(20));
	
	WebElement element = wait.until(n->n.findElement(By.xpath(null)));
	
	element.click();
	
	
	
	
	
	

	}

}



//FluentWait<WebDriver> fluentwait = new FluentWait<>(driver);



