package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Baseclass;

public class SelectHotel extends Baseclass {

	public SelectHotel() {

		PageFactory.initElements(Drive, this);
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement cont;

	public WebElement getRadio() {
		return radio;
	}

	public void setRadio(WebElement radio) {
		this.radio = radio;
	}

	public WebElement getCont() {
		return cont;
	}

	public void setCont(WebElement cont) {
		this.cont = cont;
	}

}
