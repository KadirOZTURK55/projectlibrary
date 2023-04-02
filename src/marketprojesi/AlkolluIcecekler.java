package marketprojesi;

import java.util.Scanner;

public class AlkolluIcecekler extends Icecekler{

    int gazliIceceksecimi;
    int adet;

    int toplam;
    public void listele() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nAlkollu İçecekler:");
        System.out.println("1- Viski  : 14 £");
        System.out.println("2- Bira : 2 £");
        System.out.println("3- Sampanya : 16 £");
        System.out.println("4- Vodka  : 15 £");
        gazliIceceksecimi = scan.nextInt();
        System.out.println("secmis oldugunuz icecekten kac adet almak istersiniz");
        adet = scan.nextInt();
        hesapla(gazliIceceksecimi, adet);

    }

    @Override
    public void hesapla(int sayi,int adet) {


        if (sayi == 1) {
            toplam = adet*14;
        } else if (sayi == 2) {
            toplam = adet*2;
        } else if (sayi == 3) {
            toplam = adet*16;
        } else if (sayi == 4) {
            toplam = adet*15;
        } else {
            System.out.println("hatali giris lutfen tekrar deneyiniz");
            hesapla(sayi,adet);
        }
        System.out.println("secmis oldugunuz urun icin toplam tutar : " + toplam );
    }
    }


