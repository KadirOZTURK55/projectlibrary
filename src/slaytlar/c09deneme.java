package slaytlar;

import java.util.Arrays;

public class c09deneme {
    public static void main(String[] args) {
     /*
        Soru 2- Verilen 2 katli bir array'de ayni index'e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        arr[i]=arr[j]
        output: [5, 7, 11]
         */
        int[][] arr = {{3, 4}, {2, 3, 6, 7}, {6, 4, 5, 6}};

        int enkisaindex = arr[0].length;
        for (int i = 0; i < arr.length; i++) {

            if (enkisaindex > arr[i].length)
                enkisaindex = arr[i].length;
        }
        int newarr[] = new int[enkisaindex];
        int toplam = 0;
        //int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}, {6, 4, 5, 6}};
        for (int i = 0; i < newarr.length; i++) {//2 (yani 0,1 alir)
            for (int j = 0; j < arr.length; j++) {//3(yani 0,1,2 alir)

                toplam += arr[j][i];//[0][0],[1][0],[2][0]----[0][1],[1][1],[2][1]
                newarr[i]=toplam;

            }

        }
        System.out.println( Arrays.toString(newarr));

    }

}

