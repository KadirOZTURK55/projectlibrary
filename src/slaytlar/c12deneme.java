package slaytlar;

public class c12deneme {
    public static void main(String[] args) {
         /*
        Soru 5- Verilen 2 katli bir array'de her bir inner array'in son elementlerinin
        toplaminini yazdiran bir method olusturun.
         */

        int[][] arr = {{3,5},{7,8,9,10},{3,6,4,1}}; // 16
        System.out.println(lastindexsum(arr));
    }
    public static int lastindexsum (int [][] arr){
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) { // bana lazim olan [0][1]+[1][2]+[2][3]
            for (int j = arr[i].length-1; j <arr[i].length ; j++) {
                toplam+=arr[i][j];

            }

        }return toplam;
    }
}
