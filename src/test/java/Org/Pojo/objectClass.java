package Org.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Utility.baseClass;

public class objectClass extends baseClass{
	
	public objectClass(){
		
		PageFactory.initElements(driver, 10);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement Signinpage;
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement CreateAccount;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement SubmitCreate;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	private WebElement Gender;
	
	@FindBy (xpath="//input[@id='customer_firstname']")
	private WebElement fname;
	 
	@FindBy (xpath="//input[@id='customer_lastname']")
	private WebElement lname;
		
	@FindBy (xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='address1']")
	private WebElement Address;
	
	@FindBy (xpath="//input[@id='city']")
	private WebElement City;
	
	@FindBy (xpath="//select[@id='id_state']")
	private WebElement State;
	
	@FindBy(xpath="//input[@id='postcode']")
	private WebElement postCode;
	
	@FindBy (xpath="//select[@id='id_country']")
	private WebElement Country;
	
	@FindBy (xpath="//input[@id='phone_mobile']")
	private WebElement phone;


	@FindBy (xpath="//input[@id='alias']")
	private WebElement Alias;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	private WebElement SubmitAccount ;

	public WebElement getSigninpage() {
		return Signinpage;
	}

	public WebElement getCreateAccount() {
		return CreateAccount;
	}

	public WebElement getSubmitCreate() {
		return SubmitCreate;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getPostCode() {
		return postCode;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getAlias() {
		return Alias;
	}

	public WebElement getSubmitAccount() {
		return SubmitAccount;
	}
	
		
}
