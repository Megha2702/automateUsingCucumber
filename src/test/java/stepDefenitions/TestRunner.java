package stepDefenitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags = "", features = {"src/test/resources/Feature/login.feature"}, glue = {"stepDefenitions"}, plugin = {})

public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}
