package com.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {""},
        monochrome = true,
        plugin = {"pretty",
                "json:report.json"},
        tags = ""
)
public class Launcher extends AbstractTestNGCucumberTests {
}
