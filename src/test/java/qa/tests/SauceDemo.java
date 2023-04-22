package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class SauceDemo extends BaseTest{
	
	ElementFetch ele= new ElementFetch();
	HomePageEvents homepage=new HomePageEvents();
	LoginPageEvents loginpage=new LoginPageEvents();
	
  @Test
  public void LoginPageValidation() throws InterruptedException {
	  
	  loginpage.loginPage();
	  homepage.verifyIfHomePageIsLoaded();
	  homepage.validatingAddToCartBtn();
	  homepage.validatingCartBtn();
	  homepage.validatingCheckoutBtn();
	  homepage.validatingCheckoutYourInforPage();
	  homepage.validatingFinishbtn();
	  homepage.backToHomePage();
	  homepage.validatingRemoveBtn();
	  //driver.close();
  }

}
