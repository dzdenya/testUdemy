import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\testUdemy\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

//        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();

        driver.get("https://www.utest.com");
        String nameTab = driver.getWindowHandle();

        driver.findElement(By.xpath("//div[@class=\"hamburger\"]/span[2]")).click();
        driver.findElement(By.xpath("//li/a[text()='Help']")).click();

        for (String tab: driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        driver.findElement(By.xpath("//a[text()='Registering for uTest']")).click();

        driver.switchTo().window(nameTab);
        driver.findElement(By.xpath("//a[text()='JOIN UTEST']")).click();


        Actions actions = new Actions(driver);

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.quit();
    }
}
