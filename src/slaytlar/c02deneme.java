package slaytlar;

public class c02deneme {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, -2, -4, -7};
        /* Verilen bir array'deki pozitif
        sayıları toplayıp sonucu döndüren bir metot yazınız
         */
       int sonuc = toplayipdondurenmethod(arr);
        System.out.println(sonuc);

    }

    public static int toplayipdondurenmethod(int[] arr) {

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i > 0) toplam += arr[i];


        }
        return toplam;
    }
}
