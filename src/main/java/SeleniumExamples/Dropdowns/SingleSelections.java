package SeleniumExamples.Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelections 
{

	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	
	Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='country']")));
	dropdown.selectByVisibleText("Canada");
	
	dropdown.selectByValue("uk");
	
	dropdown.selectByIndex(5);
	
	
	String expected = "india";
	
	boolean found = true;
	
	for(WebElement option :dropdown.getOptions())
	{
		
		if(option.getText().trim().equalsIgnoreCase("india"))
		{
			found = false;
			break;
		}
		
	}
	if(found=true)
	{
		System.out.println(expected +"; " + "Present in the options");
	}
	else
	{
		System.out.println(expected +";" + "Not Present in the options");
	}
	
	Select multi = new Select (driver.findElement(By.xpath("//select[@id=\"colors\"]")));
	
	System.out.println(multi.isMultiple());
	
	
	multi.selectByVisibleText("Blue");
	
	multi.selectByValue("green");
	
	multi.selectByIndex(0);
	
	
	for(WebElement selected :multi.getOptions())
	{
		System.out.println(selected.getText());
	}
	
	multi.deselectByVisibleText("Blue");
	

	}

}
