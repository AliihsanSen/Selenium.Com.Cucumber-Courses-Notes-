
Feature: US002 Parametre Kullanimi
@Parametre
  Scenario: TC01 Kullanici Amazonda parametreli arama yapar

    Given Kullanici amazon sayfasina gider
    Then Kullanici "nutella" icin arama aratir
    And sonuclarin "nutella" icerdigini test eder
    And Sayfayi kapatir.

  Scenario: TC02 Kullanici Amazonda parametreli arama yapar

    Given Kullanici amazon sayfasina gider
    Then Kullanici "selenium" icin arama aratir
    And sonuclarin "selenium" icerdigini test eder
    And Sayfayi kapatir.

    # Feature dosyasında parametreli arama yaptığımızda ""(tırnak) içine aldığımız
    # string değeri stepDefinitionsda bir kere parametreli method oluşturur ve yeni bir
    # arama yapmak istediğimizde tekrar method oluşturmmadan feature dosyasındanda
    # ""(tırnak) içinde belirttiğimiz string ifadeti değiştirmemiz