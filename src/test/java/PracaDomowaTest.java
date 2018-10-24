import org.junit.Test;

public class PracaDomowaTest extends BasicTest {

    @Test
    public void runHomeworkTest() {
        loginPage.enterEmail(ADMIN_LOGIN);
        loginPage.enterPassword(ADMIN_PASSWORD);
        loginPage.clickLogingButton();
        mainPage.goToAdminPanel();
        adminPage.ifHeaderDisplayed();

    }


}
