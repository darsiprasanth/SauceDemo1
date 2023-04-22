package pageEvents;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch ele=new ElementFetch();
	public void loginPage() {
		
		ele.getWebElement("XPATH", LoginPageElements.usernameField).sendKeys("standard_user");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("secret_sauce");
		ele.getWebElement("XPATH", LoginPageElements.loginButton).click();
	}

}
