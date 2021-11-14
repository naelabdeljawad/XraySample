@REQ_CUS-1
Feature: First Feature

  Scenario:Req Test 1
    Given Expected value is True
    When Actual value is really "true"
    Then Assert actual and expected values

  Scenario:Req Test 2
    Given Expected value is True
    When Actual value is really "false"
    Then Assert actual and expected values

  Scenario Outline:Req Test 3
    Given Expected value is True
    When Actual value is really <value>
    Then Assert actual and expected values
    Examples:
      | value |
      | true  |
      | false |
