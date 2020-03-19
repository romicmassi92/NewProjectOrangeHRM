package NopCommerce;

import org.openqa.selenium.By;

import javax.rmi.CORBA.Util;

public class HomePage extends Utils {

    private By _registerLink =By.linkText("Register");

    public void clickOnRegisterButton() {clickOnElement(_registerLink);
    }
}
