package TestRunner;

import DriverFactory.DriverInstance;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/main/resources/features/",
            glue = {"stepdefinition"}, plugin = {}, dryRun = false)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }

    @BeforeSuite
    public void setUp()
    {
        System.out.println("Automation suite has been triggered");
    }

    @AfterSuite
    public void tearDown()
    {
        if(DriverInstance.getInstance()!= null)
        {
            DriverInstance.getInstance().quit();
        }
    }
}
