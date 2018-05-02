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


//        driver.get("http://rozetka.com.ua");
//        driver.get("https://bt.rozetka.com.ua/washing_machines/c80124/filter/producer=bosch,candy;33119=40879/");
        driver.get("https://bt.rozetka.com.ua/washing_machines/c80124/filter/");

//        driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/all-categories-goods/']")).click();

//        driver.findElement(By.xpath("//a[@href='https://bt.rozetka.com.ua/washing_machines/c80124/']")).click();

//        driver.findElement(By.xpath("//a[text()='Полногабаритные']")).click();

//                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(rbXpath +"/../../../input")));
//        if (!driver.findElement(By.xpath("//i[@class='filter-parametrs-i-l-i-default-title'][contains(text(),'Bosch')]/../../../input")).isSelected()) {
//            driver.findElement(By.xpath("//i[@class='filter-parametrs-i-l-i-default-title'][contains(text(),'Bosch')]")).click();
//        }

        selectCheckBox("Bosch");
        selectCheckBox("Bosch");
        selectCheckBox("Candy");
        selectCheckBox("Beko");
        selectCheckBox("Bosch");
        deselectCheckBox("Candy");
        
//        driver.quit();
    }

    public static void selectCheckBox(String name){
        String rbXpath = "//i[@class='filter-parametrs-i-l-i-default-title'][contains(text(),'%s')]";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(rbXpath, name) +"/../../../input")));
        if (!driver.findElement(By.xpath(String.format(rbXpath, name) +"/../../../input")).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath, name))).click();
    }
    public static void deselectCheckBox(String name){
        String rbXpath = "//i[@class='filter-parametrs-i-l-i-default-title'][contains(text(),'%s')]";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(rbXpath, name) +"/../../../input")));
        if (driver.findElement(By.xpath(String.format(rbXpath, name) +"/../../../input")).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath, name))).click();
    }
}