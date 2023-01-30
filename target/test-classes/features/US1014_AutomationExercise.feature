Feature: US1014 Automation exercise sitesinde kullanici olusturma
  @wip
  Scenario: TC19 Kullanici automation exercise sayfasinde kullanici olusturabilmeli

    Given kullanici "automationUrl" anasayfaya gider
    And user sign up linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin
