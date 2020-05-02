package com.usa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.baseclass.SuperClass;

public class HomePage extends SuperClass {
	
	public  HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='sf-with-ul'])[4]")
	@CacheLookup
	private WebElement ClkDressBtn;
	
	@FindBy(xpath="(//*[@alt='Printed Dress'])[2]")
	@CacheLookup
	
	private WebElement ClkSecondDress;
	
	@FindBy(xpath="//*[@id='add_to_cart']")
	@CacheLookup
	private WebElement ClkAddToCart;
	@FindBy(xpath="//*[@title='Proceed to checkout']")
	@CacheLookup
	
	private WebElement ProceedToCheckOut;
	
	
	public WebElement getProceedToCheckOut() {
		return ProceedToCheckOut;
	}


	public WebElement getClkAddToCart() {
		return ClkAddToCart;
	}
	

	public WebElement getClkSecondDress() {
		return ClkSecondDress;
	}


	public WebElement getClkDressBtn() {
		return ClkDressBtn;
	} 
	
	public void FindTotaldress() {
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='icon-th-list']"));
		System.out.println("Total number dress is:: " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Search dress price :: " + list.get(i).getText());
		}
	}
	
   @FindBy(xpath="//*[@class='product-count']")
	private WebElement Showitems;
	
	public WebElement getShowItems() {
		return Showitems;
	}


public  void listofprices() {
	List<WebElement>pricelist = driver.findElements(By.xpath("//*[@class='price product-price']"));
	for (int j = 0; j<pricelist.size(); j++) {
		System.out.println(pricelist.get(j).getText());
		
	}
}
	public void seconditems() {
		List<WebElement>seconditems = driver.findElements(By.xpath("//*[@class='price product-price']"));
		for (int m = 0; m<seconditems.size(); m++) {
			if (m > 2) {
				System.out.println("Second item price is:" + "" +seconditems.get(m).getText());
				seconditems.get(m).click();
				break;
			}
		}
	}

		@FindBy(id="total_shipping")
	private	WebElement shippingprice;
	
		public WebElement getshippingprice() {
			return shippingprice;
		}
	
		@FindBy(id="total_price")
		private	WebElement Totalprice;
		
			public WebElement gettotalprice() {
				return Totalprice;
			}

			@FindBy(xpath="//*[@class='logout']")
			private WebElement logout;
			
			public WebElement getlogout() {
				return logout;
			}
			public void ClickOnDressBtn() {
				
				Actions action = new Actions (driver);
				WebElement element =driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
				action.moveToElement(element).build().perform();
				
			}
			
	}

	
	


