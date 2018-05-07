import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
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

        driver.get("https://github.com/");

        System.out.println(driver.findElements(By.xpath("//a[text()='Sing in']")).size());

        if(driver.findElements(By.xpath("//a[text()='Log in']")).size() > 0) System.out.println("Such element is presented");
        else System.out.println("Cannot find such element");



//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.quit();
    }
}
