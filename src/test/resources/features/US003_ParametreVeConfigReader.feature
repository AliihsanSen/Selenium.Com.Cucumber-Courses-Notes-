Feature: Parametre Kullanimi

  Scenario: Parametre Kullaniminda ConfigReader Kullanimi
    Given Kullanici "amazonUrl" sayfasina gider
    When Url'nin "amazon" icerdigini test eder
    Then Kullanici "nutella" icin arama aratir
    And sonuclarin "nutella" icerdigini test eder
    And Sayfayi kapatir.

  Scenario: Parametre Kullaniminda ConfigReader Kullanimi
    Given Kullanici "faceUrl" sayfasina gider
    When Url'nin "facebook" icerdigini test eder

