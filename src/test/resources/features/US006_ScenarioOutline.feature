
  Feature: US006 Kullanıcı amazonda istediği kelimeleri aratir

    Scenario Outline: TC01 Kullanıcı istediği kelimeleri aratir

      Given Kullanici amazon sayfasina gider
      Then Kullanici "<istenenKelime>" icin arama aratir
      And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
      And Sayfayi kapatir.
      Examples:
        | istenenKelime | istenenKelimeKontrol |
        | nutella | nutella |
        | selenium | selenium |
        | java | java |
        | sql | sql |

# TestNG deki dataProvider kullanimindaki gibi Cucumberda da Scenario Outline kullaniriz.
# Bu şekilde birden fazla kelimeyi tek seferde aratabiliriz.


