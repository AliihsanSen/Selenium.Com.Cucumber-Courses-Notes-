Feature: Amazon Search

  @gp1
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

  @gp2
  Scenario: TC03 Kullanıcı amazonda iphone aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone icin arama aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir.