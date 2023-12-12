Feature: Register test scenario outline

  Scenario Outline: Create an account

    Given Navigate to website
    And click sign in button
    And Type email "<Email>"
    And click on create an account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<Company>"
    And type address "<address>"
    Examples:
      | Email | firstname | lastname | password | Company | address |

      |selcuksamri@gmail.com|omer | ozdemir | omer123 |techno study | adolf weg 1|
      |kisi1@gmail.com|kisi | kisisoyisim | kisi123 |Amazon | adolf weg 10|
      |kisi2@gmail.com|kisi2 | kisi2soyisim | kisi1233345 |Dell | Freiheitplatz 10|


