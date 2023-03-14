# Amazon sayfasında sql,samsung ve nokia aratıp sayfa başlıklarını her arama için test ediniz
#Aranacak kelimeleri config.properties dosyasından alınız
@properties
  Feature: Amazonda kelime arama
    Scenario: TC01 Amazonda sql samsung ve nokia aramasi
      Given kullanici "amazonUrl" gider
      Then kullanici sql samsung ve nokia aramasi yapar basliklari test eder
      And kullanici sayfayi kapatir
