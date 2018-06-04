package driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Helper {
    @FindBys(
            {@FindBy(css = "._698")}
    )
    private List<WebElement> friends;
    private Actions actions;
    private WebDriverWait driverWait;
    private WebDriver driver;

    public Helper(WebDriver driver) {
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
        this.driver = driver;
        driverWait = new WebDriverWait(driver, 15);
        driverWait.until(ExpectedConditions.visibilityOfAllElements(friends));
    }

    public void ScrollTo(WebElement element) throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
       driverWait.until(ExpectedConditions.visibilityOfAllElements(friends));

    }

    public int CountFriends() throws InterruptedException {
        ScrollTo(friends.get(friends.size() - 1));
        int CountFriends = friends.size();
        while (true) {
            ScrollTo(friends.get(friends.size() - 1));
            if (CountFriends == friends.size()) {
                break;
            }
            CountFriends = friends.size();
        }
        return friends.size();
    }
}
