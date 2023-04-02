package slaytlar;

import java.util.ArrayList;
import java.util.List;

public class c14deneme {   /*
        Soru 1- Verilen bir array'de tekrar eden elementler icin, mukerrer olanlari silip, tum
        elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */
    public static void main(String[] args) {


    int[] arr = {1,2,3,4,1,3,4,4,3,2,6};

    List<Integer> arr2 = benzersiz(arr); // [1, 2, 3, 4, 6]
        System.out.println(arr2);

    }


    public static List<Integer> benzersiz(int[] arr) {

        List<Integer> newArr = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(!newArr.contains(arr[i])) {
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }
}
