package testpackage;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public class TestHooks  {
	public TestHooks(WebDriver driver) {
		super();
//		this.driver = getDriver();
//		this.baseClass = new BaseClass(driver);
	}

	private WebDriver driver;
	private BaseClass baseClass;

	// Provide BaseClass instance
	public BaseClass getBaseClass() {
		return baseClass;
	}
}
