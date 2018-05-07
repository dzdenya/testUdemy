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

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        WebElement button1 = driver.findElement(By.xpath("//button[@id='myBtn']"));
        driver.switchTo().defaultContent();
        WebElement button2 = driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item topnav-icons fa fa-rotate']"));

        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        System.out.println(button1.isDisplayed());
        driver.switchTo().defaultContent();
        System.out.println(button2.isEnabled());

        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        if (button1.isEnabled()) button1.click();
        driver.switchTo().defaultContent();
        if (button2.isEnabled()) button2.click();

///////////////
        driver.get("http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html");
        WebElement rbutton1 = driver.findElement(By.xpath("//input[@name='agreementjdk-10.0.1-oth-JPR'][1]"));
        WebElement rbutton2 = driver.findElement(By.xpath("//input[@name='agreementjdk-10.0.1-oth-JPR'][2]"));

        System.out.println(rbutton2.isSelected());
        if (!rbutton1.isSelected()) rbutton1.click();

/////////////
        driver.get("https://www.ebay.com/");
        WebElement link1 = driver.findElement(By.xpath("//a[@title='Electronics - Cameras & Photo']"));
        WebElement link2 = driver.findElement(By.xpath("//a[text()='Following']"));

        System.out.println(link1.isDisplayed());
        System.out.println(link2.isDisplayed());

        if (link1.isDisplayed()) link1.click();
        else link2.click();


//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.quit();
    }
}
