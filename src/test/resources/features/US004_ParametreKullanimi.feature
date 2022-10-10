Feature: US004 Parametre Kullanimi

  Scenario: Parametre Kullanimi
    Given Kullanici "https://www.hepsiburada.com" sayfasina gittiğini test eder.
    Then Kullanici 1 saniye bekler
    When Url'nin "hepsiburada" icerdigini test eder
    And Sayfayi kapatir.