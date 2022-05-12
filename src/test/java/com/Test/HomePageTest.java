package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;


public class HomePageTest extends TestBase {

	HomePage homePage;
	
	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		homePage = new HomePage();
	}
	@Test
	public void pageTitleTest() {
		homePage.pagetitle();
	}
	@Test
	public void ClickOnRegistryButtonTest() {
		homePage.ClickOnRegistryButton();
			
	}
	
	@Test
	public void ClickOnWeeklyAdButtonTest() {
		homePage.ClickOnWeeklyAdButton();
		
	}
	@Test
	public void ClickOnRedCardButtonTest() {
		homePage.ClickOnRedCardButton();
	}
	@Test
	 public void ClickOnTargetCircleTest() {
		 homePage.ClickOnTargetCircleButton();
	}
	
	@Test
		 public void ClickOnFindStoreButtonTest() {
			 homePage.ClickOnFindStoresButton();
	 }
	@Test
	public void ClickOnCategoriesButton() {
		homePage.ClickOnCategoriesButton();
	
	}
	@Test
	public void ClickOnDealsButton() {
		homePage.ClickOnDealsButton();
	}
	@Test
	public void ClickOnWhatsNewButtonTest() {
		homePage.ClickOnWhatsNewButton();
	}
	@Test
	public void ShopAllButton() {
		homePage.ShopAllButton();
	}
	
	@Test
	public void SearchButtonTest() {
		homePage.SearchButton();
	}
	
	@Test
	public void ShoppingcartTest() {
		homePage.Shoppingcart();
	}	
		@Test
		public void clearenceButtonTest() {
			homePage.clearenceButton();		
		}
		@Test
		public void privacyPolicyButtonTest() {
			homePage.PrivacyPolicyButton();		
		}
		@Test
		public void MenueButton() {
			homePage.clickOnMenueButton();		
		}
		
	
	@AfterMethod
	public void TearDown() {
  driver.close();
	}	
}
	


