package POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Traveler extends Base {
	public Traveler() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName_ADT0")
	private WebElement firstName;
	
	
	@FindBy(id="lastName_ADT0")
	private WebElement lastName;
	
	
	@FindBy(id="gender_ADT0")
	private WebElement gender;
	
	
	@FindBy(id="email_ADT0")
	private WebElement email;
	
	
	@FindBy(id="mobile_ADT0")
	private WebElement mobile;
	
	
	@FindBy(id="firstName_ADT1")
	private WebElement firstNameA1;
	
	
	@FindBy(id="lastName_ADT1")
	private WebElement lastNameA1;
	
	
	@FindBy(xpath="//select[@id='gender_ADT1']")
	private WebElement genderA1;
	
	

	@FindBy(id="firstName_CHD2")
	private WebElement firstNameC2;
	
	
	@FindBy(id="lastName_CHD2")
	private WebElement lastNameC2;
	
	
	@FindBy(id="dateOfBirth_CHD2")
	private WebElement DOBC2;
	
	@FindBy(id="return-button-cart")
	private WebElement continue2;
	
	@FindBy(xpath="//span[@class='actual-points sr-total-cart']")
	private WebElement total;
	
	
	@FindBy(xpath="//span[text()='2 adults']")
	private WebElement passanger;
	
	@FindBy(xpath="//span[text()='1 child']")
	private WebElement childPas;
	
	public WebElement getChildPas() {
		return childPas;
	}

	@FindBy(xpath="//p[text()='30 Sep ']")
	private WebElement data;
	
	@FindBy(xpath="//div[@class='trip-destination-info']//parent::p")
	private WebElement destination;
	
	@FindBy(xpath="//div[@class='col-md-6 col-sm-6 col-xs-6 duration UpsellBookValExpTimeShpngCrt']")
	private WebElement time;
	
	@FindBy(xpath="//div[@class='col-md-4 col-sm-4 col-xs-6 text-right rev UpsellBookValExpPTrvlrValShpCrt']")
	private List<WebElement> subtotal;
	
	@FindBy(id="expand-cart-link")
	private WebElement close;
	
	
	//-------------------------------------------
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}

	public WebElement getFirstNameA1() {
		return firstNameA1;
	}

	public void setFirstNameA1(WebElement firstNameA1) {
		this.firstNameA1 = firstNameA1;
	}

	public WebElement getLastNameA1() {
		return lastNameA1;
	}

	public void setLastNameA1(WebElement lastNameA1) {
		this.lastNameA1 = lastNameA1;
	}

	public WebElement getGenderA1() {
		return genderA1;
	}

	public void setGenderA1(WebElement genderA1) {
		this.genderA1 = genderA1;
	}

	public WebElement getFirstNameC2() {
		return firstNameC2;
	}

	public void setFirstNameC2(WebElement firstNameC2) {
		this.firstNameC2 = firstNameC2;
	}

	public WebElement getLastNameC2() {
		return lastNameC2;
	}

	public void setLastNameC2(WebElement lastNameC2) {
		this.lastNameC2 = lastNameC2;
	}

	public WebElement getDOBC2() {
		return DOBC2;
	}

	public void setDOBC2(WebElement dOBC2) {
		DOBC2 = dOBC2;
	}

	public WebElement getContinue2() {
		return continue2;
	}

	public void setContinue2(WebElement continue2) {
		this.continue2 = continue2;
	}

	public WebElement getTotal() {
		return total;
	}

	public WebElement getPassanger() {
		return passanger;
	}

	public WebElement getData() {
		return data;
	}

	public WebElement getDestination() {
		return destination;
	}

	public WebElement getTime() {
		return time;
	}

	public List<WebElement> getSubtotal() {
		return subtotal;
	}

	public WebElement getClose() {
		return close;
	}
	
	
	
	
	
	
	
	
	

}
