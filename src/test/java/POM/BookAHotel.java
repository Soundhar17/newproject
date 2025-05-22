package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Baseclass;

public class BookAHotel extends Baseclass {

	public BookAHotel() {

		PageFactory.initElements(Drive, this);

	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement name;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lname;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccname;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement drop;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement month;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement year;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement ccv;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(WebElement lname) {
		this.lname = lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCcname() {
		return ccname;
	}

	public void setCcname(WebElement ccname) {
		this.ccname = ccname;
	}

	public WebElement getDrop() {
		return drop;
	}

	public void setDrop(WebElement drop) {
		this.drop = drop;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public void setCcv(WebElement ccv) {
		this.ccv = ccv;
	}

	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}

}
