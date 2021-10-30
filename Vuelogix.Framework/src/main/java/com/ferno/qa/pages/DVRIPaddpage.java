package com.ferno.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.util.TestUtil;

public class DVRIPaddpage extends TestBase {

	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]")
	WebElement drvlist2;
	
	@FindBy(xpath="//*[@id=\"devicetree\"]")
	WebElement dvrlist0;
	
	@FindBy(xpath="//*[@id=\"devicetree_0\"]")
	WebElement dvrlist; 
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/ins")
	WebElement dvrlist1; 
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/a")
	WebElement dvr;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/ul")
	WebElement start0;
	
	@FindBy(xpath="//*[@id=\"gdd-tree_1\"]")
	WebElement start1;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/ul/li/ins")
	WebElement start2;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/ul/li/a")
	WebElement start3;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/ul/li/ul")
	WebElement India0;
	
	@FindBy(xpath="//*[@id=\"gdd-tree_2\"]")
	WebElement India1;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/ul/li/ul/li/ins")
	WebElement India2;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/div[3]/div/ul/li/ul/li/ul/li/a")
	WebElement India3;
	
	@FindBy(xpath="//*[@id=\"add_dvr_button\"]")
	WebElement AddDVr;
	
	@FindBy(xpath="//*[@id=\"serverName\"]")
	WebElement Name;
	
	@FindBy(xpath="//*[@id=\"s2id_communicationMode\"]")
	WebElement Communication;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[1]/div[2]/form/div[1]/div[4]/div/a")
	WebElement Communication1;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[1]/div[2]/form/div[1]/div[4]/div/a/span[2]")
	WebElement Communication2;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[4]/div/div[1]/div[2]/form/div[1]/div[4]/div/a/span[1]")
	WebElement IP;
	
	@FindBy(xpath="/html/body/div[14]/div/input")
	WebElement typeip;
	
	@FindBy(xpath="//*[@id=\"publicIP\"]")
	WebElement IPid;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"httpPort\"]")
	WebElement httpport;
	
	@FindBy(xpath="//*[@id=\"rtspPort\"]")
	WebElement rtsp;
	
	@FindBy(xpath="//*[@id=\"tcpPort\"]")
	WebElement tcp;
	
	@FindBy(xpath="//*[@id=\"s2id_cameraVendor\"]")
	WebElement cameravendo1;
	
	@FindBy(xpath="/html/body/div[15]/div/input")
	WebElement Camerserch;
	
	@FindBy(xpath="//*[@id=\"s2id_cameraModel\"]")
	WebElement cameramodel;
	
	@FindBy(xpath="/html/body/div[16]/div/input")
	WebElement searchmodel;
	
	@FindBy(xpath="//*[@id=\"description\"]")
	WebElement description;
	
	@FindBy(xpath="//*[@id=\"location\"]")
	WebElement location;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement district;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement Country;
	
	@FindBy(xpath="//*[@id=\"s2id_dmsToMonitor\"]")
	WebElement DMS;
	
	@FindBy(xpath="/html/body/div[17]/div/input")
	WebElement DMStype;
	
	@FindBy(xpath="//*[@id=\"s2id_cameraLiveViewProtocol\"]")
	WebElement camerprotocol;
	
	@FindBy(xpath="/html/body/div[18]/div/input")
	WebElement cmaer;
	
	@FindBy(xpath="//*[@id=\"add_permission_button\"]")
	WebElement permi;
	
	@FindBy(xpath="//*[@id=\"s2id_autogen8\"]")
	WebElement usertyp;
	
	@FindBy(xpath="//*[@id=\"allPermission\"]")
	WebElement allpermision;
	
	public DVRIPaddpage(){
		PageFactory.initElements(driver, this);
	}
	
	public void add_dvr(String url1) throws InterruptedException
	{
		
		String url12=TestUtil.geturl(url1);
		driver.get(url12+":8080/ferno/admin/init.action?tab=DVR");
		Thread.sleep(9000);
	    drvlist2.click();
		dvrlist0.click();
		dvrlist.click();
		dvrlist1.click();
		dvr.click();
		Thread.sleep(5000);
		start0.click();
		start1.click();
		start2.click();
		start3.click();
		Thread.sleep(5000);
		India0.click();
		India1.click();
		India2.click();
		India3.click();
		Thread.sleep(5000);
		AddDVr.click();
		Thread.sleep(3000);
		Name.click();
		Communication.click();
		typeip.sendKeys("IP");
		driver.findElement(By.xpath("/html/body/div[14]/div/input")).sendKeys(Keys.ENTER);
		IPid.sendKeys("10.9.7.3");
		username.sendKeys("admin");
		password.sendKeys("admin123");
	    httpport.sendKeys("8000");
	    rtsp.sendKeys("80");
	    tcp.sendKeys("123");
	    cameravendo1.click();
	    Camerserch.sendKeys("HikVision");
	    driver.findElement(By.xpath("/html/body/div[15]/div/input")).sendKeys(Keys.ENTER);
	    cameramodel.click();
	    searchmodel.sendKeys("DS-7200");
	    driver.findElement(By.xpath("/html/body/div[16]/div/input")).sendKeys(Keys.ENTER);
	    description.sendKeys("Hii this is used by a robot");
	    location.sendKeys("Kerala");
	    district.sendKeys("Ernakulam");
	   state.sendKeys("Kerala");
	   Country.sendKeys("India");
	   DMS.click();
	   DMStype.sendKeys("DMS 1");
	   driver.findElement(By.xpath("/html/body/div[17]/div/input")).sendKeys(Keys.ENTER);
	   camerprotocol.click();
	   cmaer.sendKeys("HTTP");
	   driver.findElement(By.xpath("/html/body/div[18]/div/input")).sendKeys(Keys.ENTER);
       permi.click();	
      // usertyp.sendKeys("deepak");
       //driver.findElement(By.xpath("//*[@id=\"s2id_userSelect\"]")).sendKeys(Keys.TAB);
       //allpermision.click();
	}
}
