package com.zebrunner.carina.demo.cucumber.steps;

import com.zebrunner.carina.cucumber.CucumberRunner;

import io.cucumber.java.en.Given;
import testpackage.ChildPage3Class;

public class Step3Class extends CucumberRunner{


	@Given("get contract")
	public void getcontract(){
		ChildPage3Class childPage3Class = new ChildPage3Class(getDriver());
		childPage3Class.displayC();
	}

}
