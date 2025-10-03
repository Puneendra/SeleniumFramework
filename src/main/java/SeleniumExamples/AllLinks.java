package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllLinks
{
    public static void main(String[] args)
    {
ChromeDriver driver = new ChromeDriver();

driver.get("https://www.flipkart.com/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println(allLinks.size());

for(WebElement link :allLinks)
{
    if(!link.getText().isEmpty())
    {
        System.out.println(link.getText());
    }
}
/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a"))));
driver.findElement(By.xpath("//a")).click();*/

    }

}
