package com.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory / Object Repository
	
	@FindBy(partialLinkText = "Sign in")
	WebElement LoginSourceButton;
	
	@FindBy(xpath  =  "/html/body/div[9]/div/div/ul/li[1]/a/span")
	WebElement SignInButton;
		
	@FindBy(xpath = "//input[@autocomplete='username']")
	WebElement username;
	
	
		@FindBy(xpath  = "//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath = "//button[@id='login']")
		WebElement LoginButton;
		
		@FindBy(id = "circle-skip")
		WebElement skipAddButton;
		

		@FindBy(className = "styles__AccountLinkText-sc-17dxxwu-18 fSzIDB h-margin-r-x3")
		WebElement current_user_name;

		
		//Initializing  Page Factory	
		
		public LoginPage() throws IOException{
			PageFactory.initElements(driver, this);
		}
		
		public String pageTitle() {
			String title = driver.getTitle();
			System.out.println("The Page title is : " + title);
			return title;
		}
		public HomePage validateLogin(String username, String password) throws IOException {
			
			LoginSourceButton.click();
			SignInButton.click();
           this.username.sendKeys(username);
           this.password.sendKeys(password);
			
			LoginButton.click();
			skipAddButton.click();
			current_user_name.getText();
			return new HomePage();	
		}
		public String validateCurrentUserName() {
			String visibleUserName = current_user_name.getText();
			System.out.println("Current User Name is : "+visibleUserName);
			return visibleUserName;
		}
	
		
		
}
