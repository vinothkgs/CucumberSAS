package StepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;
import POM.Home;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StefDefination extends Base {
	
	
	@When("User has enter the from to onbard date and return date and select traveler and click search button")
	public void user_has_enter_the_from_to_onbard_date_and_return_date_and_select_traveler_and_click_search_button() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Home h= new Home();
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


}
