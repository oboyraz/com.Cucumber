
Feature: US1009 Yanlis kullanici adı ve password listesi ile negatif login test

  Scenario Outline: TC14 yanlis kullanici listesi ile giris yapılamamalı

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna manuel "<yanlisUsername>" yazar
    And password kutusuna manuel "<yanlisPassword>" yazar
    And cookie click yapilir
    And 3 saniye bekler
    And login butonuna basar
    And basarili giris yapilmadigini test eder
    Then sayfayi kapatir
    Examples:
    |yanlisUsername|yanlisPassword|
    |ilker         |ilker@a.com   |
    |adem          |adem@b.com    |
    |ozgur         |ozgur@c.com   |
    |faruk         |faruk@d.com   |