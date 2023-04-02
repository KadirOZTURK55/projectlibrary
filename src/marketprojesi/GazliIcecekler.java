package marketprojesi;

import java.util.Scanner;

public class GazliIcecekler extends AlkolsuzIcecekler {
    public int gazliIceceksecimi;
    public int adet;
    int toplam;

    public void listele() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nGazli İçecekler:");
        System.out.println("1- Kola  : 1 £");
        System.out.println("2- Fanta : 1 £");
        System.out.println("3- Gazoz : 2 £");
        System.out.println("4- Soda  : 1 £");
        gazliIceceksecimi = scan.nextInt();
        System.out.println("secmis oldugunuz icecekten kac adet almak istersiniz");
        adet = scan.nextInt();
        hesapla(gazliIceceksecimi, adet);

    }


    @Override
    public void hesapla(int sayi, int adet) {


        if (sayi == 1) {
            toplam =adet*1;
        } else if (sayi == 2) {
            toplam =adet*1;
        } else if (sayi == 3) {
            toplam = adet*2;
        } else if (sayi == 4) {
            toplam =adet*1;
        } else {
            System.out.println("hatali giris lutfen tekrar deneyiniz");
            hesapla(sayi,adet);
        }
        System.out.println("secmis oldugunuz urun icin toplam tutar : " + toplam );
    }
}

