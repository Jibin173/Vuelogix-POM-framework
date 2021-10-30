package com.ferno.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.util.TestUtil;

public class ConfiguringSOP extends TestBase{
	
	
	TestUtil test;
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[2]/div/div[1]/div[1]/i")
	WebElement SOAPtextpre;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[2]/div/div[1]/div[2]/a")
	WebElement addbutton;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[4]/div/div/div[2]/div/form/div/div/div[1]")
	WebElement aler1;

	@FindBy(xpath="/html")
	WebElement alertbodypare; 
	
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[4]/div/div/div[2]/div/form/div/div/div[1]/iframe")
	WebElement alertbody; 
	
	
	
	
	@FindBy(xpath="/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/button[1]") 
	WebElement SOAPSave;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[4]/div/div/div[1]/button")
	WebElement dismiss;
	
	@FindBy(xpath="//*[@class=\"even\" or @class=\"odd\"]")
	WebElement listofsop;
	
	public ConfiguringSOP(){
		PageFactory.initElements(driver, this);
		
		test=new TestUtil(driver);
		
		
		
		
	}
	
	
	public void Soapconfiguring(String url) throws InterruptedException {
		int count=1;
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		String rtnurl=TestUtil.geturl(url);
		driver.get(rtnurl+":8080/ferno/admin/init.action?tab=SOP");
		System.out.println(SOAPtextpre.isDisplayed());		
		addbutton.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	alertbodypare.click();
		aler1.click();
		alertbody.click();
		alertbody.sendKeys("hii");
		Thread.sleep(5000);
		SOAPSave.click();
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//*[@class=\"even\" or @class=\"odd\"]"));
		Iterator<WebElement> itr=list.iterator();
		while(itr.hasNext()) {
			count++;
			WebElement actual=itr.next();
			String text = actual.getText();
			int h=count-1;
			if(text.equalsIgnoreCase("hii")) {
				
		   String  urldele="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/ tr["+ h +"]/td[2]/a[2]";
		   driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr[2]")).click();
	       
		// driver.findElement(By.xpath(urldele)).isDisplayed(); 
		 driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[2]/a[2]")).click();
		 Thread.sleep(4000);
		test.accept_alert();
		}
			
			/*public void deletesoap() {
				driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[2]/a[2]")).click();
				
			}*/
	}
	
	
}
}