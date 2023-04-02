package slaytlar;

import java.util.ArrayList;
import java.util.List;

public class c14 {
    /*
      Soru 1- Verilen bir array'de tekrar eden elementler icin, mukerrer olanlari silip, tum
      elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
       */
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 1, 3, 4, 4, 3, 2, 6};
       // List<Integer> listnewarr =new ArrayList<>();
        //listnewarr=tekrarsizYapmaMethodu(arr);
        //System.out.println(listnewarr);

                //ikinci yontem:)
        System.out.println(tekrarsizYapmaMethodu(arr));
    }

    public static List<Integer> tekrarsizYapmaMethodu (int [] arr){

        List<Integer> listarr =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!listarr.contains(arr[i]))
            {listarr.add(arr[i]);
            }
        }

        return listarr;


        }
    }

