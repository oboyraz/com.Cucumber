
Feature: Kullanici yanlis bilgilerle giris yapamaz
  Scenario: TC10 Gecersiz kullanici adi ve Gecersiz sifre ile Negatif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdInvalidUsername" yazar
    And password kutusuna "qdInvalidPassword" yazar
    And cookie click yapilir
    And 3 saniye bekler
    Then login butonuna basar
    And 3 saniye bekler
    And basarili giris yapilmadigini test eder
    And sayfayi kapatir

  Scenario: TC11 Gecersiz kullanici adi ve Gecerli sifre ile Negatif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdInvalidUsername" yazar
    And password kutusuna "qdValidPassword" yazar
    And cookie click yapilir
    And 3 saniye bekler
    Then login butonuna basar
    And 3 saniye bekler
    And basarili giris yapilmadigini test eder
    And sayfayi kapatir

  Scenario: TC12 Gecerli kullanici adi ve Gecersiz sifre ile Negatif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdValidUsername" yazar
    And password kutusuna "qdInvalidPassword" yazar
    And cookie click yapilir
    And 3 saniye bekler
    Then login butonuna basar
    And 3 saniye bekler
    And basarili giris yapilmadigini test eder
    And sayfayi kapatir