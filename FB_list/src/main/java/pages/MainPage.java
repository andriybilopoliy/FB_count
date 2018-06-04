package pages;


import driver.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class MainPage extends BasePage
{
    WebDriver driver;
    WebDriverWait driverWait;

    @FindBy(css = "[data-tab-key=friends]")
    WebElement FriendsBtn;
    Helper helper;



    public MainPage (WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        driverWait = new WebDriverWait(driver, 15);

    }

    public Helper getFriends()
    {
        driverWait.until(ExpectedConditions.visibilityOf(FriendsBtn));
        FriendsBtn.click();
        helper = new Helper(driver);
        return  helper;

    }

}
