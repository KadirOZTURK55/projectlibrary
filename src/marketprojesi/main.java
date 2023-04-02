package marketprojesi;

import java.util.Scanner;

public class main {
    int gazliIceceksecimi;
    int gazsizIceceksecimi;
    int adet;
    GazliIcecekler gazli = new GazliIcecekler();
    GazsiznormalIcecekler gazsiz = new GazsiznormalIcecekler();
    AlkolluIcecekler alkollu = new AlkolluIcecekler();
    public static void main(String[] args) {
       main main=new main();
       main.hosgeldiniz();


        }

    public void hosgeldiniz() {

        Scanner scan = new Scanner(System.in);
        System.out.println("İçecekler reyonumuza hoş geldiniz!");
        System.out.println("1- Alkolsuz İçecekler");
        System.out.println("2- Alkollü İçecekler");
        int secim = scan.nextInt();
        if (secim == 1) {
            System.out.println("1- Gazli icecekler");
            System.out.println("2- Gazsiz İçecekler");
            int secim2 = scan.nextInt();
            if (secim2 == 1) {
                gazli.listele();
            } else if (secim2 == 2) {
                gazsiz.listele();
            }
        } else if (secim == 2) {
            alkollu.listele();
        }

    }}





