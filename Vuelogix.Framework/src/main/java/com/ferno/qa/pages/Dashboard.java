package com.ferno.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.util.TestUtil;
import com.sun.tools.sjavac.Log;

public class Dashboard extends TestBase{
	
	
	
	TestUtil test;
	
	@FindBy(xpath="	//*[@id=\"alarm-tab\"]")
	WebElement admintab;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/ul/li[2]")
	public WebElement Usertype;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[2]/div[2]/div")
	WebElement dropdown;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[2]/div[2]")
	WebElement dropcontainer;
	
  @FindBy(xpath="//a[@id='deviceDropdown']")
  WebElement drop;
	
  @FindBy(xpath="/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")
  WebElement camera;
  
  @FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[5]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[6]")
  WebElement time;
	
  @FindBy(xpath="//*[@class=\"even\" or @class=\"odd\"]")
  WebElement alarm_list;
	public Dashboard(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void dashboard(String url1) throws Throwable {
		System.out.println("Entered in dashboard method");
		WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"admin-tab\"]")));
		
		
		String rtnurl=TestUtil.geturl(url1);
		driver.get(rtnurl+":8080/ferno/alarm/init.action");
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		//dropcontainer.click();
		/*driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[1]/div[2]/div[2]/div")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[1]/div[2]/div[2]/div/div")).click();
		dropdown.click();*/
		test=new TestUtil(driver);
		test.hover_mouse(drop);
		camera.click();
		
	List<WebElement> li=driver.findElements(By.xpath("//*[@class=\"even\" or @class=\"odd\"]"));	
	Iterator<WebElement> itr=li.iterator();
	while(itr.hasNext()) {
		WebElement actual=itr.next();
		String text = actual.getText();
		System.out.println(text);
        System.out.println(time.getText());
	}
	
	
	
	}
}
