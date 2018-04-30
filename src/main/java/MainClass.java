import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Denys\\IdeaProjects\\testUdemy\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://en.wikipedia.org");

        WebElement link = driver.findElement(By.linkText("Log in"));
        WebElement link2 = driver.findElement(By.partialLinkText("Donate"));
        WebElement link3 = driver.findElement(By.name("search"));
        WebElement link4 = driver.findElement(By.className("searchButton"));
        WebElement link5 = driver.findElement(By.id("ca-viewsource"));
        WebElement link6 = driver.findElement(By.tagName("input"));
        WebElement link7 = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton"));
        WebElement link8 = driver.findElement(By.xpath("//div[@id='mw-panel']/div[@id='p-logo']//a"));

        driver.quit();
    }
}
