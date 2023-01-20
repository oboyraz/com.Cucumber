
Feature: US1006 Kullanici configuration dosyasindaki bilgilerle login olabilmeli
  @wip
  Scenario: TC09 Gecerli kullanici adi ve sifre ile Pozitif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdValidUsername" yazar
    And password kutusuna "qdValidPassword" yazar
    And cookie click yapilir
    And 3 saniye bekler
    Then login butonuna basar
    And 3 saniye bekler
    And basarili giris yapildigini test eder
    And sayfayi kapatir


