package com.launcher;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/features/", plugin = {"pretty",
        "json:report.json"},
        glue = {"com.definitions"})
public class TestScenarioLauncher extends AbstractTestNGCucumberTests {
}
