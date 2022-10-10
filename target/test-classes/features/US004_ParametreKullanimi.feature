Feature: US004 Parametre Kullanimi

  Scenario: Parametre Kullanimi
    Given Kullanici "https://www.hebsiburada.com" sayfasina gider
    Then Kullanici 1 saniye bekler
    When Url'nin "hepsiburada" icerdigini test eder
    And Sayfayi kapatir.