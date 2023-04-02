package manavprojesi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C02_Sebzeler {
    static ArrayList<String> sebze = new ArrayList<>(Arrays.asList("1.Havuc", "2.Domates", "3.Patates", "4.Sogan", "5.Kabak"));

   public static int sebzetoplamtutar=0;
    public static int sebzenumarasi;

    public static void sebze() {
        Scanner scan=new Scanner(System.in);
        System.out.println("almak istediginiz sebze icin lutfen numarasina basiniz");
        for (String each:sebze
        ) {
            System.out.println(each);
        }
         sebzenumarasi=scan.nextInt();

        switch (sebzenumarasi){
            case 1:
                System.out.println("Havuc sectiniz kilosu 10 TL dir, lutfen kac kilogram almak istediginizi");
                int meyvekilo=scan.nextInt();
                sebzetoplamtutar=10*meyvekilo;
                break;
            case 2:
                System.out.println("Domates sectiniz kilosu 10 TL dir, lutfen kac kilogram almak istediginizi");
                meyvekilo=scan.nextInt();
                sebzetoplamtutar=10*meyvekilo;
                break;
            case 3:
                System.out.println("Patates sectiniz kilosu 15 TL dir, lutfen kac kilogram almak istediginizi");
                meyvekilo=scan.nextInt();
                sebzetoplamtutar=15*meyvekilo;
                break;
            case 4:
                System.out.println("Sogan sectiniz kilosu 10 TL dir, lutfen kac kilogram almak istediginizi");
                meyvekilo=scan.nextInt();
                sebzetoplamtutar=10*meyvekilo;
                break;
            case 5:
                System.out.println("Kabak sectiniz kilosu 10 TL dir, lutfen kac kilogram almak istediginizi");
                meyvekilo=scan.nextInt();
                sebzetoplamtutar=10*meyvekilo;
                break;
        }




    }
}
