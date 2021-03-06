import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;

public class Web_elements_setup {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        Map <String, Object> coordinates = new HashMap<String, Object>();

        coordinates.put("latitude", 40);
        coordinates.put("longitude", 3);
        coordinates.put("accuracy", 1);

        driver.executeCdpCommand("Emulation.SetGeolocationOverride", coordinates);
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("netlifx", Keys.ENTER);
        driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
        String title = driver.findElement(By.cssSelector(".our-story-card-title")).getText();
        System.out.println(title);


    }
}
