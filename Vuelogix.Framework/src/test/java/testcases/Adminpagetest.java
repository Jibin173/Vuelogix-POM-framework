package testcases;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ferno.qa.pages.Adminpage;
import com.ferno.qa.pages.Fernohomepage;
import com.ferno.qa.pages.LoginPage;
import com.ferno.qa.base.TestBase;

public class Adminpagetest extends TestBase{
	Adminpage admin;
	LoginPage login;
	Fernohomepage ferno;
	public Adminpagetest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		System.out.println("*****Initialising the precondition*********");
		initialization();
		admin= new Adminpage();	
		 login=new LoginPage();
		 ferno=new Fernohomepage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		WebDriver driver;
		Logger log = Logger.getLogger(LoginTest.class);
		System.out.println("*****the precondition sucessfully completed*********");
	}
	
	//info warning,error,fatal
	@Test(enabled=true)
	public void user() {
		String url1=prop.getProperty("url");
		admin.admintabstouserpage(url1);
		
	}
	
	
	@Test(enabled=true)
	public void adduser_verification() throws Throwable {
	System.out.println("To verify whether user account can be created");
	String url1=prop.getProperty("url");
	boolean b=admin.filluserdetails(url1);
	Assert.assertEquals(b, true);
	Thread.sleep(8000);
	ferno.logout();
	System.out.println("Execution completed");
	}
	
	@Test(enabled=true)
	public void delete_user() throws Throwable {
		System.out.println("To verify whether user account can be deleted");
		admin.deleteuserr();
		Thread.sleep(8000);
		ferno.logout();
		System.out.println("Execution completed");
		
	}
	
	@AfterMethod
	public void tearDown(){
		System.out.println("All the testcases of AdminPagetest is been completed");
		driver.quit();
	}
	
}
