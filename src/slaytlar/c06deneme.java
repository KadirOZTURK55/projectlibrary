package slaytlar;

public class c06deneme {

    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array'deki en uzun ve en kisa kelimeleri yazdiran bir method
        olusturun.
         */

String [] isimler= {"ahmet", "mehmet", "cevdet", "ali","Mehmetcan" };



enUzunenKisaKelimeleriYazdiranMethod(isimler);
    }

    public static void enUzunenKisaKelimeleriYazdiranMethod (String [] arr) {
        String enuzunkelime=arr[0];
        String enkisakelime=arr[0];


    for (int i = 0; i < arr.length; i++) {

        if(arr[i].length()>enuzunkelime.length()) {
            enuzunkelime=arr[i]; }

            if(arr[i].length()<enkisakelime.length()) {
                enkisakelime=arr[i]; }

    }
        System.out.println("Dizi içerisindeki en küçük ifade : " + enkisakelime);
        System.out.println("Dizi içerisindeki en büyük ifade : " + enuzunkelime);







}}
