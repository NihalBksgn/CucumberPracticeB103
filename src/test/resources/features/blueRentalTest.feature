#USER STORY : US167854_manager_login_test
#NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
#AC:
#Given kullanici ana sayfada
#When kullanici login sayfasina gider
#And kullanıcı adini girer
#And sifreyi girer
#And login buttoning basar
#Then login islemi gerçekleşir
#ARTIFACT:
#url : https://www.bluerentalcars.com/
#Credentials:
#{"sam.walker@bluerentalcars.com","c!fas_art"},
#{"kate.brown@bluerentalcars.com","tad1$Fas"},
#{"raj.khan@bluerentalcars.com","v7Hg_va^"},
#{“pam.raymond@bluerentalcars.com”,"Nga^g6!"}
#NOT: scenario outline kullanalim
@bluerental
  Feature: blue_rental_login
    Scenario Outline:TC01_blue_rental_login
      Given kullanici homepage "https://www.bluerentalcars.com/" gider
      When  kullanici loginLinke tiklar
      And   kullanıcı adini "<email>" girer
      And   kullanici sifreyi "<password>" girer
      And   kullanici login butonuna basar
      Then  kullanici login oldugunu "email" ile dogrular
      Then  kullanici sayfayi kapatir

      Examples: blue_rental_giris_bilgileri
        |  email                            |      password     |
        |  sam.walker@bluerentalcars.com    |     c!fas_art     |
        |  kate.brown@bluerentalcars.com    |      tad1$Fas     |
        |  raj.khan@bluerentalcars.com      |      v7Hg_va^     |
        |  pam.raymond@bluerentalcars.com   |      Nga^g6!      |


      @negativeTest
      Scenario Outline: TC01_negatif_login_test
        Given kullanici homepage "https://www.bluerentalcars.com/" gider
        When  kullanici loginLinke tiklar
        And   kullanıcı adini "<email>" girer
        And   kullanici sifreyi "<password>" girer
        And   kullanici login butonuna basar
        Then kullanici hata mesaji aldigini dogrular
        Then kullanici sayfayi kapatir

        Examples:negative_giris_bilgileri
        |email             |password  |
        |manager@gmail.com | 3654351  |
        |manager1@gmail.com|df3654351 |
        |manager2@gmail.com|hz3654351 |
        |manager3@gmail.com|tuj3654351|