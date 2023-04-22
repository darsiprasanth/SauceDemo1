package pageObjects;

public interface HomePageElements {
	
String textname="(//*[text()='Swag Labs'])[2]";
	
	String addtocart="//*[@id='add-to-cart-sauce-labs-backpack']";
	String removebtn="//*[@id='remove-sauce-labs-backpack']";
	String cartbtn="//*[@id='shopping_cart_container']";
	String checkoutbtn="//*[@id='checkout']";
	String checkoutinfo="//*[text()='Checkout: Your Information']";
	String fname="//*[@id='first-name']";
	String lname="//*[@id='last-name']";
	String zipcode="//*[@id='postal-code']";
	String continuebtn="//*[@id='continue']";
	String checkoutoverview="//*[text()='Checkout: Overview']";
	String finishbtn="//*[@id='finish']";
	String checkoutcomplete="//*[text()='Thank you for your order!']";
	String backhome="//*[@id='back-to-products']";
	String products="//*[text()='Products']";

}
