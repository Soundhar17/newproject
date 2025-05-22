package Project;

import java.io.IOException;

import BylocatorsPOM.Bylocators;
import DataDriven.login;
import Utilities.Baseclass;

public class BylocatosTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BylocatosTest.browser("chrome");
		BylocatosTest.geturl("https://adactinhotelapp.com/index.php");
		String path = "E:\\eclipse new\\DataDriven0.1\\src\\test\\resources\\Files\\login.xlsx";

		Bylocators b = new Bylocators(Drive);
		// b.getUsername().sendKeys("Soundhar");
		b.setUsername(credentials(path, "log", 1, 0));
		b.setPassword(credentials(path, "log", 1, 1));
		Thread.sleep(2000);
		//b.setLogin();
		b.display(b.getLogin());
		
		
		
		
/*
		if (b.dis()) {
			System.out.println("dispalyed");

		} else {
			System.out.println("not displayed");

		}
		b.setLogin();

		Thread.sleep(5000);

		if (b.enb()) {

			System.out.println("Enabled");

		} else {
			System.out.println("Not Enabled");

		}

		b.setLogout();

	}*/

}
	
}
