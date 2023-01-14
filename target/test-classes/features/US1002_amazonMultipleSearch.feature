Feature: US1002 kullanici amazon anasayfada birden fazla urun aratir


  Scenario: kullanici urunleri aratıp test edebilmeli
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Java yazip aratir
    Then arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Samsung yazip aratir
    Then arama sonuclarinin Samsung icerdigini test eder
    And sayfayi kapatir