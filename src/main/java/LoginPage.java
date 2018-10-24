import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login")
    WebElement loginButton;

    public void enterEmail(String identifier){
        email.sendKeys(identifier);
    }

public void clickLogingButton(){
    loginButton.click();
}

    public void enterPassword(String pass){
        password.sendKeys(pass);
    }


}
