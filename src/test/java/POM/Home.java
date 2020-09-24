package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Home extends Base {
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="origin")
	private WebElement from;

	
	@FindBy(id="destination")
	private WebElement to;

	@FindBy(id="Outbound")
	private WebElement Outbound;
	
	
	
	@FindBy(id="Inbound")
	private WebElement Inbound;
	
	@FindBy(id="passengers")
	private WebElement passengers;
	
	@FindBy(id="cepAddAdult")
	private WebElement adultAdd;
	
	@FindBy(id="cepAddChild")
	private WebElement childAdd;
	
	@FindBy(id="cepAddInfant")
	private WebElement infantdAdd;
	
	
	@FindBy(id="search-button")
	private WebElement flightSearch;
	
	@FindBy(className="icon-close-black")
	private WebElement pannerClose;
	//--------------------------------------------------------------------------------------------------------

	public WebElement getFrom() {
		return from;
	}


	public WebElement getTo() {
		return to;
	}


	public WebElement getOutbound() {
		return Outbound;
	}


	public WebElement getInbound() {
		return Inbound;
	}


	public WebElement getPassengers() {
		return passengers;
	}


	public WebElement getAdultAdd() {
		return adultAdd;
	}


	public WebElement getChildAdd() {
		return childAdd;
	}


	public WebElement getInfantdAdd() {
		return infantdAdd;
	}


	public WebElement getFlightSearch() {
		return flightSearch;
	}


	public WebElement getPannerClose() {
		return pannerClose;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
