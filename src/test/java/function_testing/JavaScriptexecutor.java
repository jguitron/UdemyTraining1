package function_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JavaScriptexecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        JavascriptExecutor Js1 = (JavascriptExecutor) driver;
        Js1.executeScript("window.scroll(0,500)");
        //in console window.scroll is how to find the object
        Thread.sleep(3000);
        //document.
        Js1.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List <WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;

        for (int i = 0;i < values.size();i++)
        {
          sum = sum + Integer.parseInt(values.get(i).getText());

        }
        System.out.println(sum);
        driver.findElement(By.cssSelector(".totalAmount")).getText();
        int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        Assert.assertEquals(sum, total);
    }

}