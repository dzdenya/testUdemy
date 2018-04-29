import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Denys\\IdeaProjects\\testUdemy\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\IdeaProjects\\testUdemy\\drivers\\chromedriver.exe");

        WebDriver driver = new FirefoxDriver();
        WebDriver driver1 = new ChromeDriver();

        driver.get("http://www.google.com");
        driver1.get("http://www.google.com");


    }
}
