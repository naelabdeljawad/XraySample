package com.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestDefinitions {

    private boolean expectedValue;
    private boolean actualValue;

    @Given("Expected value is True")
    public void expected_value_is_true() {
        expectedValue = true;
    }

    @When("Actual value is really {string}")
    public void actual_value_is_really(String value) {
        actualValue = Boolean.valueOf(value);
    }

    @Then("Assert actual and expected values")
    public void assert_actual_and_expected_values() {
        Assert.assertEquals(actualValue, expectedValue);
    }
}
