package manavprojesi;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_sepet {

    public static ArrayList<String> sepetinici= new ArrayList<>();



    public static ArrayList<String> sepet() {



        switch (C01_meyveler.meyvenumarasi) {
            case 1:
                sepetinici.add("Elma");
                break;
            case 2:
                sepetinici.add("Armut");
                break;
            case 3:
                sepetinici.add("Portakal");
                break;
            case 4:
                sepetinici.add("Muz");
                break;
            case 5:
                sepetinici.add("Nar");
                break;

        }

switch (C02_Sebzeler.sebzenumarasi){
    case 1:
        sepetinici.add("Havuc");
        break;
    case 2:
        sepetinici.add("Domates");
        break;
    case 3:
        sepetinici.add("Patates");
        break;
    case 4:
        sepetinici.add("Sogan");
        break;
    case 5:
        sepetinici.add("Kabak");
        break;
}
        return (sepetinici);


    }
}
