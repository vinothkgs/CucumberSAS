package StepDefinations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;
import POM.Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StefDefination extends Base {
	Home h= new Home();
	
	@When("User has enter the from to onbard date and return date and select traveler and click search button")
	public void user_has_enter_the_from_to_onbard_date_and_return_date_and_select_traveler_and_click_search_button() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		h.getFrom().clear();
		Thread.sleep(5000);
		fill(h.getFrom(), "STO");
		Thread.sleep(5000);
		fill(h.getTo(), "TRD");
		click(h.getOutbound());
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		for(int i=0;i<=trow.size()-1;i++) {
			List<WebElement> tdata = driver.findElements(By.tagName("td"));
			for(int j=0;j<=tdata.size()-1;j++) {
				WebElement data = tdata.get(j);
				String text = data.getText();
				if(text.equals("29")) {
					data.click();
				}
			}
		}
		click(h.getFlightSearch());
		System.out.println("Flight Search Done");
		WebElement wTime = driver.findElement(By.xpath("(//span[@class='time-distance'])[1]"));
		System.out.println(wTime.getText());
	   
	}

	@Then("user getting corresponding flights")
	public void user_getting_corresponding_flights() {
		List<WebElement> time = driver.findElements(By.xpath("//span[@class='time-distance']"));
		System.out.println("Total Flights\t"+time.size());
		for(int i=0;i<=time.size()-1;i++) {
			WebElement time1 = time.get(i);
			System.out.println("Flights Timing\t"+time1.getText());
		}
	}
	@When("user has enter the from to and provide date")
	public void user_has_enter_the_from_to_and_provide_date() throws InterruptedException {
		System.out.println("flight search functionality");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click(h.getOneWay());
		h.getFrom().clear();
		fill(h.getFrom(), "oslo");
		Thread.sleep(5000);
		fill(h.getTo(), "riga");
		Thread.sleep(4000);
		click(h.getOutbound());
		List<WebElement> tableRow = driver.findElements(By.tagName("tr"));
		for(int i=0;i<=tableRow.size()-1;i++) {
			List<WebElement> tableData = driver.findElements(By.tagName("td"));
			for(int j=0;j<=tableData.size()-1;j++) {
				WebElement data = tableData.get(j);
				String text = data.getText();
				
				if(text.equals("30")) {
					
						data.click();
						break;
					
				}
			}
		}
		//click(h.getPassengers());
		click(h.getAdultAdd());
		click(h.getChildAdd());
		click(h.getFlightSearch());
		
	}

	@Then("user getting correct flight list")
	public void user_getting_correct_flight_list() throws InterruptedException {
		List<WebElement> flightList = driver.findElements(By.xpath("//span[@class='time-distance']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/* System.out.println("Number of Flight"+"\t"+flightList.size());
		 for(int i=0;i<=flightList.size()-1;i++) {
				WebElement time1 = flightList.get(i);
				System.out.println("Flights Timing\t"+time1.getText());
			}*/
		/*List<WebElement> table = driver.findElements(By.tagName("table"));
		for(int f=0;f<=table.size();f++) {
		List<WebElement> th = driver.findElements(By.tagName("th"));
		for(int i=0;i<=th.size();i++) {*/
			List<WebElement> tr = driver.findElements(By.tagName("tr"));
			for(int j=0;j<=tr.size();j++) {
				List<WebElement> td = driver.findElements(By.tagName("td"));
				for(int k=0;k<=td.size()-1;k++) {
					WebElement tdata = td.get(k);
					System.out.println(tdata.getText());
					driver.findElement(By.xpath("(//div[@class='padding-t-17 padding-t-4'])[1]")).click();
					}
				}
			/*}
		}*/
		/*WebElement go = driver.findElement(By.xpath("(//span[@aria-hidden='true'])[6]"));
		go.click();*/
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='return-button-cart']")).click();
		}
	
	

	
	//-------------------------------------------------------------------------------------------------------------
	
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("given in hooks");
	}

	@When("user has enter the username and password")
	public void user_has_enter_the_username_and_password(io.cucumber.datatable.DataTable table) {
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		click(h.getLogin());
		
		List<Map<String, String>> mp = table.asMaps();
		for(int i=0;i<mp.size();i++) {
			Map<String, String> map = mp.get(i);
			String string = map.get("userName");
			String string2 = map.get("Password");
			
			
		fill(h.getUsr(), string);
		fill(h.getPass(), string2);
		System.out.println(string);
		System.out.println(string2);
		click(h.getLogbut());
	
		
		Assert.assertEquals("Sorry, we couldn't find you with this login ID and password combination. Please try again.", getText(h.getError()));
		
		h.getUsr().clear();
		h.getPass().clear();
		
		
		}
	}

	@Then("user getting error message")
	public void user_getting_error_message() {
	    
	}

	@When("user has check the panner text")
	public void user_has_check_the_panner_text() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*HomePage h= new HomePage();*/
		Assert.assertEquals("SAS SAFE TRAVEL", getText(h.getStravel()));
	    System.out.println("SAS SAFE TRAVEL \t verified");
	}

	@When("user has check the panner link")
	public void user_has_check_the_panner_link() {
		Assert.assertEquals(driver.getTitle(), "SAS | Scandinavian Airlines – Book your next flight on Flysas.com");
		   System.out.println("user has check the panner link \t verified");
	}

	@When("user has click the all submenu")
	public void user_has_click_the_all_submenu() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mouseover(h.getBook());
		click(h.getCalander());
		Assert.assertEquals("https://www.flysas.com/en/low-fare-calendar/", driver.getCurrentUrl());
		mouseover(h.getBook());
		click(h.getYouthTickets());
		Assert.assertEquals("https://www.flysas.com/en/fly-with-us/youth-tickets/", driver.getCurrentUrl());
		mouseover(h.getBook());
		click(h.getuMiror());
		Assert.assertEquals("https://www.flysas.com/en/fly-with-us/unaccompanied-minors/", driver.getCurrentUrl());
	    System.out.println("user has click the all submenu");
	}

	

	


}
