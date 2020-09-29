package StepDefinations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;
import POM.Home;
import POM.Traveler;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StefDefination extends Base {
	Home h= new Home();
	
	@When("User has enter the from to onbard date and return date and select traveler and click search button")
	public void user_has_enter_the_from_to_onbard_date_and_return_date_and_select_traveler_and_click_search_button() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		h.getFrom().clear();
		
		fill(h.getFrom(), "STO");
		Thread.sleep(5000);
		fill(h.getTo(), "TRD");
		click(h.getOutbound());
		WebElement table = driver.findElement(By.xpath("//div[@class='left-calendar pad-r-5 pull-left large-6  medium-6 small-6 col']//following-sibling::table"));
		List<WebElement> trow = table.findElements(By.tagName("tr"));
		for(int i=0;i<=trow.size()-1;i++) {
			WebElement row = trow.get(i);
			List<WebElement> tdata = row.findElements(By.tagName("td"));
			for(int j=0;j<=tdata.size()-1;j++) {
				WebElement data = tdata.get(j);
				String text = data.getText();
				if(text.equals("30")) {
					data.click();
				}
			}
		}
		//---------------------------------------------
		WebElement table1 = driver.findElement(By.xpath("//div[@class='right-calendar pad-l-5 pull-left large-6  medium-6 small-6 col']//child::table"));
		List<WebElement> trow1 = table1.findElements(By.tagName("tr"));
		for(int i=0;i<=trow1.size()-1;i++) {
			WebElement row = trow1.get(i);
			List<WebElement> tdata = row.findElements(By.tagName("td"));
			for(int j=0;j<=tdata.size()-1;j++) {
				WebElement data = tdata.get(j);
				String text = data.getText();
				if(text.equals("15")) {
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
		/*List<WebElement> time = driver.findElements(By.xpath("//span[@class='time-distance']"));
		System.out.println("Total Flights\t"+time.size());
		for(int i=0;i<=time.size()-1;i++) {
			WebElement time1 = time.get(i);
			System.out.println("Flights Timing\t"+time1.getText());
		}*/
		
		/*WebElement flight = driver.findElement(By.xpath("//table[@id='outbound-upsell-table']"));
		List<WebElement> flight1 = flight.findElements(By.tagName("tr"));
		for(int i=0;i<=flight1.size()-1;i++) {
			WebElement web = flight1.get(i);
			List<WebElement> tdata = web.findElements(By.tagName("td"));
			for(int j=0;j<=tdata.size()-1;j++) {
				WebElement webEle = tdata.get(j);
				String text = webEle.getText();
				System.out.println(text);
			}
		}*/
		
		webTable(h.getFlightList(),"€312,23");
		
		//WebElement findElement = driver.findElement(By.xpath("//table[@id='inbound-upsell-table']"));
		webTable(h.getReturnFlight(),"€185,92");
		
	}
	@When("user has enter the from to and provide date")
	public void user_has_enter_the_from_to_and_provide_date() throws InterruptedException {
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		System.out.println("flight search functionality");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click(h.getOneWay());
		scrollDown(h.getPannerText());
	
		h.getFrom().clear();
		fill(h.getFrom(), "oslo");
		Thread.sleep(3000);
		fill(h.getTo(), "riga");
		Thread.sleep(3000);
		click(h.getOutbound());
		WebElement calender = driver.findElement(By.xpath("//div[@class='left-calendar pad-r-5 pull-left large-6  medium-6 small-6 col']//following-sibling::table"));
		List<WebElement> tableRow = calender.findElements(By.tagName("tr"));
		for(int i=0;i<=tableRow.size()-1;i++) {
			WebElement row = tableRow.get(i);
			List<WebElement> tableData = row.findElements(By.tagName("td"));
			for(int j=0;j<=tableData.size()-1;j++) {
				WebElement data = tableData.get(j);
				String text = data.getText();
				
				if(text.equals("30")) {
					
						data.click();
						
					
				}
			}
		}
		Thread.sleep(2000);
		//click(h.getPassengers());
		click(h.getAdultAdd());
		click(h.getChildAdd());
		click(h.getFlightSearch());
		
	}

	@Then("user getting correct flight list")
	public void user_getting_correct_flight_list() throws InterruptedException {
		List<WebElement> flightList = driver.findElements(By.xpath("//span[@class='time-distance']"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		if(h.getCokies().size()==1){
			listclicck(h.getCokies(),0);
		}
		scrollDown(h.getParagraph());
		/* System.out.println("Number of Flight"+"\t"+flightList.size());
		 for(int i=0;i<=flightList.size()-1;i++) {
				WebElement time1 = flightList.get(i);
				System.out.println("Flights Timing\t"+time1.getText());
			}*/
		WebElement table = driver.findElement(By.xpath("//table[@class='upsell-table sticky-table-head table new-card']"));
		
			List<WebElement> tr = table.findElements(By.tagName("tr"));
			System.out.println("Table Row=="+tr.size());
			for(int j=0;j<=tr.size()-1;j++) {
				WebElement trow = tr.get(j);
				System.out.println("------------------------------------");
				List<WebElement> td = trow.findElements(By.tagName("td"));
				for(int k=0;k<=td.size()-1;k++) {
					WebElement tdata = td.get(k);
					System.out.println(tdata.getText());
					if(tdata.getText().equals("€197,78")) 
						tdata.click();
					}
				
			}
			
			click(h.getCont());
			}
			
		
		
			
		
	@Then("user has enter the traveler information")
	public void user_has_enter_the_traveler_information() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   Traveler t= new Traveler();
	   fill(t.getFirstName(), "vinoth");
	   fill(t.getLastName(), "kumar");
	   dropdown(t.getGender(), "Male");
	   fill(t.getEmail(), "vinoth@kgs.com");
	   click(t.getMobile());
	   fill(t.getMobile(), "9597359037");
	   Thread.sleep(8000);
	   scrollDown(t.getDOBC2());
	   fill(t.getFirstNameA1(), "suba");
	   fill(t.getLastNameA1(), "vinoth");
	  
	   dropDown(t.getGenderA1(), "Male");
	   
	   
	   fill(t.getFirstNameC2(), "Venba");
	   fill(t.getLastNameC2(), "vinoth");
	   fill(t.getDOBC2(), "2011-04-27");
	   
	 
	   
	   System.out.println(getText(t.getDestination()));
	  
	   System.out.println(getText(t.getData()));
	  
	   System.out.println(getText(t.getPassanger()));
	   
	   
	  
	   Assert.assertEquals("30 Sep", getText(t.getData()));
	   Assert.assertEquals("2 adults", getText(t.getPassanger()));
	   Assert.assertEquals("OSL – RIX", getText(t.getDestination()));
	   click(t.getData());
	   List<WebElement> sub = driver.findElements(By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-6 text-right rev UpsellBookValExpPTrvlrValShpCrt']"));
	   int a = 0;
	   for(int i=0;i<=sub.size()-1;i++) {
		   WebElement sub1 = sub.get(i);
		   String text = sub1.getText();
		  // System.out.println("SubTotal Ammount\t"+text);
		   String[] split = text.split(" ");
		   String s= split[0];
		   String r = s.replace(",", "");
		   int p = Integer.parseInt(r);
		   System.out.println(p);
		   a=a+p;  
	   }
	   System.out.println(a);
	   String text = getText(t.getTotal());
	   String[] split = text.split(" ");
	   String s=split[0];
	   String r = s.replace(",", "");
	   int p = Integer.parseInt(r);
	   Assert.assertEquals(a, p);
	   System.out.println("Total Ammount is\t"+p);
	   System.out.println("***Travel Details Verified Successfully***");
	   
	   
	   
	   
	   
	   click(t.getContinue2());
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
