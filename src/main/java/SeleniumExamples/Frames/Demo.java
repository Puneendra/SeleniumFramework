package SeleniumExamples.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.hackerearth.com/nested_frames");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.switchTo().frame(4);
		
		//driver.switchTo().frame("frame-right");
		
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

	}

}
