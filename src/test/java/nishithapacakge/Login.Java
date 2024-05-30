package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.loginWebPages;

public class loginUser extends GenericMethods {
	
	@Test
	
public void signup() throws InterruptedException {
		
		
		GenericMethods genericMethods = new GenericMethods();
		loginWebPages loginUser = PageFactory.initElements(driver, loginWebPages.class);
	    Thread.sleep(5000);
		genericMethods.click(loginUser.Login, "Login");
	    Thread.sleep(3000);
	    
		 // Verify 'Login to your account' is visible
	    GenericMethods.getText(loginUser.visible);
	    System.out.println("Login visible ");
	    
	    //Enter correct email address and password
		genericMethods.input(loginUser.Email, "Nissitha122820@gmail.com", "Email");
		genericMethods.input(loginUser.password,"Admin","password");
		Thread.sleep(3000);
		genericMethods.click(loginUser.login_button, "login_button");
		
		//Verify that 'Logged in as username' is visible
		GenericMethods.getText(loginUser.logged);
		System.out.println(" logged");
		
		genericMethods.click(loginUser.Delete, "Delete");
		GenericMethods.getText(loginUser.Account_Deleted);
		System.out.println("Account_Deleted");
		
		
		
