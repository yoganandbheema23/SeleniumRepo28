package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.verifyAllWebPage;

public class verifyAll  extends GenericMethods{
@Test 

public void eight() throws InterruptedException {
	
	GenericMethods gm= new GenericMethods();
	verifyAllWebPage verifyAll = PageFactory.initElements(driver,verifyAllWebPage.class);
	gm.click(verifyAll.Product,"Product");
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).isDisplayed());
	Thread.sleep(3000);
	gm.click(verifyAll.view_product, "view_product");
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//h2[text()=\"Blue Top\"]")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b")).isDisplayed());
	
}
