package SeleniumExamples.Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDyanamicCellHandle 
{

	public static void main(String[] args)
	{
ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,2500)");
		
		 String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr [3]//td[2]/following-sibling::td[1]")).getText();
		System.out.println(price);
		
		driver.findElement(By.xpath("//table[@id='productTable']//td[text()='Laptop']/parent::tr/descendant::input")).click();
		
		
					
		}
		
		

}
