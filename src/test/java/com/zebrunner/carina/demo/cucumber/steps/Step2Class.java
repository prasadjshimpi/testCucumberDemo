package com.zebrunner.carina.demo.cucumber.steps;

import com.zebrunner.carina.cucumber.CucumberRunner;

import io.cucumber.java.en.Given;
import testpackage.BaseClass;
import testpackage.ChildPage2Class;
import testpackage.TestHooks;
//
//public class Step2Class extends CucumberRunner {
//
//	@Given("get the fleet")
//	public void getfleet() {
//		ChildPage2Class childPage2Class = new ChildPage2Class(getDriver());
//		childPage2Class.displayB();
//	}
//
//	@Given("Read Excel Data")
//	public void readExcelData() {
//		BaseClass baseClass = new BaseClass(getDriver());
//		baseClass.readexceldata();
//
//	}
//
//}
public class Step2Class {
	private final BaseClass baseClass;

	// Inject shared BaseClass instance from Hooks
	public Step2Class(TestHooks hooks) {
		this.baseClass = hooks.getBaseClass();
	}

	@Given("Read Excel Data")
	public void readExcelData() {
		baseClass.readexceldata();
	}
}
