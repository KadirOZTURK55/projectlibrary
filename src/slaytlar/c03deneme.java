package slaytlar;

import java.util.Arrays;

public class c03deneme {
    public static void main(String[] args) {
                /* Soru 3- Verilen bir array'deki tum elementleri bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array'i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7] array'in son hali. : [7,4,5,6]
        */
        int[] arr = {1, 2, 3, 4, 5};
       arr= kaydirmaMethodu(arr);
        System.out.println(Arrays.toString(arr));//[5, 1, 2, 3, 4]

    }

    public static int[] kaydirmaMethodu(int[] arr) {
        int[] yeniarr = new int[arr.length];

        int temp = arr[arr.length - 1];

        for (int i = 0; i < arr.length-1; i++) {
            yeniarr[i + 1] = arr[i];



        } arr = yeniarr;
        yeniarr[0] = temp;
        return arr;
    }
}
