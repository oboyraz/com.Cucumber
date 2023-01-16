Feature: US1010 Kullanici Scenario Outline ile Editor sayfasinda kayit olusturur

  Scenario Outline: TC15 Editor sayfasinda birden fazla kayit olusturabilmeli
    Given kullanici "editorUrl" anasayfaya gider
    Then new butonuna basar
    And 1 saniye bekler
    And firstname kutusuna "<firstName>" yazar
    And lastname kutusuna "<lastName>" yazar
    And position kutusuna "<position>" yazar
    And office kutusuna "<office>" yazar
    And extension kutusuna "<extension>" yazar
    And start date kutusuna "<startDate>" yazar
    And salary kutusuna "<salary>" yazar
    And create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
    Examples:
    |firstName|lastName|position|office  |extension|startDate |salary|
    |ilker    |Tuncer  |QA      |Istanbul|Levent   |2021-01-02|20000 |
    |Mahmut   |Poyraz  |QA      |Adana   |Pozanti  |2020-03-04|22000 |
    |Mehmet   |Boz     |QA      |Izmir   |Buca     |2019-05-06|25000 |

