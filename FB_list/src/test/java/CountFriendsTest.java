import driver.Helper;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class CountFriendsTest extends BaseTest
{
    @Test
    public void FriendsCount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.login(email, pass).openMainPage();
        Helper helper = mainPage.getFriends();
        System.out.println("Res = " + helper.CountFriends());
    }
}
