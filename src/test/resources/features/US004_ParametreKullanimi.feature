Feature: US004 Parametre Kullanimi

  @gp5
  Scenario: Parametre Kullanimi
    Given Kullanici "https://www.hepsiburada.com" sayfasina gittiğini test eder.
    Then Kullanici 1 saniye bekler
    When Url'nin "amazon" icerdigini test eder
    And Sayfayi kapatir.

    # Bilerek hatalı parametre girilmiştir. Attached Image alınabilmesi için.