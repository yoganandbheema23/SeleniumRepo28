package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.searchWebPage;

public class search extends GenericMethods {
@Test

	public void product() throws InterruptedException {
	
	GenericMethods gm= new GenericMethods();
	searchWebPage search = PageFactory.initElements(driver,searchWebPage.class);
	gm.click(search.Product,"Product");
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).isDisplayed());
	WebElement search1=driver.findElement(By.name("search"));
		search1.sendKeys("women");
	Thread.sleep(3000);
	
	gm.click(search.button,"button");
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).isDisplayed());
	
	
	
	
