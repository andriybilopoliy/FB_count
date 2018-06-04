package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class LoginPage extends BasePage
{
   WebDriver driver;

   @FindBy(id = "email")
    WebElement Email;
   @FindBy(id = "pass")
    WebElement Password;
   @FindBy(id = "loginbutton")
    WebElement EnterBtn;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public FeedNewsPage login(String email, String password)
    {
        Email.clear();
        Email.sendKeys(email);
        Password.clear();
        Password.sendKeys(password);
        EnterBtn.click();
        return new FeedNewsPage(driver);
    }

}
