Feature: US1014

  Scenario: TC20 kullanici testotomasyonu sayfasinda Nutella bulabilmeli

    Given kullanici "toUrl" anasayfaya gider
    Then arama kutusuna "nutella" yazip ENTER tusuna basar
    And arama sonucunda urun bulunabildigini test eder
