package testpackage;

import org.openqa.selenium.WebDriver;

public class ChildPage3Class extends BaseClass{

	public ChildPage3Class(WebDriver driver) {
		super(driver);
	}
	String c = "valueC";
	
	public void displayC() {
		System.out.println(c);
	}

}
