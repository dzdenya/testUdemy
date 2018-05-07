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

        driver.get("http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html?ssSourceSiteId=otnpt");
        String nameWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='Oracle Binary Code License Agreement for Java SE']")).click();

        for( String windowHandle:driver.getWindowHandles()){    //переключаемся в последнее открытое окно
            driver.switchTo().window(windowHandle);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"u02menulink\"]/div[1]"))).build().perform();
        driver.findElement(By.xpath("//*[@id=\"u02mmenu\"]/div/ul/li[2]/a")).click();

        driver.switchTo().window(nameWindow);
        driver.findElement(By.xpath("//span[text()=\"Overview\"]")).click();

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.quit();
    }
}
