Feature: US1009 Ck Hotels Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcUrl" ana sayfasinda
    Then Kullanici 2 saniye bekler
    Then Login yazisina tiklar
    And gecersiz username girer
      And gecersiz password girer
      And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir