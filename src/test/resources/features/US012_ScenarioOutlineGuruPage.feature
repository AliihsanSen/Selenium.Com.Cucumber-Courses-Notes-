Feature: US011 Class Work

  Scenario Outline:TC01 Kullanıcı sütun basligi ile liste alabilmeli
    Given Kullanici "guruUrl" sayfasina gider
    And "<Basliklar>" sutunundaki tum degerleri yazdirir
    And kulllanici sayfayi kapatir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |
