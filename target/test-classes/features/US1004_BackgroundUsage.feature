
Feature: US1004 Kullanici bastaki ortak adimlar icin Background kullanir

  Background: Tum senaryolar icin ortak adim
    Given kullanici amazon anasayfaya gider

  Scenario: TC04 Kullanici Parametreli method ile Macbook M1 aratir

    Then amazon arama kutusuna "Macbook M1" yazip aratir
    And arama sonuclarinin "Macbook M1" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC04 Kullanici Parametreli method ile Java aratir

    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And 3 saniye bekler
    And sayfayi kapatir

  Scenario: TC04 Kullanici Parametreli method ile Samsung aratir

    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin "Samsung" icerdigini test eder
    And sayfayi kapatir