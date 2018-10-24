import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {


    @FindBy (xpath = "//h1[contains(text(), 'Projekty')]")
    WebElement projektyHeader;

    public void ifHeaderDisplayed(){
        assert projektyHeader.isDisplayed();
    }
}
