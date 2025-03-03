package testpackage;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public class BaseClass extends AbstractPage {

	public BaseClass(WebDriver driver) {
		super(driver);
	}

	String d = "valueD";

	String excelId;
	
	public void displayD() {
		System.out.println(d);
	}

	public void readexcel() {
		excelId = "10";
	}
	public void readexceldata() {
		System.out.println(excelId);
	}

}
