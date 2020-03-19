package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import static java.lang.Thread.sleep;

public class RegistrationPage extends Utils{
    private By _firstName=By.id("FirstName");
    private By _lastName=By.id("LastName");
    private By _email=By.id("Email");
    private By _password=By.id("Password");
    private By _confirmPassword=By.id("ConfirmPassword");
    private By _registerButton=By.id("register-button");
    private String firstName = "Romic";
    private String lastName = "Masih";

    private static String timestamp=timeStamp();

    public void verifyUserIsOnRegistrationPage(){assertURL ("register");}

    public void userEnterRegistrationDetails(){
        waitForClickable(_firstName,30);
        explicitWait(30);
        enterText(_firstName, firstName);
        enterText(_lastName, lastName);
        enterText(_email, "romic.massi+"+timestamp+"@gmail.com");
        enterText(_password, "Little@one");
        enterText(_confirmPassword, "Little@one");
        clickOnElement(_registerButton);
    }

    public void verifyUserIsOnRegisterPage() {
        assertURL("register");
        timeDelay(2);
    }

}
