package Org.stepDefination;

import java.util.concurrent.TimeUnit;

import Org.Utility.baseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hookClass extends baseClass {
	
	@Before
	
	public void before(){
		
		launchbrowser();
		Loadurl("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@After
	
	public void teardown() {
		driver.quit();
	}
}
