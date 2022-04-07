package function_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Gmail_Total {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com/gmail/about/");
        driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Qatester0727@gmail.com");
        driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).click();
        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Tester123!");
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='G-asx T-I-J3 J-J5-Ji']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@selector='unread']")).click();
        List<WebElement> emailUnread = driver.findElements(By.xpath("//div[@class='oZ-jc T-Jo J-J5-Ji T-Jo-Jp']"));
        System.out.println("Emails Unread " + emailUnread.size());


    }

}
