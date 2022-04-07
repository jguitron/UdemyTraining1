package function_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calander {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.xpath(".//*[@id='travel_date']")).click();

        //while loop will keep executing until it becomes false
        //! is a negation it is a mirror making true to false and false to true

        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }



        List<WebElement> dates = driver.findElements(By.className("day"));
        int count = driver.findElements(By.className("day")).size();
        for (int i = 0; i <count;i++)
        {
           String text = driver.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("27"))
            {
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }
    }
}
