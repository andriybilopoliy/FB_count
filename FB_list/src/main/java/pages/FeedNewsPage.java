package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class FeedNewsPage extends BasePage
{
    WebDriver driver;
    WebDriverWait driverWait;

    @FindBy(css = "._2s25._606w")
    WebElement HomePage;

    public  FeedNewsPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        driverWait = new WebDriverWait(driver, 15);
        driverWait.until(ExpectedConditions.visibilityOf(HomePage));
    }

    public MainPage openMainPage()
    {
        HomePage.click();
        return new MainPage(driver);
    }
}
