package POM;

import java.util.List;

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
	
	@FindBy (id="cutomer-not-logged")
	private WebElement login;
	
	@FindBy (id="Loginemail")
	private WebElement usr;
	
	@FindBy (id="Loginpassword")
	private WebElement pass;
	
	@FindBy (id="login")
	private WebElement logbut;
	
	@FindBy (id="//a[@class='icon-logo']")
	private WebElement logo;
	
	@FindBy(xpath="//h2[@class='bg-deep-blue text-white']")
	private WebElement stravel;
	
	@FindBy(xpath="//a[@title='See our initiatives']")
	private WebElement soi;
	
	

	@FindBy(xpath="//a[@aria-label='Book']")
	private WebElement book;
	
	
	@FindBy(xpath="(//a[@aria-label='Low fare calendar'])[2]")
	private WebElement calander;
	
	@FindBy(xpath="(//a[@aria-label='SAS Youth tickets'])[2]")
	private WebElement youthTickets;
	
	
	@FindBy(xpath="(//a[@aria-label='Unaccompanied Minors'])[2]")
	private WebElement uMiror;
	
	@FindBy(xpath="//p[@id='cerm']")
	private WebElement error;
	
	@FindBy(xpath="//button[@id='OW']")
	private WebElement oneWay;
	
	@FindBy(id="policy-accept")
	private List<WebElement> cokies;
	
	@FindBy(xpath="//button[@id='return-button-cart']")
	private WebElement cont;
	
	@FindBy(xpath="(//p[@class='mrgn-t-5 font-12 text-white text-center'])[2]")
	private WebElement paragraph;
	
	@FindBy(xpath="//h2[@style='text-align: center;']")
	private WebElement pannerText;
	
	@FindBy(xpath="//div[@class='left-calendar pad-r-5 pull-left large-6  medium-6 small-6 col']//following-sibling::table")
	private WebElement onboardDate;
	
	@FindBy(xpath="//table[@id='inbound-upsell-table']")
	private WebElement returnFlight;
	
	@FindBy(xpath="//table[@id='outbound-upsell-table']")
	private WebElement flightList;
	
	
	//--------------------------------------------------------------------------------------------------------

	
	public WebElement getFrom() {
		return from;
	}
	
	


	public WebElement getFlightList() {
		return flightList;
	}




	public WebElement getReturnFlight() {
		return returnFlight;
	}




	public WebElement getOnboardDate() {
		return onboardDate;
	}




	public WebElement getPannerText() {
		return pannerText;
	}




	public WebElement getParagraph() {
		return paragraph;
	}




	public WebElement getCont() {
		return cont;
	}




	public List<WebElement> getCokies() {
		return cokies;
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
	public WebElement getLogin() {
		return login;
	}


	public WebElement getUsr() {
		return usr;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogbut() {
		return logbut;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebElement getStravel() {
		return stravel;
	}


	public WebElement getSoi() {
		return soi;
	}


	public WebElement getBook() {
		return book;
	}


	public WebElement getCalander() {
		return calander;
	}


	public WebElement getYouthTickets() {
		return youthTickets;
	}


	public WebElement getuMiror() {
		return uMiror;
	}


	public WebElement getError() {
		return error;
	}


	public WebElement getOneWay() {
		return oneWay;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
