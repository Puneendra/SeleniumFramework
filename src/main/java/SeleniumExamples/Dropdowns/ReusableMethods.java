package SeleniumExamples.Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethods
{
	public static WebDriver driver;
	
	
	public static void Radio(String gender)
	{
		WebElement ele = driver.findElement(By.xpath("//label[text() ='"+gender+"']/preceding-sibling::input"));
		if(!ele.isSelected())
		{
			ele.click();
			
		}
		
	}
	
	public static void CheckBox(String box)
	{
		WebElement elem = driver.findElement(By.xpath("//label[text() ='"+box+"']/preceding-sibling::input"));
		if(!elem.isSelected())
		{
			elem.click();
		}
	}
	

	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
//		js.executeScript("window.scrollBy(0,1700)");
//		
//		WebElement table= driver.findElement(By.xpath("//table[@name='BookTable']"));
//		
//		List <WebElement >rows = table.findElements(By.tagName("tr"));
//		{
//			for (WebElement row : rows)
//			{
//				System.out.println(row.getText());
//			}
//			
//			
//			
		//}
		
		
		
		
		Radio("Female");
		
		
		CheckBox("Tuesday");
		CheckBox("Tuesday");
		
		
		
		
		

	}

}
