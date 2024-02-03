package Org.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseClass {

		public static WebDriver driver;
		
		public static void launchbrowser() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		public static void Loadurl(String url) {
			driver.get(url);
			
		}
		
		public static void quit(){
			
			driver.close();
			
		}
		
		public static void fill(WebElement e, String s) {
			
			e.sendKeys(s);
			
		}
		
		public static void btclick(WebElement e) {
			
			e.click();
			
		}
		
	public static void selectvalue(WebElement e, String name) {
		
		new Select(e).selectByValue(name);
		
	}

	}
