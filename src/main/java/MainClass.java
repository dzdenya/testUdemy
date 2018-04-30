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
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();

        driver.get("https://github.com/");
        WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']//button"));
        if (button.getText().equals("Sign up for GitHub")){
            System.out.println("Success");
        }else System.out.println("Fail");
//        button.submit();
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();

        driver.get("https://facebook.com/");
        driver.findElement(By.xpath("//label[@id='loginbutton']/input")).submit();


//        driver.quit();
    }
}
