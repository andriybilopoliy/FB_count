import driver.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;

public class BaseTest
{
    WebDriver driver;
   protected final String email = ConfigFileReader.GetConfig("email");
   protected final String pass = ConfigFileReader.GetConfig("pass");
   protected final String url = ConfigFileReader.GetConfig("url");

    @BeforeTest (alwaysRun = true)
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", ConfigFileReader.GetConfig("driverPath"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);

//        configFileReader = new ConfigFileReader();
//        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        basePage.navigateTo_BasePage();
    }

    @AfterTest (alwaysRun = true)
        public void TearDown()
        {
            if (driver != null)
            {
                driver.quit();
            }
        }

}
