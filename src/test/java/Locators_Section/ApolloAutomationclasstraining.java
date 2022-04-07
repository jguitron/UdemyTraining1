package Locators_Section;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import javafx.util.Duration;
import com.sun.javafx.css.converters.DurationConverter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApolloAutomationclasstraining {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ashleyfurniture.com/login/?original=%2Faccount%2F");
        driver.findElement(By.id("dwfrm_login_username")).sendKeys("jguitron@ashleyfurniture.com");
        driver.findElement(By.name("dwfrm_login_password")).sendKeys("Tester124!");
        driver.findElement(By.name("dwfrm_login_login")).click();
        System.out.println(driver.findElement(By.cssSelector("div.error-form")).getText());
        driver.findElement(By.linkText("Forgot Password?")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='dwfrm_requestpassword_email']")).sendKeys("pfjaime@yahoo.com");
        driver.findElement(By.xpath("//button[@name='dwfrm_requestpassword_send']")).click();


    }
}

//a = anchor or link to another page (use link text to get into link)
//css selector ....class name -> tagname.classname...id -.tagname#id -> input#inputUsername (if no class or id name) (Tagname[attribue='value]  (button.signinbtn)...input[placeholder='Username']
//x-path  (//tagname[@attribute='value])  //input[@placeholder="name']
//css child items   //tagname[@attribute='value']:nth-child(index)
// driver.findElement(By.xpath("//input[@id='dwfrm_requestpassword_email']")).sendKeys("efs");
//input[@aria-describedby='dwfrm_requestpassword_email-error'])[4]