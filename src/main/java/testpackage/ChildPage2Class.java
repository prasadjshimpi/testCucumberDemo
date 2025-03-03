package testpackage;

import org.openqa.selenium.WebDriver;

public class ChildPage2Class extends BaseClass{

	public ChildPage2Class(WebDriver driver) {
		super(driver);
	}
	String b = "valueB";
	
	public void displayB() {
		System.out.println(b);
	}

}
