package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks
{
    public static void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for(WebElement link:allLinks)
        {
            String hrefs = link.getAttribute("href");
            URL aobj = new URL(hrefs);

          HttpURLConnection http=   (HttpURLConnection)aobj.openConnection();
          http.connect();

          if(http.getResponseCode()>400)
          {
              System.out.println(hrefs+http.getResponseCode());
          }





        }



    }
}
