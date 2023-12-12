package Runners;

import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;


@CucumberOptions(

        tags = "@SmokeTest",

        features = {"src/test/java"},

        glue = {"StepDefinition"},

        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" },

        dryRun = false


)

public class SmokeTests extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("QA Tester : ", "Selcuk Samrıoglu ");//kendi bilgilerinizi ekleyin.
        Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}

