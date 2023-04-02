package manavprojesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C01_meyveler {
    static ArrayList<String> meyve = new ArrayList<>(Arrays.asList("1.Elma", "2.Armut", "3.Portakal", "4.Muz", "5.Nar"));

    static int meyvetoplamtutar = 0;
    public static int meyvenumarasi;

    public static void islemler() {
        Scanner scan = new Scanner(System.in);

        System.out.println("almak istediginiz meyve icin lutfen meyvenin numarasina basiniz");
        for (String each : meyve
        ) {
            System.out.println(each);
        }
        meyvenumarasi = scan.nextInt();

        switch (meyvenumarasi) {
            case 1:
                System.out.println("elma sectiniz kilosu 15 TL dir, lutfen kac kilogram almak istediginizi giriniz");
                int meyvekilo = scan.nextInt();
                meyvetoplamtutar = 15 * meyvekilo;
                break;

            case 2:
                System.out.println("Armut sectiniz kilosu 20 TL dir, lutfen kac kilogram almak istediginizi giriniz");
                meyvekilo = scan.nextInt();
                meyvetoplamtutar = 20 * meyvekilo;
                break;

            case 3:
                System.out.println("Portakal sectiniz kilosu 25 TL dir, lutfen kac kilogram almak istediginizi giriniz");
                meyvekilo = scan.nextInt();
                meyvetoplamtutar = 25 * meyvekilo;
                break;

            case 4:
                System.out.println("Muz sectiniz kilosu 30 TL dir, lutfen kac kilogram almak istediginizi giriniz");
                meyvekilo = scan.nextInt();
                meyvetoplamtutar = 30 * meyvekilo;
                break;

            case 5:
                System.out.println("Nar sectiniz kilosu 25 TL dir, lutfen kac kilogram almak istediginizi giriniz");
                meyvekilo = scan.nextInt();
                meyvetoplamtutar = 25 * meyvekilo;
                break;
        }


    }


}
