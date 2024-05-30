package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.subscriptionWebPage;

public class subscription extends GenericMethods {
@Test

public void testcase () throws InterruptedException {

  GenericMethods gm= new GenericMethods();

  subscriptionWebPage sb =PageFactory.initElements(driver, subscriptionWebPage.class);
  
  
  JavascriptExecutor jse=(JavascriptExecutor) driver;
  
     jse.executeScript("window.scroll(0,9500)");
     Thread.sleep(3000);
     System.out.println(driver.findElement(By.xpath("//h2[text()=\"Subscription\"]")).isDisplayed());
     Thread.sleep(3000);
     gm.input(sb.email, "nissitha12@gmail.com", "email");
     Thread.sleep(3000);
     gm.click(sb.arrow, "arrow");
     Thread.sleep(5000);
    
