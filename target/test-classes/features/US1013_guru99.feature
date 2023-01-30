Feature: US1013 Kullanici Web tablosunda istedigi degerin varligini test eder
  @vip
  Scenario: TC18 Kullanici tablodan deger test edebilmeli
    
    Given kullanici "guru99Url" anasayfaya gider
    Then Company listesini consola yazdirir
    And DBC Bankin listede oldugunu test eder