package Org.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Org.Pojo.objectClass;
import Org.Utility.baseClass;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global;

public class step extends baseClass{
	
	objectClass o;
	
	@Given("User login in url")
	public void user_login_in_url() {
		launchbrowser();
		Loadurl("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User Click on sign in link.")
	public void user_Click_on_sign_in_link() {
		btclick(o.getSigninpage());
	}

	@Then("User entered the email as {string} in create a account section.")
	public void user_entered_the_email_as_in_section(String s1) {
		o=new objectClass();
	     fill(o.getEmail(),s1);
	     Assert.assertTrue("Verify the email id",s1.equals("ss56@gmail.com"));
	   }

	@Then("User click on Create an Account button.")
	public void user_click_on_Create_an_Account_button() {
		btclick(o.getCreateAccount());
	}

	@When("User click on gender title.")
	public void user_click_on_gender_title() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User enter the firstname as {string}.")
	public void user_enter_the_firstname_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User enter the lastname as {string}.")
	public void user_enter_the_lastname_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User enter the email as {string}.")
	public void user_enter_the_email_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User enter the password as {string}.")
	public void user_enter_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User enter the address as {string}.")
	public void user_enter_the_address_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User enter the city as {string}.")
	public void user_enter_the_city_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User select the state as {string}.")
	public void user_select_the_state_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User enter the pincode as {string}.")
	public void user_enter_the_pincode_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User select the country as {string}.")
	public void user_select_the_country_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User enter the phoneno as {string}.")
	public void user_enter_the_phoneno_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User click on submit button")
	public void user_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
