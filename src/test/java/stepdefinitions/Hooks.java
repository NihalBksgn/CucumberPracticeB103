package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    /*
    Senaryolar arasındaki baglantıyı saglayan glue yapısına koydugumuz stepdefinition package i içerisinde
     @before ve @after gibi bir notasyon varsa extends testbase demenize gerek kalmadan her senaryodan
     önce veya sonra bu methodlar calisacaktir.
     Cucumber da @before,@after kullanma ihtiyacımız olursa bunu hooks class ına koyarız.
     */

    @Before("@g1")
    public void setup1(){
        System.out.println("Amazon da IPHONE raması yapıldı");
    }
    @Before("@g2")
    public void setup2(){
        System.out.println("Amazon da SELENIUM raması yapıldı");
    }
    @Before("@g3")
    public void setup(){
        System.out.println("Amazon da JAVA raması yapıldı");
    }
    @Before("@g4")
    public void setup4(){
        System.out.println("Browser kapatıldı");
    }
    @After
    public void tearDown(Scenario scenario){  // Scenario tipinde bir parametre atamasi yapılır
        final byte[]
        //final -> bir degiskenin degerinin degistirilemez oldugunu belirtir
        //byte[] -> bir byte dizisi tanımlar.Byte dizeleri sıralı veri depolama ve isleme islemleri icin
        //kullanilir.Verilerin depolanmasi,iletilmesi ve okunmasi icin kullanilan cesitli dosya türleri
        //resimler ve diger verileri saklamak icin kullanilir.

    }

}