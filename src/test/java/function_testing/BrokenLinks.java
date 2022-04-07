package function_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

        List<WebElement> links = driver.findElements(By.cssSelector("Li[class='gf-li'] a "));
        SoftAssert a = new SoftAssert();
        for (WebElement link:links)
        {
            HttpURLConnection conn = (HttpURLConnection )new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);
            a.assertTrue(respCode < 400,"The link with Text" + link.getText()+"is broken with code"+respCode);

        }
        a.assertAll();

    }
}
