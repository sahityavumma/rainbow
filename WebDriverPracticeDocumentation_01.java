package packt.selenium.chap3_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ripon on 11/4/2015.
 */
public class WebDriverPracticeDocumentation_01 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://www.seleniumhq.org";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Projects")).click();
        driver.findElement(By.linkText("Selenium Grid")).click();
        assertEquals("Checking the title Selenium Grid","Selenium Grid", driver.getTitle());
        driver.quit();
    }
}