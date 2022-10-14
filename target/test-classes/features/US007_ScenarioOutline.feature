Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi

    Given Kullanici "<arananUrl>" sayfasina gider
    Then Kullanici 1 saniye bekler
    When Url'nin "<arananKelime>" icerdigini test eder
    And Sayfayi kapatir.
    Examples:
      | arananUrl | arananKelime |
      | amazonUrl | amazon |
      | faceUrl | facebook |
      | brcUrl | blue |
      | google | google |

