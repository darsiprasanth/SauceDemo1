package pageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	
	ElementFetch ele=new ElementFetch();
	public void verifyIfHomePageIsLoaded() {
		
		//Assert.assertEquals(ele.getWebElement("XPATH", HomePageElements.addtocart), "Add to cart");
		WebElement txt= ele.getWebElement("XPATH", HomePageElements.textname);
		if(txt.isDisplayed()) {
			System.out.println("User is in Homepage");
			//driver.close();
		}else {
			System.out.println("Element not found");
		}
		
	}
	
	public void validatingAddToCartBtn() {
		
		WebElement btn=ele.getWebElement("XPATH", HomePageElements.addtocart);
		btn.click();
		
		WebElement remov=ele.getWebElement("XPATH", HomePageElements.removebtn);
		if(remov.isDisplayed()) {
			System.out.println("Add to Cart btn is clicked");
		}else {
			System.out.println("Add to cart btn is not clicked");
		}
	}
	
	public void validatingCartBtn() {
		
		WebElement cart=ele.getWebElement("XPATH", HomePageElements.cartbtn);
		cart.click();
		WebElement checkout=ele.getWebElement("XPATH", HomePageElements.checkoutbtn);
		if(checkout.isDisplayed()) {
			System.out.println("Customer is in Cart Page");
		}else {
			System.out.println("Cart btn not clicked");
		}
	}
	public void validatingCheckoutBtn() {
		
		WebElement checkout=ele.getWebElement("XPATH", HomePageElements.checkoutbtn);
		checkout.click();
		
		WebElement cheoutinfo=ele.getWebElement("XPATH", HomePageElements.checkoutinfo);
		if(cheoutinfo.isDisplayed()) {
			System.out.println("User Checking out the item");
		}else {
			System.out.println("checkout Element is not found");
		}
		
	}
	
	public void validatingCheckoutYourInforPage() throws InterruptedException {
		
		ele.getWebElement("XPATH", HomePageElements.fname).sendKeys("abcd");
		ele.getWebElement("XPATH", HomePageElements.lname).sendKeys("cdfg");
		ele.getWebElement("XPATH", HomePageElements.zipcode).sendKeys("560037");
		Thread.sleep(2000);
		WebElement cont=ele.getWebElement("XPATH", HomePageElements.continuebtn);
		cont.click();
		WebElement checkoveview=ele.getWebElement("XPATH", HomePageElements.checkoutoverview);
		if(checkoveview.isDisplayed()) {
			System.out.println("You are about finish placing your order");
		}else {
			System.out.println("checkoverview not displayed");
		}
	}
	public void validatingFinishbtn() {
		
		ele.getWebElement("XPATH", HomePageElements.finishbtn).click();
		WebElement finish=ele.getWebElement("XPATH", HomePageElements.checkoutcomplete);
		if(finish.isDisplayed()) {
			System.out.println("Yay! your order is placed......:)");
		}else {
			System.out.println("Order not placed");
		}
	}
	
	public void backToHomePage() {
		
		ele.getWebElement("XPATH", HomePageElements.backhome).click();
		WebElement prod=ele.getWebElement("XPATH", HomePageElements.products);
		if(prod.isDisplayed()) {
			System.out.println("User headed back to Homepage");
		}else {
			System.out.println("An Error occured while returning to Homepage");
		}
		
	}
	public void validatingRemoveBtn() {
		
		WebElement btn=ele.getWebElement("XPATH", HomePageElements.addtocart);
		btn.click();
		
		WebElement rem=ele.getWebElement("XPATH", HomePageElements.removebtn);
		rem.click();
		
		
		
		
	}

}
