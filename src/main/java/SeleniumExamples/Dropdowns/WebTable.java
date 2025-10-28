package SeleniumExamples.Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{

	public static void main(String[] args)
	{
ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("window.scrollBy(0,1700)");
		
		WebElement table= driver.findElement(By.xpath("//table[@name='BookTable']"));
		
	List <WebElement >rows = table.findElements(By.tagName("tr"));	
	{
			for (WebElement row : rows)
		{
			System.out.println(row.getText());
			}
			
		
		
		}
	
	
	}

}
