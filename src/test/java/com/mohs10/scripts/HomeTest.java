package com.mohs10.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.getData.getdata;
import com.mohs10.or.HomePage;
import com.mohs10.reuse.CommonFuns;


public class HomeTest extends StartBrowser {
	
	
	
		
	
	
	/*
	 * @Test public void login() throws Exception { WebDriver driver =
	 * StartBrowser.beforeClass("firefox", "https://ecommerce.mohs10.io/store/");
	 * CommonFuns coms = new CommonFuns();
	 * 
	 * coms.zipcode("82701a");
	 * 
	 * Thread.sleep(5000); driver.close(); }
	 */
	 
	/*
	 * @Test public void login() throws Exception { WebDriver
	 * driver=StartBrowser.beforeClass("firefox",
	 * "https://register.rediff.com/register/register.php?FormName=user_details");
	 * CommonFuns coms= new CommonFuns();
	 * 
	 * coms.password("04@g#Q*");
	 * 
	 * 
	 * Thread.sleep(5000); driver.close();}
	 */
	
	
	
	/*
	 * @Test public void age() throws Exception { WebDriver driver =
	 * StartBrowser.beforeClass("firefox",
	 * "https://demo.guru99.com/test/newtours/register.php"); CommonFuns coms = new
	 * CommonFuns();
	 * 
	 * coms.age("10");
	 * 
	 * Thread.sleep(5000); driver.close(); }
	 */
	 
	 
	
	/*
	 * @Test public void Userid() throws Exception {
	 * 
	 * WebDriver driver =
	 * StartBrowser.beforeClass("firefox","https://wordpress.com/log-in/");
	 * CommonFuns coms = new CommonFuns(); coms.Userid("ta44"); Thread.sleep(5000);
	 * driver.close();
	 * 
	 * }
	 */
	 
	 /* @Test public void age() throws Exception { WebDriver driver =
			  StartBrowser.beforeClass("firefox","https://ecommerce.mohs10.io/store/"); CommonFuns coms = new
			  CommonFuns();
			  
			  coms.addTocart();
			  
			  Thread.sleep(5000); driver.close(); }
}*/
		@Test
		public void Userid() throws Exception {

			WebDriver driver = StartBrowser.beforeClass("firefox", "https://wordpress.com/log-in/");
			CommonFuns coms = new CommonFuns();
			coms.Emailvalidate("ta44fh");
			Thread.sleep(5000);
			driver.close();
	  
} }
