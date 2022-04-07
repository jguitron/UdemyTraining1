package function_testing;


import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.ir.WhileNode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        //limiting webdriver scope, takes the element of only footer and making that a specific driver
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        for (int i = 1; i <columndriver.findElements(By.tagName("a")).size();i++) {
            String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            //SendKeys is for any keyboard event, such as control and enter
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
            Thread.sleep(5000);

        }
            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator();

            //hasnext is if the next page actually has the next tab
            //next is actually moving to the next tab
          while(it.hasNext())
          {
              driver.switchTo().window(it.next());
              System.out.println(driver.getTitle());
          }


    }
}
