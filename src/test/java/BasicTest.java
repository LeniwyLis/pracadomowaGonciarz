import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class BasicTest {
    WebDriver driver;
    String ADMIN_LOGIN = "administrator@testarena.pl";
    String ADMIN_PASSWORD = "sumXQQ72$L";
    String baseURL = "http://demo.testarena.pl";
    LoginPage loginPage;
    AdminPage adminPage;
    MainPage mainPage;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        adminPage = PageFactory.initElements(driver, AdminPage.class);
        driver.get(baseURL);

    }

    @After
    public void cleanUp(){
        driver.quit();
    }
}