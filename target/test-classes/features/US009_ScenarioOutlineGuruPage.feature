Feature: US012 Class Work

  Scenario Outline:TC01 Kullanıcı sütun basligi ile liste alabilmeli
    Given Kullanici "guruUrl" sayfasina gider
    Then "<Basliklar>" sutunundaki tum degerleri yazdirir

    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

  Scenario: Kullanıcı sayfasiyi kapatir.
    And kulllanici sayfayi kapatir