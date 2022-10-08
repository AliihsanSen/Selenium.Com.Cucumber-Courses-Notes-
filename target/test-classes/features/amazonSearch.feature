Feature: Amazon Search

  Scenario: TC01 Kullanıcı amazonda nutella aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella icin arama aratir
    And Sonuclarin nutella icerdigini test eder
    And Sayfayi kapatir.

  Scenario: TC02 Kullanıcı amazonda Selenium aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium icin arama aratir
    And Sonuclarin Selenium icerdigini test eder
    And Sayfayi kapatir.