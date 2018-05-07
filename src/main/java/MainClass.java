import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\testUdemy\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Projects\\testUdemy\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Projects\\testUdemy\\drivers\\MicrosoftWebDriver.exe");
        System.setProperty("phantomjs.binary.path", "C:\\Projects\\testUdemy\\drivers\\phantomjs.exe");

        driver = new PhantomJSDriver();

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
