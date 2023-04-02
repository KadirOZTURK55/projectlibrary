package kutuphanekitapekleme;

public class Main {

    public static void main(String[] args) {

        Kutuphane kutuphane = new Kutuphane("Team113");

        kutuphane.EdebiyatArsiv("Ahmet Altan","Salla",2000);

        kutuphane.EdebiyatArsiv("kemal sunal","davaro",1996);

        kutuphane.SanatArsiv("fazilsay","memleketim",2010);

        kutuphane.SanatArsiv("tarkan","sekerim",2022);
        
        System.out.println("");

        kutuphane.EdebiyatShow("tayfun","salla");

    }
}
