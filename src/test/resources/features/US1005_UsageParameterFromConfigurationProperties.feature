@wip
Feature: US1005 Kullanici configuration.properties'te yazilan datalari parametre olarak kullanir

  Scenario: TC06 Kullanici amazon sitesine gidisi test eder

    Given kullanici "amazonUrl" anasayfaya gider
    Then Url'de "amazon" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC07 Kullanici arabam sitesine gidisi test eder

    Given kullanici "arabamUrl" anasayfaya gider
    Then Url'de "arabam" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC08 Kullanici walmart sitesine gidisi test eder

    Given kullanici "walmartUrl" anasayfaya gider
    Then Url'de "walmart" oldugunu test eder
    And sayfayi kapatir