package Project;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;

import POM.BookAHotel;
import POM.Loginpage;
import POM.SearchHotel;
import POM.SelectHotel;
import Utilities.Baseclass;

public class Test1 extends Baseclass {

	 String path = "E:\\eclipse new\\DataDriven0.1\\src\\test\\resources\\Files\\login.xlsx";

	 String paths = "src/test/resources/Screenshots/app" + System.currentTimeMillis() + ".png";

	@BeforeClass

	public static void beforeclass() {

		Test1.browser("chrome");
		Test1.geturl("https://adactinhotelapp.com/index.php");
		
		System.out.println("Before class = launch Driver and launch URL successfully ");
		
		

	}

	@Before
	public  void before() {

		Test1.title();
		
		System.out.println("Before  = gettitle ");

	}

	@Test
	public  void testcase01() throws IOException, InterruptedException {
		Loginpage l = new Loginpage();
		l.getUser().sendKeys(credentials(path, "log", 1, 0));
		l.getPass().sendKeys(credentials(path, "log", 1, 1));
		Thread.sleep(2000);
		// Test.screenshots(paths);
		l.getClick().click();

		System.out.println("Test1 is = login successfullty");
	}
	@Test
	public void testcase02() throws IOException, InterruptedException {

		SearchHotel s = new SearchHotel();

		s.getLocation().sendKeys(credentials(path, "Search Hotel", 0, 0));

		s.getHotels().sendKeys(credentials(path, "Search Hotel", 0, 1));

		s.getRoom().sendKeys(credentials(path, "Search Hotel", 0, 2));

		s.getRoomnos().sendKeys(credentials(path, "Search Hotel", 0, 3));

		s.getAdult_room().sendKeys(credentials(path, "Search Hotel", 0, 4));

		s.getChild_room().sendKeys(credentials(path, "Search Hotel", 0, 5));
		Thread.sleep(2000);

		// Test.screenshots(paths);

		s.getSubmit().click();

		System.out.println("test2 is = Search Hotel successfully completed");
	}
	@Test
	public  void testcase03() throws InterruptedException {

		SelectHotel h = new SelectHotel();

		h.getRadio().click();
		Thread.sleep(2000);
		// Test.screenshots(paths);
		h.getCont().click();

		System.out.println("test3 = selected the   Hotel successfully completed");
	}
	@Test
	public  void testcases04() throws IOException, InterruptedException {

		BookAHotel b = new BookAHotel();

		b.getName().sendKeys(credentials(path, "Book A Hotel", 0, 0));
		b.getLname().sendKeys(credentials(path, "Book A Hotel", 0, 1));
		b.getAddress().sendKeys(credentials(path, "Book A Hotel", 0, 2));
		b.getCcname().sendKeys(credentials(path, "Book A Hotel", 0, 3));
		b.getDrop().sendKeys(credentials(path, "Book A Hotel", 0, 4));
		b.getMonth().sendKeys(credentials(path, "Book A Hotel", 0, 5));
		b.getYear().sendKeys(credentials(path, "Book A Hotel", 0, 6));
		b.getCcv().sendKeys(credentials(path, "Book A Hotel", 0, 7));
		// Test.screenshots(paths);
		b.getBook().click();

		System.out.println("Test 4 is = Book the Hotel successfully completed");

		Thread.sleep(5000);

		b.getLogout().click();
		System.out.println("Logout Successfully");
	}
     @After
	public  void after() throws AWTException, IOException, InterruptedException {
		Thread.sleep(3000);

		Test1.screenshots(paths);
		
		
		System.out.println(" screen screenshots");
	}

	@AfterClass
	public static void afterclass() throws InterruptedException {

		Thread.sleep(2000);

		Test1.close();
		
		System.out.println("Afterclass = close the current window");
		

	}
	

}
