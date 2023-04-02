package slaytlar;

import java.util.Arrays;

public class c10deneme {
    /*
        Soru 3- Verilen 2 katli bir array'de her bir ic array'deki elementleri toplayip, yeni
        olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output: [10, 3, 12, 10, 9]
         */
    public static void main(String[] args) {
        int[][] arr = {{3,7,2,3},{5,2},{3,2,5},{18},{3,7}};
        int [] newarr=new int [arr.length];
       int toplam=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
                newarr[i]=toplam;

            } toplam=0;// burada for j dongusunun disinda toplami sifirliyoruz
        }
        System.out.println(Arrays.toString(newarr));
    }
}
