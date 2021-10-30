package testcases;


import java.util.Arrays;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ferno.qa.util.TestUtil;
import com.sun.tools.sjavac.Log;
import com.ferno.qa.base.TestBase;
import com.ferno.qa.pages.Adminpage;
import com.ferno.qa.pages.Fernohomepage;
import com.ferno.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage loginPage;
	Fernohomepage f=new Fernohomepage();
	SoftAssert softAssertion= new SoftAssert();
	Adminpage admin=new Adminpage();
     TestUtil util;
	
	public LoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		 util=new TestUtil(driver);
		loginPage = new LoginPage();
		Logger Log = Logger.getLogger(LoginTest.class);
		Log.info("*****Initialising the precondition*********");
		System.out.println("*****Initialising the precondition*********");
		TestUtil.waitForPageLoad();
	}
	@Test(priority=1)
	public void loginPageTitleTest(){
        Log.info("Test Case for verifiying the loginpage Title");
		System.out.println("Test Case for verifiying the loginpage Title");
		String title = loginPage.validateLoginPageTitle();
		//Assert.assertEquals(title, "Login");
	    softAssertion.assertEquals(title, "Login");
		System.out.println("Test Case executing completed");
		Log.info("Test Case executing loginPageTitleTest completed");
		
	}
	
	
	@Test(priority=2)
	public void loginTest() throws Exception {
		System.out.println("Test Case for Verifying whether user can login the application with correct ID and Password");
		Log.info("Test Case for Verifying whether user can login the application with correct ID and Password");
		
		String[][] value= util.fetchdata_from_excel("Testdata.xlsx", 0);
		
		for(int i=0;i<value.length;i++) {
			for(int k=0;k<=value.length;k++) {
				System.out.println(value[i][k]);
			}
			
		}
		 loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		 Thread.sleep(3000);
		 
		/*if(ExpectedConditions.alertIsPresent()!=null) {
			driver.switchTo().alert().accept();
		}*/
		// Log.info("Test Case executing completed for Verifying whether user can login the application with correct ID and Password");
		 
		
		 
		
	}
	
	@Test(priority=4)
	public void loginfailed() throws InterruptedException{
		Log.info("Testcase for verifying whether user provides incorrect id and password whether he gets a message for the same");
		String me=loginPage.loginincorrect(prop.getProperty("username1"), prop.getProperty("password1"));
		
		softAssertion.assertEquals(me, "Invalid username or password..!");
		//Assert.assertEquals(me, "Invalid username or password..!");
		 Log.info("Test Case executing completed for verifying whether user provides incorrect id and password whether he gets a message for the same");
	}
	
	@Test()
	public void verifylogo() {
		Log.info("Testcase for verifying the logo is present or not");
	
		boolean logovailable=loginPage.logo();  
		softAssertion.assertEquals(logovailable, true);
		//Assert.assertEquals(logovailable, true);
		Log.info("Test Case executing completed for verifying the logo is present or not");
	}
	
	@Test
	public void Verify_URL() {
		Log.info("To verify the URL is correct");
		String Expected_Url=prop.getProperty("url");
		String actual=loginPage.verify_URL();
		Assert.assertEquals(actual, Expected_Url);
		Log.info("Execution completed to verify the URL is correct");
	}
	
	
	
	@Test
	public void verify_on_accepting_only_id_and_not_password() {
		Log.info("verify_on_accepting_only_id_and_not_password");
		String msg=loginPage.id_message();
	    Assert.assertEquals(msg, "Password is required.");
	    Log.info("Execution completed for verify_on_accepting_only_id_and_not_password");
	}
	
	@Test
	public void verify_on_accepting_only_password() {
		Log.info("Verify Verify_on_accepting_only_password");
		String msg=loginPage.pass_message();
	    Assert.assertEquals(msg, "Username is required.");
	    Log.info("Execution completed for Verify_on_accepting_only_password");
	}
	
	
	@Test
	public void Verify_lengtoftextbox() {
		Log.info("To verify the lengthof the text box");
		loginPage.textbox();
		Log.info("Execution Completed for Verify_lengthof the Textbox");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	

}
