package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.googleWebpages;

public class googleTestcase extends GenericMethods {
	
	@Test
	public void search()
	{
		
		GenericMethods gm=new GenericMethods();		
		//pom pattern
		googleWebpages gwebpages=PageFactory.initElements
				(driver, googleWebpages.class);
		
		gm.input(gwebpages.searchbox, "selenium","searchbox");
