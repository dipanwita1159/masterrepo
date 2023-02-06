package com.mohs10.reuse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

public class CommonFuns {

	public Action aDriver;
	public WebDriver driver;

	public CommonFuns() {
		aDriver = new Action();
		driver = StartBrowser.driver;
	}

	
//Zipcode
	public void zipcode(String Number) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to DemoWeb shop");
		aDriver.click(HomePage.product, "added product");
		aDriver.click(HomePage.addToCart, "product clicked");
		aDriver.click(HomePage.secondClick,"catagories");
		aDriver.click(HomePage.addToCart, "added to cart");
		aDriver.click(HomePage.viewCArt, " go to cart");
		aDriver.click(HomePage.checkOut, "check out button");
		
		
		aDriver.zipcode(HomePage.Mobile,Number);}

		

	//email
	public void Email(String emailId) throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode(emailId);
		aDriver.click(HomePage.product, "added product");
		aDriver.click(HomePage.addToCart, "product clicked");
		aDriver.click(HomePage.secondClick,"catagories");
		aDriver.click(HomePage.addToCart, "added to cart");
		aDriver.click(HomePage.viewCArt, " go to cart");
		aDriver.click(HomePage.checkOut, "check out button");
		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver;
		 * js.executeAsyncScript("window.scrollBy(0,750)");
		 */
		aDriver.click(HomePage.emailId, "check out button");
		aDriver.Emailid(HomePage.emailId, emailId);
	}
public void password(String password) throws Exception {
	StartBrowser.childTest=StartBrowser.parentTest.createNode(password);
	aDriver.click(HomePage.password, "check out button");
	aDriver.password(HomePage.password, password);
}
public void age(String Age) throws Exception {
	StartBrowser.childTest=StartBrowser.parentTest.createNode(Age);

	aDriver.age(HomePage.Age, Age);
}

/*
 * public void age1(int Age) throws Exception {
 * StartBrowser.childTest=StartBrowser.parentTest.createNode("Age");
 * 
 * aDriver.age1(HomePage.Age, Age); }
 */
public void Userid(String userid) throws Exception {
	StartBrowser.childTest=StartBrowser.parentTest.createNode(userid);

	aDriver.userId(HomePage.user,userid);
	//aDriver.click(HomePage.user, "userid");
}
public void addTocart() throws Exception {
	StartBrowser.childTest=StartBrowser.parentTest.createNode("addto cart");
	aDriver.click(HomePage.product, "added product");
	aDriver.click(HomePage.addToCart, "product clicked");
	aDriver.click(HomePage.secondClick,"catagories");
	aDriver.click(HomePage.addToCart, "added to cart");
	aDriver.click(HomePage.viewCArt, " go to cart");
	aDriver.validate(HomePage.addtocart);
	
}
public void Emailvalidate(String userid) throws Exception {
	StartBrowser.childTest=StartBrowser.parentTest.createNode(userid);

	aDriver.Email2(HomePage.user,HomePage.capture,HomePage.click,userid, "form-input-validation is-error");
}

}