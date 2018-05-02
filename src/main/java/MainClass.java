import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        driver.get("https://www.facebook.com/?stype=lo&jlou=Affqexabs4O44j2LDKMMsugQ5m_zE6e_eMrgLfZU8kqkM4bXFcx1GcvznCYB8rCyZI8Xmz-x2McWvsKoHXYjnreIDT6lklXVUrhJ-45HicniMQ&smuh=32118&lh=Ac9ItPFHrHy_Ek-p");

        selectOption("day","5");
        selectOption("month","8");
        selectOption("year","5");

    }
    public static void selectOption(String listName, String option){
        String listXpath = String.format("//select[@id='%s']", listName);
        String optionXpath = String.format("//select[@id='%s']/option[%s]", listName, option);
        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click();
    }
}