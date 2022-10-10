Feature: Parametre Kullanimi

  Scenario: Parametre Kullaniminda ConfigReader Kullanimi
    Given Kullanici "amazonUrl" sayfasina gider
    When Kullanici "nutella" icin arama aratir
    Then sonuclarin "nutella" icerdigini test eder
    And Sayfayi kapatir.

