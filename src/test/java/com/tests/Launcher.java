package com.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {""},
        monochrome = true,
        plugin = {"pretty",
                "json:target/cucumber-report/jsonfiles/test.json", "html:target/cucumber-report/jsonfiles/test.html"},
        tags = ""
)
public class Launcher extends AbstractTestNGCucumberTests {
}
