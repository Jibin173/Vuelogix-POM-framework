package com.ferno.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.pages.*;
import com.ferno.qa.util.TestUtil;
public class Fernohomepage extends TestBase {
	TestUtil t=new TestUtil(driver);

	@FindBy(xpath="//*[@id=\"dashboard-tab\"]")
	WebElement dashboard;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/ul/li[3]/a/span/li")  
	WebElement Usertype; 
	@FindBy(xpath="//*[@id=\"logout-user\"]")  
	WebElement Usertype1;
	
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/ul/li[2]/a/span/li")
	WebElement Adminuser;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]/span[1]/li[1]")
	WebElement logout;
	
	@FindBy(xpath="//*[@id=\"admin\"] ")      
	WebElement Admintag;
	@FindBy(xpath="//*[@id=\"report\"]")
	WebElement report;
	
	@FindBy(xpath="//*[@id=\"alarm\"]")
	WebElement alarm;
	
	@FindBy(xpath="//*[@id=\"matrix\"]")
	WebElement matrix;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/a/img")
	WebElement log;
	
	@FindBy(xpath="//*[@id=\"trigger_logout\"]")
	WebElement logoutbtn;
	public Fernohomepage(){
		PageFactory.initElements(driver, this);
		
	}
	//LoginPage l=new LoginPage();
	
	public boolean option_availibilty() throws InterruptedException {
		
		boolean b=false;
		Thread.sleep(9000);
    //   if(l.loginid==0) {
		try {
			if(Adminuser.isDisplayed())
    	   System.out.println(Adminuser.getText());
    	   Thread.sleep(9000);
    	   System.out.println( alarm.getText()+" "+matrix.getText()+" "+Admintag.getText()+" "+report.getText());
    	   String admin= Admintag.getText();
           String report1=report.getText();
        	String alarm1= alarm.getText();
        	String matrix2= matrix.getText();
        	 if(report1.equalsIgnoreCase("REPORTS")&&alarm1.equalsIgnoreCase("ALARMS") && matrix2.equalsIgnoreCase("MATRIX")){
        	    
        	    	b=true;
        	    	System.out.println("All the condition is true");
        	    	
        	    }
        	    else {
        	    	b=false;
        	    	System.out.println("All the condition are not true");
        	    }
       }catch(Exception e){
    	   System.out.println("Entered in else block");
    	   System.out.println(Usertype.getText()+"We are in else block");
    	   Thread.sleep(9000);
    	   System.out.println( alarm.getText()+" "+matrix.getText());
    	   
    	   String report1=report.getText();
           String alarm1= alarm.getText();
       	   String matrix2= matrix.getText();
    	   
    	   
       }
 		
      
    	
   
        		
 		
        /* Actions actions = new Actions(driver);

       //Hovering on main menu
       actions.moveToElement(Usertype);

       // Locating the element from Sub Menu
     
       //To mouseover on sub menu
       actions.moveToElement(logout);

       //build()- used to compile all the actions into a single step 
       actions.click().build().perform();*/
    
       if(b==true) {
    	   System.out.println("Entered the returinng statemment");
    	   return true;
    	   
       }
       else
       {
    	   System.out.println("Entered the returinng statemment for false");
    	   
	return false;
	}
}
	public boolean logoverification() {
		return log.isDisplayed();
	}
	public void logout() throws Throwable {
		
         System.out.println(Usertype1.isDisplayed());
         t.hover_mouse(Usertype1);
         logoutbtn.click();
	}
	
	
	
	
	
	
	
}