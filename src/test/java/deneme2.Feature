@RegressionTest
Feature: Contact Us Test

  Scenario: Go to website and test Contact us Page

    Given  navigate to website
    And Click on contact us button
    And select subject heading
    And Type email
    And Type order reference "123"
    And Type a message
    When click on send button
    Then verify success message