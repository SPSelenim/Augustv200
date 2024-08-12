package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomSearch.pomSearch;

//2:45pm - done 3:30 pm
public class testSearch {
	public WebDriver driver = null;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Beforeclass");
	}

	@Test
	public void f() {

		try {
			driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
			driver.manage().window().maximize();
			System.out.println("MAXIMIZED");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testEnterData()
	{
		pomSearch search=new pomSearch(driver);
		search.sendDatainFirstName("xx");
		search.sendDatainLastName("ppppp");
		search.clickQA();
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("Afterclass");
	}
}
