
Feature: US002 Parametre Kullanimi

  Scenario: TC01 Kullanici Amazonda parametreli arama yapar
    Given Kullanici amazon sayfasina gider
    Then Kullanici "nutella" icin arama aratir
    And sonuclarin "nutella" icerdigini test eder
    And Sayfayi kapatir.
