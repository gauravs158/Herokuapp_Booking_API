package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featureFiles",
					glue="src/test/java/stepDefs",
					monochrome=true,
					dryRun=true,
					plugin= {
						"com.aventstack.chaintest.plugins.ChainTestCucumberListener:",
						"pretty",
						"html:target/cucumber.html",
						"json:target/cucumber.json",
						"rerun:target/failed_scenarios.txt"
						}
				)

public class Runner extends AbstractTestNGCucumberTests{

}
