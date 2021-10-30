package com.ferno.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.util.TestUtil;       

public class Matrixpage extends TestBase {

	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[4]")
	WebElement resiblehandle;
	@FindBy(xpath="//*[@id=\"gdd-tree\"]")
	WebElement Cameratree;
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul")
	WebElement cameratree1;
	
	@FindBy(xpath="//*[@id=\"gdd-tree_0\"]")
	WebElement cameratree2; 
	
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ins")
	WebElement cameratree3; 
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/a")
	WebElement cameratree4; 
	@FindBy(xpath="	/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul")
	WebElement search0;
	
	@FindBy(xpath="//*[@id=\"gdd-tree_1\"]")
    WebElement search1;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ins")
    WebElement search2;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/a")
    WebElement search3;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul")
	WebElement india0;
	
	@FindBy(xpath="//*[@id=\"gdd-tree_2\"]")
	WebElement india1;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/ins")
	WebElement india2;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/a")
	WebElement india3;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/ul")
	WebElement kerala0;
	
	@FindBy(xpath="//*[@id=\"gdd-tree_224\"]")
	WebElement kerala1;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/ul/li/ins")
	WebElement kerala2;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/ul/li/a")
	WebElement kerala3;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/ul/li/ul")
	WebElement alaphy;
	
	@FindBy(xpath="//*[@id=\"gdd-tree_464\"]")
	WebElement alaphy1;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/ul/li/ul/li[1]/ins")
	WebElement alaphy2;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/ul/li/ul/li[1]/a")
	WebElement alaphy3;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div[1]/ul/li[2]/div/div/ul/li/ul/li/ul/li/ul/li/ul/li[1]/a/ins[1]")
	WebElement alphyclick;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[6]/div[1]/div/div[1]/div[2]/a[6]")
	WebElement showallcamera;
	
	public Matrixpage(){
				PageFactory.initElements(driver, this);
		}
		public void camera(String url1) throws InterruptedException {
			// TODO Auto-generated method stub
			String url12=TestUtil.geturl(url1);
			Thread.sleep(5000);
			driver.get(url12+":8080/ferno/matrix/init.action");
			resiblehandle.click();
			Thread.sleep(4000);
			Cameratree.click();
			cameratree1.click();
			cameratree2.click();
			cameratree3.click();
			cameratree4.click();
			Thread.sleep(4000);
			search0.click();
			search1.click();
			search2.click();
			search3.click();
			Thread.sleep(2000);
			india0.click();
			india1.click();
			india2.click();
			india3.click();
			Thread.sleep(2000);
			kerala0.click();
			kerala1.click();
			kerala2.click();
			kerala3.click();
			Thread.sleep(2000);
			alaphy.click();
			alaphy1.click();
			alaphy2.click();
			alaphy3.click();
			alphyclick.click();
	       // showallcamera.click();		
}
}
