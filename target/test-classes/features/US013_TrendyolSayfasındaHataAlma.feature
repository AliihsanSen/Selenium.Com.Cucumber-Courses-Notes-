Feature: US013 Parametre Kullanimi

  @gp6
  Scenario: Parametre Kullanimi
    Given Kullanici "https://www.trendyol.com" sayfasina gittiğini test eder.
    Then Kullanici 1 saniye bekler
    When Url'nin "amazon" icerdigini test eder
    And Sayfayi kapatir.
