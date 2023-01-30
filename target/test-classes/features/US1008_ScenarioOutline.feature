Feature: US1008 Scenario Outline ile birden fazla senaryo calistir
  @p2
  Scenario Outline:
    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "<searchedWord>" yazip aratir
    And arama sonuclarinin "<searchedWord>" icerdigini test eder
    Then sayfayi kapatir

    Examples:
    |searchedWord|
    |Samsung     |
    |Apple       |
    |Nutella     |
    |Sarelle     |