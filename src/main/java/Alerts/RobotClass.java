package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RobotClass
{
    public static void main(String[] args) throws AWTException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.hackerearth.com/upload");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//input[@id='file-upload']")).click();
        StringSelection stringSelection = new StringSelection("C:\\Users\\v-psamana\\OneDrive - Microsoft\\Desktop\\2022WA15520.pdf");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);




    }
}
