import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage
{

@FindBy (css = ".header_admin")
    WebElement adminButton;

public void goToAdminPanel(){
    adminButton.click();
}



}
