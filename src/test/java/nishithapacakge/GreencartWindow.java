package testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import functionalLibs.ResuableFun;
import utilities.GenericMethods;
import webpages.greenCartWebpages;

public class greenCartWindows extends GenericMethods{
	
	@Test
	public void test() throws InterruptedException
	{
		
		ResuableFun ResFun=new ResuableFun();
		GenericMethods genericMethods=new GenericMethods();   
		//Page object model	(page factorY)
		greenCartWebpages greenPage=PageFactory.initElements(driver, greenCartWebpages.class);
		
		
		String parent_win_Id=driver.getWindowHandle();
		
		System.out.println("Parent Window id:"+ parent_win_Id);
		
		genericMethods.click(greenPage.top_deals,"top_deals");
		
		
		Set<String> windows_list=driver.getWindowHandles();
		
		Iterator<String> itr=windows_list.iterator();
		
		while(itr.hasNext())
		{
			String child_wind_id=itr.next();
			
			if(!parent_win_Id.equalsIgnoreCase(child_wind_id)) {
				
				ResFun.switchToWindow(child_wind_id);
				Thread.sleep(5000);
				
				genericMethods.input(greenPage.search_textbox,"Wheat","Search_Box");
				
			}
		}
		
		ResFun.switchToWindow(parent_win_Id);
		
		
	}


}
