package slaytlar;

import java.util.Arrays;

public class c07deneme {
    public static void main(String[] args) {
        /* Soru 7- Verilen bir array'e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array'e yeni degeri atayin.
         */
int [] arr={1,2,3,4};
arr= ekleDondurMethodu(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] ekleDondurMethodu (int [] arr, int eklenenEleman) {

        int [] newarray=new int [arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newarray[i]=arr[i];
            newarray[newarray.length-1]=eklenenEleman;


        }
        arr=newarray;
        return arr;
    }

}
