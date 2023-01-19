Feature: US1011 Kullanici herokuapp sayfasinda butonlarin gorunur oldugunu test eder

  Scenario: TC16 kullanici bekleyerek butonlarin gorunur olmasini saglayin
    Given kullanici "herokuappUrl" anasayfaya gider
    And Add Element butonuna basar
    And Delete butonunun gorunur oldugunu test edin
    Then Delete butonuna basarak butonu silin
    Then Delete butonunun gorunmedigini test edin
