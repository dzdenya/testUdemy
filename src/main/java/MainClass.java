import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
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
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/#accepted-elements");
        WebElement fr = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(fr);
        WebElement link = driver.findElement(By.xpath("//div[@id='draggable-nonvalid']"));
        WebElement link2 = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement link3 = driver.findElement(By.xpath("//div[@id='droppable']"));
//
//        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop2");
//          driver.switchTo().frame("IF1");
//        WebElement link = driver.findElement(By.xpath("//div[@id='div1']"));
////        WebElement link1 = driver.findElement(By.xpath("//div[@id='draggable']"));
//        WebElement link2 = driver.findElement(By.xpath("//div[@id='div2']"));
//
        Actions actions = new Actions(driver);
////        actions.moveToElement(link).build().perform();
//
//        actions.dragAndDrop(link, link3).perform();
        actions.dragAndDrop(link2, link3).perform();
////
        actions.clickAndHold(link).moveToElement(link3).release().build().perform();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
