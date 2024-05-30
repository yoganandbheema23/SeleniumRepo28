package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.cartWebPage;

public class cartVerify extends GenericMethods {
	@Test
	
	public void cart() {
		
		GenericMethods un= new GenericMethods ();
		
		cartWebPage cartVerify =PageFactory.initElements(driver,cartWebPage.class);
		
		un.click(cartVerify.view_product,"view_product");
		
