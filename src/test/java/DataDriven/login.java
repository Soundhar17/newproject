package DataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Baseclass;

public class login extends Baseclass {

	public static void main(String[] args) throws IOException, InterruptedException {

		/* WebDriver driver = Baseclass.getDriver(); */

		login.browser("chrome");
		login.geturl("https://adactinhotelapp.com/index.php");

		String path = "E:\\eclipse new\\DataDriven0.1\\src\\test\\resources\\Files\\login.xlsx";
		String Username = login.credentials(path, "log", 1, 0);
		String Password = login.credentials(path, "log", 1, 1);

		Drive.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
		Drive.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);

		Thread.sleep(2000);

		WebElement findElement = Drive.findElement(By.xpath("//input[@type='Submit']"));
		login.click(findElement);

		String drop1 = login.credentials(path, "Search Hotel", 0, 0);

		WebElement findElement2 = Drive.findElement(By.xpath("//select[@name='location']"));

		login.Dropdown(drop1, "", 0, findElement2, "text");
		
		

		String drop2 = login.credentials(path, "Search Hotel", 0, 1);

		WebElement findElement3 = Drive.findElement(By.xpath("//select[@name='hotels']"));

		login.Dropdown("", drop2 ,0 , findElement3, "value");

		String drop3 = login.credentials(path, "Search Hotel", 0, 2);

		WebElement findElement4 = Drive.findElement(By.xpath("//select[@name='room_type']"));

		login.Dropdown("", drop3, 0, findElement4, "value");

		String drop4 = login.credentials(path, "Search Hotel", 0, 3);

		WebElement findElement5 = Drive.findElement(By.xpath("//select[@name='room_nos']"));

		login.Dropdown(drop4,"" , 0, findElement5, "text");

		String drop5 = login.credentials(path, "Search Hotel", 0, 4);

		WebElement findElement6 = Drive.findElement(By.xpath("//select[@name='adult_room']"));

		login.Dropdown(drop5,"" , 0, findElement6, "text");

		String drop6 = login.credentials(path, "Search Hotel", 0, 5);

		WebElement findElement7 = Drive.findElement(By.xpath("//select[@name='child_room']"));

		login.Dropdown(drop6,"" , 0, findElement7, "text");

		/*
		 * WebElement findElement8 =
		 * Drive.findElement(By.xpath("//input[@type='submit']"));
		 * 
		 * login.click(findElement8);
		 * 
		 * Drive.close();
		 */

		/*
		 * WebElement findElement2 =
		 * Drive.findElement(By.xpath("//a[text()='Logout']"));
		 * 
		 * login.click(findElement2); Drive.close();
		 */

	}

}
