package slaytlar;

public class c04deneme {

    public static void main(String[] args) {
        /* Soru 4- Verilen bir array'de istenen bir elemanin var olup
        olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun. */

        int[] arr = {1, 2, 4, 5, 6, 7, 8, 8, 9, 0, 1, 2, 3};
kontrolsayacmethodu(arr,2);

    }

    public static void kontrolsayacmethodu (int [] arr,int istenenEleman){
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==istenenEleman){
                sayac++;
            }

        }
        System.out.println("istenen eleman soz konusu Array'de " + sayac + " defa kullanilmistir");
    }

}
