package com.zebrunner.carina.demo.cucumber.steps;

import com.zebrunner.carina.cucumber.CucumberRunner;

import io.cucumber.java.en.Given;
import testpackage.BaseClass;
import testpackage.ChildPage1Class;
import testpackage.TestHooks;

//public class Step1Class extends CucumberRunner {
//
//	@Given("get the vehicle")
//	public void getvehicle() {
//		ChildPage1Class childPage1Class = new ChildPage1Class(getDriver());
//		childPage1Class.displayA();
//		childPage1Class.displayD();
//	}
//
//	@Given("Read Excel")
//	public void readExcel() {
//		BaseClass baseClass = new BaseClass(getDriver());
//		baseClass.readexcel();
//	}
//
//}
public class Step1Class extends CucumberRunner{
	private final BaseClass baseClass;

	// Inject shared BaseClass instance from Hooks
	public Step1Class(TestHooks hooks) {
		this.baseClass = hooks.getBaseClass();
	}

	@Given("Read Excel")
	public void readExcel() {
		baseClass.readexcel();
	}
}
