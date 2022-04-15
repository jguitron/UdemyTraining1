package SeleniumFeaturesLatest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Relative_locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditBox = driver.findElement(By.cssSelector("[name= 'name']"));
        System.out.println(  driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
        WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
        //getting text of element that is not attached to an anchor or tag text()!!!!! IMPORTANT
        WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).getText();
        WebElement rbd = driver.findElement(By.id("inclineRadio1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rbd)).getText());


    }
}
