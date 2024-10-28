package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelandShoesPage extends BasePage
{

	public ApparelandShoesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[contains(text(),'Apparel')]")
	public WebElement Appareallink;
	
	/**
	 * TO check whether apparel and shoes text is displayed or not
	 */
    @FindBy(xpath="//h1[contains(text(),'Apparel')]")
    public WebElement apparealText;
    
    /**
     * 
     */
    
    @FindBy(xpath="//select[@id='products-orderby']")
    public WebElement dropdownlink;
    
    /**
     * Blue and Green Sneakers details
     */
    
    @FindBy(xpath="//a[contains(text(),'Blue and green Sneaker')]")
    public WebElement bluegreenproduct; //product link
    
    @FindBy(xpath="(//div[@class='rating'])[2]")
    public WebElement bgrating; //rating
    
   
    @FindBy(xpath="//(//span[@class='price actual-price'])2]")
    public WebElement bgprice; //price
    
   
    
    @FindBy(xpath="(//input[@value='Add to cart'])[2]")
    public WebElement bgcart;  //cart
    
    /**
     * Leather bag details
     */
    @FindBy(xpath="//a[contains(text(),'Genuine Leather')]")
    public WebElement customproduct; //product link
    
    @FindBy(xpath="(//div[@class='rating'])[7]")
    public WebElement crating; //rating
    
    @FindBy(xpath="(//span[@class='price actual-price'])[7]")
    public WebElement cprice; //price
    
    @FindBy(xpath="(//input[@value='Add to cart'])[5]")
    public WebElement ccart;
    
}
