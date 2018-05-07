import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
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

        driver = new ChromeDriver();

//        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("Вероятно вы перетягивали окно в момент разворачивания на весь экран");
        }

        driver.get("https://images.google.com");
        driver.findElement(By.xpath("//a[@aria-label='Поиск по картинке']")).click();
        driver.findElement(By.xpath("//a[text()='Загрузить файл']")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Screenshots\\screenshots1.png");




        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
