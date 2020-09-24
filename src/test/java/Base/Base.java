package Base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static  WebDriver getDriverAcces() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SAS_Cucumber\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
	}
	
	//-------------------------------------------------------------
	public static void LaunchUrl(String url) {
		driver.get(url);
		
		
	}
	
	//--------------------------------------------------------------
	public static void fill(WebElement loc, String value) {
		loc.sendKeys(value);
	}
	//-------------------------------------------------------------
	
	public static void click(WebElement loc) {
		loc.click();

	}
	//--------------------------------------------------------------
	public static void windowHandles(int i) {
		Set<String>a=driver.getWindowHandles();
		List<String> l=new ArrayList();
		l.addAll(a);
		String s=l.get(i);
		driver.switchTo().window(s);
	}
	
	//------------------------------------------------------
	public static void windowsHandle() {
		String a=driver.getWindowHandle();
		Set<String> b=driver.getWindowHandles();
		for(String c:b) {
			if(!a.equals(c)) {
				driver.switchTo().window(c);
			}
		}
	}
	public static void dropDown(WebElement i, String a) { 
		Select s=new Select(i);
		s.selectByValue(a);
	}
	public static void getAtibute(WebElement i) {
		 String a = i.getAttribute("value");
		System.out.println(a);
		
	}
	
	public static void mouseover(WebElement i) {
		Actions acc=new Actions(driver);
				acc.moveToElement(i).perform();
	}


}
