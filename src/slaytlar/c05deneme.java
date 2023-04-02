package slaytlar;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class c05deneme {
     /* Soru 5- Kullanicidan array'in boyutunu ve elementlerini alip array'i olusturan ve bize
        donduren bir method olusturun */
     public static void main(String[] args) {

         int[] newArray2 =boyutVeElementDondurenMethod();
         System.out.println(Arrays.toString(newArray2));

     }

    public static int [] boyutVeElementDondurenMethod ( ) {

         Scanner scan=new Scanner(System.in);
        System.out.println("arrayin boyutunu giriniz");
       int boyut=scan.nextInt();

        int [] newArr =new int [boyut];

        for (int i = 0; i <boyut; i++) {
            System.out.println("lutfen " + i + " indexli elementi giriniz");
            newArr[i] = scan.nextInt();
        }
        return newArr;
    }
}
