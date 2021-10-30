package com.ferno.qa.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.util.TestUtil;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/ul/li[2]")
	WebElement Usertype;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/form/div[4]/button")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"invalidCred\"]")
	WebElement Invalidmessage;
     @FindBy(xpath="/html/body/div[1]/img")
     WebElement Vuelogixlogo;
     
     @FindBy(xpath="/html/body/div[1]/div[1]/div[3]/ul/li[2]")
     WebElement logoutbut;
     
     @FindBy(xpath="/*[@id=\"trigger_logout\"]")
     WebElement logbt1;
     
     @FindBy(xpath="//div[@class='modal-body']") //*[@id="continueLogin"]
     WebElement alert;
     
     @FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/button[1]") //*[@id="continueLogin"]
     WebElement alert_button;
     
     @FindBy(xpath="/html/body/div[2]/form/div[3]/span")
     WebElement passswordrequired;
     
     
     @FindBy(xpath="/html/body/div[2]/form/div[2]/span")
     WebElement usernamerequired;
     
     
     @FindBy(xpath="//*[@id=\"admin\"] ")      
 	WebElement Admintag;
     
     @FindBy(xpath="/html/body/div[1]/div[1]/div[3]/ul/li[2]/a/span/li")
 	WebElement Adminuser;
     
	//Initializing the Page Objects:
     Fernohomepage f=new Fernohomepage();
 	TestUtil t=new TestUtil(driver);
 	int loginid;
 	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	

	
	public void login(String un, String pwd) throws InterruptedException{
		boolean b=false;
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    //	js.executeScript("arguments[0].click();", loginBtn);
		    	
		    	WebDriverWait wait=new WebDriverWait(driver,60);
		    	
				wait.until(ExpectedConditions.visibilityOf(alert));
		    	
		    //Thread.sleep(5000);
		    	System.out.println("Alert present?"+alert.isDisplayed());
		    	if(alert.isDisplayed()==true) {
		    		alert_button.click();
		    		System.out.println("alert handled");
		    	}
		    	else {
		    		System.out.println("User logged in");
		    	}
		    	
		    	
		    	// b=Admintag.isDisplayed();
		    	boolean b1=Usertype.isDisplayed();
		    	
		    if(b==true) {
		    	t.explicitwait(Adminuser);
		    	System.out.println("Admintag visible?"+Admintag.isDisplayed());		    	
		    	
		    	
		    }else {
		    	t.explicitwait(Usertype);
		    	System.out.println("usertag visible?"+Usertype.isDisplayed());		   
		    	
		    	
		    }
		    	
		    	
		      
	}
	
	public String loginincorrect(String un, String pwd) throws InterruptedException{
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	Thread.sleep(5000);
		boolean b=Invalidmessage.isDisplayed();
		if(b==true) {
			System.out.println("User has typed invalid username or password " +"Server is responding with a message"+" "+Invalidmessage.getText() );
		}
		else {
			System.out.println("USer has typed correct mail");
		}
		String message=Invalidmessage.getText();
		return message;
	}
	
	
	
	
	public boolean logo() {
		return Vuelogixlogo.isDisplayed();
		
	}
	

	public String verify_URL() {
		// TODO Auto-generated method stub
		String url=driver.getCurrentUrl();
		return url;
	}
	
	
	public String id_message() {
		username.sendKeys("admin");
		loginBtn.click();
		String message=passswordrequired.getText();
		return message;
	}
	
	public String pass_message() {
		password.sendKeys("anyr");
		loginBtn.click();
		System.out.println(usernamerequired.getText());
		
		return usernamerequired.getText();
		
	}
	
	
	public void textbox() {
		t.test_maximum_Length(username, 20);
	}
	
	
	
}
