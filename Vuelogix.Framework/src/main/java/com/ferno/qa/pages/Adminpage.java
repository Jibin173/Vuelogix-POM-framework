package com.ferno.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.util.TestUtil;

public class Adminpage extends TestBase{
	

	@FindBy(xpath="//*[@id=\"admin-tab\"]")
	WebElement admintab;   
	
	@FindBy(xpath="//*[@id=\"userTab\"]")
	WebElement user;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement firstnametextbox;
	
	@FindBy(xpath="//*[@id=\"lastName\"]")
	WebElement lastname_textbox;
	
	@FindBy(xpath="//*[@id=\"address\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"userName\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"cellphone\"]")
	WebElement mobileno;
	 
	@FindBy(xpath="//*[@id=\"add_user_button\"]") 
	WebElement adduser;
	 
	@FindBy(xpath="//*[@id=\"s2id_escalation\"]")
    WebElement Escalation; 
	
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div/div[2]/form/div/div[11]/div/a/span[1]")
    WebElement Rejected;
	
	@FindBy(xpath="//*[@id=\"email_user\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"searchVal\"]")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"delete_user_button\"]")
	WebElement deleteuser;
	public Adminpage(){
		PageFactory.initElements(driver, this);
	}
	
	public void admintabstouserpage(String url) {
		   
		
		WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"admin-tab\"]")));
		
		Actions a=new Actions(driver);
		a.moveToElement(admintab);
		System.out.println("Element was found");
		a.moveToElement(user);
		String rtnurl=TestUtil.geturl(url);
		driver.get(rtnurl+":8080/ferno/admin/init.action?tab=USER");
		
       
	}
	
	public boolean filluserdetails(String url1) {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"admin-tab\"]")));
		
		
		String rtnurl=TestUtil.geturl(url1);
		driver.get(rtnurl+":8080/ferno/admin/init.action?tab=USER");
		
		//driver.get("http://10.4.5.245:8080/ferno/admin/init.action?tab=USER");  //http://10.4.5.237:8080/ferno/admin/init.action?tab=USER
		WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add_user_button\"]")));
		adduser.click();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		firstnametextbox.click();
		firstnametextbox.sendKeys("Jibn");
		 lastname_textbox.click();
		 lastname_textbox.sendKeys("jibin");
		 System.out.println(lastname_textbox);
		 address.click();
		 address.sendKeys("pune");
		 username.click();
		 username.sendKeys("jibi");
		 password.click();
		 password.sendKeys("anthing1@");
		 mobileno.click();
		 mobileno.sendKeys("9690456787");
		 email.click();
		 email.sendKeys("josejibin173@gmail.com");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 driver.findElement(By.xpath("//*[@id=\"s2id_escalation\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[14]/div/input")).sendKeys("NEW");

		 Actions action = new Actions(driver);

		 action.sendKeys(Keys.TAB).build().perform();
		 driver.findElement(By.xpath("//*[@id=\"s2id_addUserRole\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[15]/div/input")).sendKeys("USER");
		 action.sendKeys(Keys.TAB).build().perform();
		// Select objSelect =new Select(Escalation);
		 //objSelect.selectByVisibleText("REJECTED");
		 driver.findElement(By.xpath("//*[@id=\"save_user_button\"]")).click();
		 
		return true;
	}
	
	
	
	public boolean deleteuserr() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute                                                 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"admin-tab\"]")));
		driver.get("http://10.4.5.245:8080/ferno/admin/init.action?tab=USER"); 
		search.sendKeys("jibi");
		
		WebElement us= driver.findElement(By.xpath("//*[text()='jibi']"));
		driver.findElement(By.xpath("//*[@id=\"devicetree_0\"]")).click();
		 Thread.sleep(4000);     
		 List<WebElement> elementName = driver.findElements(By.xpath("//li[starts-with(@id,'user-tree_')]"));
		 System.out.println(elementName);
		driver.findElement(By.xpath("//*[@id=\"user-tree_38\"]")).click();     
		// driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/ul/li[10]/a")).click();
		driver.findElement(By.className("jstree-search")).click();
		 deleteuser.click();
		 Thread.sleep(4000);
		 driver.switchTo().alert().accept();  
		return false;
	}
	

}
