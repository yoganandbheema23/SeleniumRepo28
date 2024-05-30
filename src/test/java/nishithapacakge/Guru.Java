package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;

import webpages.guruWebpage;

public class guruLoginTestcase extends GenericMethods {

	@Test
	public void guruLogin() {
		
		GenericMethods gm=new GenericMethods();	
		
		//pom pattern
		guruWebpage gwebpages=PageFactory.initElements
				(driver, guruWebpage.class);
		
		//data is getting from the properties file	(ORM)	
		String userID=gm.readValidations("userid");
		String userPWD=gm.readValidations("password");
		
		gm.input(gwebpages.userId,userID,"useridtextbox");
		gm.input(gwebpages.password,userPWD,"passwordtextbox");
		gm.click(gwebpages.loginButton,"loginButton");
