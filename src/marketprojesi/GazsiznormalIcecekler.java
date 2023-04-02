package marketprojesi;

import java.util.Scanner;

public class GazsiznormalIcecekler extends AlkolsuzIcecekler {
    int gazsizIceceksecimi;
    int adet;
    int toplam;
    @Override
    public void listele() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nGazsız İçecekler:");
        System.out.println("1- su : 1 £");
        System.out.println("2- portakal suyu (1 litre) : 2 £");
        System.out.println("3- seftali suyu (1 litre)  : 2 £");
        System.out.println("4- elma suyu (1 litre)     : 2 £");
        gazsizIceceksecimi = scan.nextInt();
        System.out.println("secmis oldugunuz icecekten kac adet almak istersiniz");
        adet = scan.nextInt();
        hesapla(gazsizIceceksecimi, adet);
    }

    @Override
    public void hesapla(int sayi, int adet) {


        if (sayi == 1) {
            toplam =adet*1;
        } else if (sayi == 2) {
            toplam =adet*2;
        } else if (sayi == 3) {
            toplam = adet*2;
        } else if (sayi == 4) {
            toplam =adet*2;
        } else {
            System.out.println("hatali giris lutfen tekrar deneyiniz");
            hesapla(sayi,adet);
        }
        System.out.println("secmis oldugunuz urun icin toplam tutar : " + toplam );
    }
}
