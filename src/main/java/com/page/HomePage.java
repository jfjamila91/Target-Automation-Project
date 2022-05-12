package com.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.Utility.TestUtil;
import com.base.TestBase;

public class HomePage extends TestBase {

	// PAGE FACTORY OBJECT REPOSITORY


	@FindBy(partialLinkText  = "Registry")
	WebElement RegistryButton;

	@FindBy(partialLinkText = "Weekly Ad")
	WebElement WeeklyAdButton;
	
	@FindBy(partialLinkText = "RedCard")
	WebElement RedCardButton;


	@FindBy(partialLinkText = "Target Circle")
	WebElement TargetCircleButton;

	@FindBy(partialLinkText = "Find Stores")
	WebElement FindStoresButton;

	@FindBy(partialLinkText = "Categories")
	WebElement CategoriesButton;

    @FindBy(id = "overlay-4")
	WebElement CategoriesText;

	@FindBy(partialLinkText ="Deals")
	WebElement DealsButton;

	@FindBy(partialLinkText ="What’s New")
	WebElement WhatsNewButton;

	
	@FindBy(id ="overlay-11")
	WebElement WhatsNewText;
	

	@FindBy(partialLinkText  ="Shop all")
	WebElement ShopAllButton;
	

	@FindBy(id ="search")
	WebElement SearchButton;
	
	@FindBy(partialLinkText ="womens shoes")
     WebElement WomensShoes;
	

	@FindBy(xpath  ="//*[@id=\"headerPrimary\"]/a[5]")
     WebElement shoppingCart;
	
	@FindBy(xpath  ="//*[@id=\"pageBodyContainer\"]")
    WebElement clearenceButton;
	

	@FindBy(partialLinkText  ="Privacy policy")
    WebElement PrivacyPolicyButton;
	
	@FindBy(id  ="headerPrimary")
	WebElement MenueButton;
	
	
	
	//page factory initialization

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	 // page title 
	public void pagetitle() {
	String title = driver.getTitle();
	System.out.println("page title is : " + title);
	
}
	public void ClickOnRegistryButton() {
		RegistryButton.click();
		System.out.println("current page title is : " + driver.getTitle());
		driver.navigate().back();	
	}
	public void ClickOnWeeklyAdButton() {
		WeeklyAdButton.click();
		System.out.println("current page title is : " + driver.getTitle());
		driver.navigate().back();
	}
	 public void ClickOnRedCardButton()  {
		 RedCardButton.click();
		 System.out.println("current page title is : " + driver.getTitle());
		 driver.navigate().back();
		
	 } 
    public void ClickOnTargetCircleButton() {
	    TargetCircleButton.click();
	    System.out.println("current page title is : " + driver.getTitle());
	    driver.navigate().back();
    }   
  
    public void ClickOnFindStoresButton() {
	    FindStoresButton.click();
	    System.out.println("current page title is : " + driver.getTitle());
	    driver.navigate().back();
    }   
    
    public void ClickOnCategoriesButton() {
	    CategoriesButton.click();
	    CategoriesText.getText();
	    String Text = CategoriesText.getText();
	    System.out.println("listed categories are : " + Text);
	    System.out.println("current page title is : " + driver.getTitle());
	    driver.navigate().back();
    }
	    
    public void ClickOnDealsButton() {
    	DealsButton.click();
    	System.out.println("current page title is : " + driver.getTitle());
    	driver.navigate().back();
    }

    public void ClickOnWhatsNewButton() {
    	WhatsNewButton.click();
    	WhatsNewText.getText();
    	 String Text = 	WhatsNewText.getText();
 	    System.out.println("Whats new listed  : " + Text);
    	System.out.println("current page title is : " + driver.getTitle());
    	driver.navigate().back();
    }
    public void ShopAllButton() {
         ShopAllButton.click();
    	System.out.println("current page title is : " + driver.getTitle());
    	driver.navigate().back();
    }
    
    public void SearchButton() {
        SearchButton.click();
        SearchButton.sendKeys("womens shoes");
        SearchButton.click();
   	System.out.println("current page title is : " + driver.getTitle());
   	driver.navigate().back();
   }
   
    public void Shoppingcart() {
        shoppingCart.click();
   	System.out.println("current page title is : " + driver.getTitle());
   	driver.navigate().back();
   }
    
    public void clearenceButton() {
        clearenceButton.click();
   	System.out.println("current page title is : " + driver.getTitle());
   	driver.navigate().back();
   }
   
    public void PrivacyPolicyButton() {
        PrivacyPolicyButton.click();
   	System.out.println("current page title is : " + driver.getTitle());
   	driver.navigate().back();
   }
    public void clickOnMenueButton() {
       MenueButton.click();
   	System.out.println("current page title is : " + driver.getTitle());
   	driver.navigate().back();
   }
    
   
    
    
    
	}


