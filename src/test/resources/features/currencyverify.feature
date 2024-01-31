Feature: Verify currency is GBP, EUR, and SEK

  As a user I am verifying different currency by using end point Bingo


  Scenario Outline: Verify currency
    When User send GET request to Bingo endpoint with currency as a "<currency>"
    Then I verify currency is in "<currency>"

    Examples:
      | currency |
      | GBP      |
      | EUR      |
      | SEK      |
