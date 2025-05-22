package POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Baseclass;

public class Loginpage extends Baseclass {

	public Loginpage() {

		PageFactory.initElements(Drive,this );

	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getClick() {
		return click;
	}

	public void setClick(WebElement click) {
		this.click = click;
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement click;

}
