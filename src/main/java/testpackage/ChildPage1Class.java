package testpackage;

import org.openqa.selenium.WebDriver;

public class ChildPage1Class extends BaseClass{

	public ChildPage1Class(WebDriver driver) {
		super(driver);
	}

	String a = "valueA";
	
	public void displayA() {
		System.out.println(a);
		System.out.println(d);
	}
	
	
}
