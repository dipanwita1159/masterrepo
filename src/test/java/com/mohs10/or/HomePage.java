package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
//Zipcode validation//
	
	 
		/*public static By Mobile=By.xpath("//input[@id='billing_postcode']");
	  public static By product=By.xpath("//li[@class='ast-col-sm-12 ast-article-post desktop-align-left tablet-align-left mobile-align-left product type-product post-160 status-publish first instock product_cat-accessories product_cat-women has-post-thumbnail featured shipping-taxable purchasable product-type-variable']//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");
	  public static By addToCart=By.xpath("//div[contains(text(),'Black')]");
	  public static By secondClick=By.xpath("//button[normalize-space()='Add to cart']");
	  public static By viewCArt=By.xpath("//div[@role='alert']//a[@class='button wc-forward wp-element-button'][normalize-space()='View cart']");
	  public static By checkOut=By.xpath("//a[normalize-space()='Checkout']");
	  public static By zipcode=By.xpath("//input[@id='billing_postcode']");*/
	  //`email id validation//
	  
	  public static By Mobile=By.xpath("//input[@id='billing_postcode']");
	  public static By product=By.xpath("//li[@class='ast-col-sm-12 ast-article-post desktop-align-left tablet-align-left mobile-align-left product type-product post-160 status-publish first instock product_cat-accessories product_cat-women has-post-thumbnail featured shipping-taxable purchasable product-type-variable']//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");
	  public static By addToCart=By.xpath("//div[contains(text(),'Black')]");
	  public static By secondClick=By.xpath("//button[normalize-space()='Add to cart']");
	  public static By viewCArt=By.xpath("//div[@role='alert']//a[@class='button wc-forward wp-element-button'][normalize-space()='View cart']");
	  public static By checkOut=By.xpath("//a[normalize-space()='Checkout']");
	  public static By emailId=By.xpath("//input[@name=\"billing_email\"]");
	  
	  //password
	  public static By password=By.xpath("//input[@id=\"newpasswd\"]");
	  //Age//
	  public static By Age=By.xpath("//input[@name='phone']");
	  public static By clickOnBook=By.xpath("//button[normalize-space()='Proceed to book']");
	  public static By fromPlace=By.xpath("//input[@id='txtSource']");
	  public static By destination=By.xpath("//input[@id='txtDestination']");
	  public static By date=By.xpath("//input[@id='txtOnwardCalendar']");
	  public static By sreach=By.xpath("//button[normalize-space()='Search Buses']");
	  public static By viewSeat=By.xpath("");
	  public static By clickOnSeat=By.xpath("");
	  
	  //userid
	  public static By user=By.xpath("//input[@id='usernameOrEmail']");
	  public static By capture=By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[1]/div[1]/span/a");
	  public static By click=By.xpath("//button[.='Continue']");
	  //adtocartvalidate
	  public static By addtocart=By.xpath("//*[@id=\"post-39\"]/div/div/section[2]/div/div/div/div/div/div/div/form/table/tbody/tr[1]/td[3]/a");
	  
	  
	  
}
	 
	
	
	
