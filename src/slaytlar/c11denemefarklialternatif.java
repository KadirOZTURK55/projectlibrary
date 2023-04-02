package slaytlar;

import java.util.Arrays;

public class c11denemefarklialternatif {

    /*
     Soru 4- Verilen 2 katli bir array'de bulunan icerdeki indexlerdeki
     tum sayilarin carpimini  bize baska bir array olarak donduren bir
     method olusturun.
      */
    public static void main(String[] args) {

        int[][] arr = {{3, 2, 3}, {5, 2}, {3, 2, 1}, {2}, {2, 1}};
        int [] anotherarr=new int[arr.length];
      anotherarr=  carpimlariSonucunudondurenMethod(arr);
        System.out.println(Arrays.toString(anotherarr));
    }

    public static int[] carpimlariSonucunudondurenMethod(int[][] arr) {
        int[] newarr = new int[arr.length];
        int carpimsonuc = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpimsonuc *= arr[i][j];
                newarr[i] = carpimsonuc;
            }
            carpimsonuc = 1;
        }

        return newarr;
    }
}