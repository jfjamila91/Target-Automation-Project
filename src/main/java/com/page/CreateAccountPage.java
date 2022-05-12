package com.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import com.Utility.TestUtil;
import com.base.TestBase;

public class CreateAccountPage extends TestBase{

	// Page Factory / Object Repository
	
		@FindBy(partialLinkText = "Sign in")
		WebElement LoginSourceButton;
		
		
		@FindBy(partialLinkText  ="Create Account")
		WebElement CreateAccountButton;
		
		@FindBy(id="username")
		WebElement username ;
		
		@FindBy(id ="firstname")
		WebElement firstname ;
		
		
		@FindBy(id  ="lastname")
		WebElement lastname;
		
		
		@FindBy(id ="password")
		WebElement CreatePassword;
		
		@FindBy(id ="createAccount")
		WebElement createAccount;
		
		// Initialization Page Factory
		public CreateAccountPage() {
			PageFactory.initElements(driver, this);
		
		}
		
		public  String  pageTitle() {
		      loginSource();
			String title = driver.getTitle();
			System.out.println("The Page Title is : "+title);
			return title;
		}
		public void loginSource() {
			LoginSourceButton.click();
			CreateAccountButton.click();
		}
			public void register_A_New_User(String userName, String firstName, String lastName,String password) {
				
				loginSource();
				username.sendKeys(userName);
				firstname.sendKeys(firstName);
				lastname.sendKeys(lastName);
				CreatePassword.sendKeys(password);
				createAccount.click();
				driver.manage().timeouts().implicitlyWait(TestUtil.implicit_Wait_Time, TimeUnit.MILLISECONDS);
			}
		
			
		
		}		

