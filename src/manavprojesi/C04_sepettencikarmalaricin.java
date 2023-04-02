package manavprojesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class C04_sepettencikarmalaricin {


    public static String sonuc;

    public static ArrayList<String> sepetList = C03_sepet.sepetinici;
    public static int toplamodenmesigerekentutar;

    public static void sepetten_eleman_cikartma() {

        Scanner scan = new Scanner(System.in);


        System.out.println("sepetten urun cikartmak isterseniz E ye basiniz, devam etmek icin ise H ye basiniz");
        String istek = scan.next().toUpperCase().substring(0, 1);

        if (istek.equals("E")) {
            System.out.println("sepetinizdeki urunler:");

            for (int i = 0; i < sepetList.size(); i++) {
                System.out.println((i + 1) + ". " + sepetList.get(i)); // burada 1. muz,2.muz vs seklinde yazdirmak amac
            }

            System.out.println("sepetten cikarmak istediginiz urunler icin bir rakam giriniz");
            int removenumber = scan.nextInt(); //cikarilacak meyve sebzenin numarasi kaydediliyor

            if (removenumber == 1) toplamodenmesigerekentutar = C02_Sebzeler.sebzetoplamtutar;
            else if (removenumber == 2) toplamodenmesigerekentutar = C01_meyveler.meyvetoplamtutar;
            else

                sepetList.remove(removenumber - 1);
            for (String each : sepetList) {
                System.out.println(each);
            }

        } else if (istek.equals("H")) {toplamodenmesigerekentutar=C01_meyveler.meyvetoplamtutar+ C02_Sebzeler.sebzetoplamtutar;}


        System.out.println(sepetList);

    }

}




