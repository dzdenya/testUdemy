import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\testUdemy\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Projects\\testUdemy\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.opera.driver", "C:\\Projects\\testUdemy\\drivers\\operadriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Projects\\testUdemy\\drivers\\MicrosoftWebDriver.exe");

        driver = new EdgeDriver();

//        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("Вероятно вы перетягивали окно в момент разворачивания на весь экран");
        }

        driver.get("https://images.google.com");
        driver.findElement(By.xpath("//span[@class='gsst_e']")).click();
        driver.findElement(By.xpath("//a[@class='qbtbha qbtbtxt qbclr']")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Screenshots\\screenshots1.png");




        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
