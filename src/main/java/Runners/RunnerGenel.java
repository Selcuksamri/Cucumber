package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java"},
        glue = {"StepDefination"},
        dryRun = false



)

public class RunnerGenel extends AbstractTestNGCucumberTests {


}
