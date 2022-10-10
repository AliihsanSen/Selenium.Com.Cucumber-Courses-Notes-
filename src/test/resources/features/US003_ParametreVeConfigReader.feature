Feature: Parametre Kullanimi

  Scenario: TC001 Parametre Kullaniminda ConfigReader Kullanimi

    Given Kullanici "amazonUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'nin "amazon" icerdigini test eder
    Then Kullanici "nutella" icin arama aratir
    And sonuclarin "nutella" icerdigini test eder
    And Sayfayi kapatir.

  Scenario: TC002 Parametre Kullaniminda ConfigReader Kullanimi

    Given Kullanici "faceUrl" sayfasina gider
    Then Kullanici 1 saniye bekler
    When Url'nin "facebook" icerdigini test eder
    And Sayfayi kapatir.

  Scenario: TC003 Parametre Kullaniminda ConfigReader Kullanimi

    Given Kullanici "brcUrl" sayfasina gider
    Then Kullanici 2 saniye bekler
    When Url'nin "blue" icerdigini test eder
    And Sayfayi kapatir.

  Scenario: TC004 Parametre Kullaniminda ConfigReader Kullanimi

    Given Kullanici "google" sayfasina gider
    Then Kullanici 0 saniye bekler
    When Url'nin "google" icerdigini test eder
    And Sayfayi kapatir.
