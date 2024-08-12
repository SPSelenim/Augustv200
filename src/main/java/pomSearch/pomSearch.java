package pomSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomSearch {

	public String myf = "fname";
	public String myl = "lname";
	public String myqa = "//a[@name='QA']";
	public WebDriver driver = null;

	public pomSearch(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirst() {
		WebElement fname = null;
		try {
			fname = driver.findElement(By.id(myf));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return fname;
	}

	public void sendDatainFirstName(String myTestFirst) {
		getFirst().sendKeys(myTestFirst);
	}


	public WebElement getLast() {
		WebElement lname = null;
		try {
			lname = driver.findElement(By.id(myl));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lname;
	}

	public void sendDatainLastName(String myTestLast) {
		getLast().sendKeys(myTestLast);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement getQA() {
		WebElement qa = null;
		try {
			qa = driver.findElement(By.xpath(myqa));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return qa;
	}

	public void clickQA() {
		try
		{
			getQA().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	
}
