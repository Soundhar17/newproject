package BylocatorsPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Baseclass;

public class Bylocators extends Baseclass {

	WebDriver drive;

	public Bylocators(WebDriver drive) {
		this.drive = drive;

	}

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='login']");
	private By logout = By.xpath("//a[text()='Logout']");

	public WebElement getLogout() {
		return drive.findElement(logout);
	}

	public void setLogout() {
		drive.findElement(logout).click();
	}

	public WebElement getUsername() {
		return drive.findElement(username);
	}

	public void setUsername(String value) {
		drive.findElement(username).sendKeys(value);
	}

	public WebElement getPassword() {
		return drive.findElement(password);
	}

	public void setPassword(String value) {
		drive.findElement(password).sendKeys(value);
	}

	public WebElement getLogin() {
		return drive.findElement(login);
	}

	public void setLogin() {
		drive.findElement(login).click();

	}

	
	  public boolean dis() {
	  
	  return drive.findElement(login).isDisplayed();
	  
	  
	  }
	  
	  public boolean enb() {
	  
	  return drive.findElement(logout).isEnabled();
	  
	  
	  }
	 

}
