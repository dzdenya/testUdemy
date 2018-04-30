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
        driver.findElement(By.xpath("//input[@id='searchInput']"))
                .sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver
                .findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value"));
        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();

        driver.get("https://github.com/");
        driver.findElement(By.xpath(".//*[@id='user[login]']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath(".//*[@id='user[password]']")).sendKeys("test7654321");
        WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']//button"));
        if (button.getText().equals("Sign up for GitHub")){
            System.out.println("Success");
        }else System.out.println("Fail");
        button.submit();
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();

        driver.get("https://facebook.com/");
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("test7654321");
        driver.findElement(By.xpath("//label[@id='loginbutton']/input")).submit();


//        driver.quit();
    }
}
