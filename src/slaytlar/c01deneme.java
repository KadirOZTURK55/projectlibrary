package slaytlar;

import java.util.Arrays;

public class c01deneme {
    public static void main(String[] args) {
        // Verilen bir int array'in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array'i yeni haliyle kaydedin.

        int[] arr = {1,2,3,4,5};
        arr=ikiArttirmaMethodu(arr,2);
        System.out.println(Arrays.toString(arr));//[3, 4, 5, 6, 7]
    }

    public static int[] ikiArttirmaMethodu(int[] arr,int artisMiktari) {


        int[] yeniarr = new int[arr.length];

        for (int i = 0; i < yeniarr.length; i++) {
        yeniarr[i]=arr[i] + artisMiktari;

        }
        arr=yeniarr;
        return arr;


    }
}
