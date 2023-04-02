package slaytlar;

public class c11deneme {/*
        Soru 4- Verilen 2 katli bir array'de bulunan tum sayilarin carpinini bize donduren bir
        method olusturun.
         */

    public static void main(String[] args) {
        int[][] arr = {{3,2,3},{5,2},{3,2,1},{2},{2,1}};
        System.out.println(totalmultiple(arr));
    }
    public static int totalmultiple (int [][] arr) {
        int totalmultiple=1;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalmultiple*=arr[i][j];
            }

        }return totalmultiple;
    }
}
