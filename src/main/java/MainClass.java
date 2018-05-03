import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\testUdemy\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();

        driver.get("https://www.moyo.ua/telecommunication/smart/apple/");


        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='brands_filter']//div[@class='filter_item']"));
        if (checkboxes.size() == 20) System.out.println("okay");
        else System.out.println("fail");

        for (WebElement checkbox:checkboxes) {
            checkbox.click();
        }
    }
}