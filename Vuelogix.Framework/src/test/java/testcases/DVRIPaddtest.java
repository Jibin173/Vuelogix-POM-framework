package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.pages.Adminpage;
import com.ferno.qa.pages.DVRIPaddpage;
import com.ferno.qa.pages.Fernohomepage;
import com.ferno.qa.pages.LoginPage;

public class DVRIPaddtest  extends TestBase {
	Adminpage admin;
	LoginPage login;
	Fernohomepage ferno;
	DVRIPaddpage dvrp;
	
	public DVRIPaddtest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		System.out.println("*****Initialising the precondition*********");
		initialization();
		admin= new Adminpage();	
		 login=new LoginPage();
		 ferno=new Fernohomepage();
		 dvrp=new DVRIPaddpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		WebDriver driver;
		Logger log = Logger.getLogger(DVRIPaddtest.class);
		System.out.println("*****the precondition sucessfully completed*********");
	}
	
	
	
	@Test
	public void dvrad() throws Throwable {
		System.out.println("To verify user can add dvrs");
		Thread.sleep(8000);
		String url1=prop.getProperty("url");
		dvrp.add_dvr(url1);
		System.out.println("Execution completed");
		ferno.logout();
	}
	
	@AfterMethod
	public void tearDown(){
		System.out.println("All the testcases of DVRIPaddtest is been completed");
		driver.quit();
	}
	

}
