package NopCommerce;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Test
    public void userShouldAbleToRegisterSuccessfully(){
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
}
