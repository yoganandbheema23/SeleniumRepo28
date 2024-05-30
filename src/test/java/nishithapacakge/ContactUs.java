package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.contactUsWebPage;

public class contactUs extends GenericMethods {
@Test
	
	public void contact () throws InterruptedException {
		GenericMethods gm = new GenericMethods();
		contactUsWebPage contactus = PageFactory.initElements(driver, contactUsWebPage.class);
		Thread.sleep(3000);
		gm.click(contactus.Contactus, "Contactus");
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).isDisplayed());
		Thread.sleep(1000);
		gm.input(contactus.Name,"Nissitha","Name");
		Thread.sleep(1000);
		gm.input(contactus.Email, "Nissitha12@gmail.com", "Email");
		Thread.sleep(1000);
		gm.input(contactus.Subject, "Good Friday", "Subject");
		Thread.sleep(1000);
		gm.input(contactus.Message,"May your Good Friday be blessed with the presents of Jesus on your lips, and his never ending grace in your heart","Message");
		Thread.sleep(2000);
		gm.click(contactus.choose,"choose");
		
