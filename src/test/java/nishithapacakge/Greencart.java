package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.GenericMethods;
import webpages.greenCartWebpages;


public class greenCartTestcase extends GenericMethods{
	
	@Test
	public void place_order() throws InterruptedException
	{
		GenericMethods genericMethods=new GenericMethods(); 
		
		//Page object model	(page factorY)
		greenCartWebpages greenPage=PageFactory.initElements
				(driver, greenCartWebpages.class);
		
		//WebElement searchtext=driver.findElement(By.xpath(""));)
		genericMethods.input(greenPage.product_SearchTxt, 
				"ber", "productSearch");
		
		Thread.sleep(5000);
		
		for(WebElement we:greenPage.listOfcartElements)
		{
			we.click();
		}
		
		genericMethods.click(greenPage.cartBtn, "cart buttone");
		
		
		genericMethods.elementToBeClickable(greenPage.proceed_To_Cart_Btn);
		
		genericMethods.click(greenPage.proceed_To_Cart_Btn,"proced_to_car");
		
		genericMethods.input(greenPage.promo_code,"rahulshettyacademy","promocode");
		
		genericMethods.click(greenPage.apply_btn,"applybutton");
		
		Thread.sleep(5000);		
		
		String message=greenPage.success_msg.getText();
		
		System.out.println(message);
	
	}

}
