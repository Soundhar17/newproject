package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Baseclass;

public class SearchHotel extends Baseclass {

	// Constructor Creation

	public SearchHotel() {

		PageFactory.initElements(Drive, this);

	}
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomnos;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult_room;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child_room;

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public void setRoom(WebElement room) {
		this.room = room;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public void setRoomnos(WebElement roomnos) {
		this.roomnos = roomnos;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public void setAdult_room(WebElement adult_room) {
		this.adult_room = adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public void setChild_room(WebElement child_room) {
		this.child_room = child_room;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	

}
