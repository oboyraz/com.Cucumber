Feature: US1012 Window Testi
  @wip
  Scenario: TC17 Kullanici yeni acilan window'u test edebilmeli
    Given kullanici "wduUrl" anasayfaya gider
    And Login Portal a tiklar
    Then Acilan yeni window a gecer
    And username kutusuna deger yazar
    And password kutusuna deger yazar
    Then login butonuna tiklar
    And Popup ta cikan yazinin validation failed oldugunu test eder
    And OK diyerek popup i kapatir
    Then ilk sayfaya geri doner
    And ilk sayfaya dondugunu test eder
    Then acilan tum sayfalari kapatir