package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import utilities.TestUtil;

public class SignInTest extends BaseTest {
	
	@Test(dataProviderClass = TestUtil.class, dataProvider ="dp",priority= 1)
	public void signInTest(String browserName, String runMode,String userName, String passWord) throws InterruptedException {
		
if(runMode.equals("N")) {
			
			throw new SkipException ("Skipping the test as RunMode Is NO");
		}
		
		setUp(browserName);
		HomePage home = new HomePage(driver);
		Thread.sleep(5000);
		home.Login(userName, passWord);
		
		
	}
	
	
	@Test(dataProviderClass = TestUtil.class, dataProvider ="dp",priority= 2)
	public void signInNewTest(String browserName, String runMode,String userName, String passWord) throws InterruptedException {
		
		if(runMode.equals("N")) {
					
					throw new SkipException ("Skipping the test as RunMode Is NO");
				}
				
				setUp(browserName);
				HomePage home = new HomePage(driver);
				Thread.sleep(5000);
				home.signInNew().signInNewww(userName, passWord);
				Thread.sleep(5000);
				
				
			}
	

}
