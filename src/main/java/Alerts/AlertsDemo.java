package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertsDemo
{
    public static void main(String[] args)
    {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://the-internet.hackerearth.com/javascript_alerts");
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("(//button)[4]")).click();
    driver.switchTo().alert().accept();

        System.out.println(" accepted the alert");;

    driver.findElement(By.xpath("(//button)[5]")).click();
    driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("(//button)[6]")).click();
     Alert alert = driver.switchTo().alert();

        alert.sendKeys("Hello");
        String text  = alert.getText();
        System.out.println(text);
        alert.accept();

    }
}
