import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import utills.Config;


import java.util.Properties;

public abstract class BaseTest {
    public WebDriver driver;
    protected final Properties config = Config.loadProperties("src/main/resources/test.properties");

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }
}
