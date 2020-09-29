package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Argument;

public class Base {
	public static WebDriver driver;
	public static  WebDriver getDriverAcces() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SAS_Cucumber\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
	}
	
	
	public static  WebDriver getDriverAccesFireFox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SAS_Cucumber\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
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
	
	public void listclicck(List<WebElement>loc,int a) {
		WebElement w = loc.get(a);
		w.click();

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
	
	public static String getText(WebElement i) {
		String text = i.getText();
		
		return text;
	}
	
	public static String dataDriven(int row, int cell) throws IOException {
		
		File loc =new File("C:\\Users\\VIJILA\\eclipse-workspace\\Testng\\Excel\\Book1.xlsx");
		FileInputStream f= new FileInputStream(loc);
		Workbook w= new XSSFWorkbook(f);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value=null;
		int type = c.getCellType();
		if(type==1) {
			 value = c.getStringCellValue();
		}
		else if(type==0) {
			if(DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("mm/dd/yyyy");
				value = sim.format(date);
			}
			else {
				double l = c.getNumericCellValue();
				long l1=(long)l;
				value=String.valueOf(l1);
			}
		}
		return value;
		}
	
	public static void dropdown(WebElement i,String a) {
		Select s= new Select(i);
		s.selectByVisibleText(a);
		
	}
	
	public void scrollDown(WebElement a) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",a);
		js.executeScript("arguments[0].scrollIntoView(true)", a);

	}
	public void webTable(WebElement a, String b) {
		
		List<WebElement> flight1 = a.findElements(By.tagName("tr"));
		for(int i=0;i<=flight1.size()-1;i++) {
			WebElement web = flight1.get(i);
			List<WebElement> tdata = web.findElements(By.tagName("td"));
			for(int j=0;j<=tdata.size()-1;j++) {
				WebElement webEle = tdata.get(j);
				String text = webEle.getText();
				System.out.println(text);
				if(text.equals(b))
					webEle.click();
			}
		}

	}

}
