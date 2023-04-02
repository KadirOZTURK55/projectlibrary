package manavprojesi;

import java.util.ArrayList;
import java.util.Arrays;

public class mainclas {
    /*
        Manav Projesi-Online

        Musteri internet uzerinden online olarak manav urunlerini satin almak istiyor.
        Urunlerin oldugu iki ana sekme olsun meyve ve sebze (5 meyve 5 sebze).
        Sepete ekleme cikarma islemi yapilabilsin. Belirli bir miktari ucretin
        ustunde alisveris yapilirsa kargoda  (eve getirme kismi)  indirim olsun.
        Bu indirim kismlarini herkes kendisi ayarlasin. Urun-fiyat etiketleri olsun.
        Kampanyali urunlerle ilgili bir kisim olsun.
        Odeme olsun.

     */


    public static void main(String[] args) {


        C01_meyveler.islemler();
        C02_Sebzeler.sebze();

        System.out.println("su an icin sepetinizde bulunan malzemeler : ");

        for (String each: C03_sepet.sepet()) {
            System.out.println(each);
        }

       C04_sepettencikarmalaricin.sepetten_eleman_cikartma();
        System.out.println("son guncelleme ile sepetinizde kalan malzemeler " + C04_sepettencikarmalaricin.sepetList +
                "\n Toplam odemeniz gereken tutar " + (C04_sepettencikarmalaricin.toplamodenmesigerekentutar));


    }

        }


