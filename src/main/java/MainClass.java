import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Denys\\IdeaProjects\\testUdemy\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().setSize(new Dimension(1600,500));

        driver.get("http://google.com");
        driver.get("http://seleniumhq.org");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }
}
