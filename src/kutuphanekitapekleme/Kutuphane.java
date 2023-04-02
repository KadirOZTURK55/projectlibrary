package kutuphanekitapekleme;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {

    private String KutuphaneIsim;
    private List<Edebiyat> EdebiyatList= new ArrayList<>();
    private List<Sanat> SanatList= new ArrayList<>();

    public Kutuphane(String kutuphaneIsim) {
        KutuphaneIsim = kutuphaneIsim;
    }

    public String getKutuphaneIsim() { //getter setter olayi

        return KutuphaneIsim;
    }

    public void EdebiyatArsiv(String YazarIsim, String KitapAdi, int BasimYili) {
        EdebiyatList.add(new Edebiyat(YazarIsim, KitapAdi, BasimYili));
        System.out.println("Edebiyat kitabi Eklendi!");
    }

    public void SanatArsiv(String YazarIsim, String KitapAdi, int BasimYili) {
        SanatList.add(new Sanat(YazarIsim, KitapAdi, BasimYili));
        System.out.println("Sanat kitabi Eklendi!");
    }

    public void EdebiyatShow(String YazarIsmi, String KitapIsmi) {
        for (int i = 0; i < EdebiyatList.size(); i++) {
            if (EdebiyatList.get(i).getYazar().equalsIgnoreCase(YazarIsmi) || EdebiyatList.get(i).getKitapIsmi().equalsIgnoreCase(KitapIsmi)) {
                System.out.println("Kitap ismi: " + EdebiyatList.get(i).getKitapIsmi() +
                        "Yazar adi: " + EdebiyatList.get(i).getYazar() +
                        "Basim Yili: " + EdebiyatList.get(i).getBaskiYili());
            } else {
                System.out.println("Boyle bir sey yok");
            }
        }
    }

    public void SanatShow() {
        for (int i = 0; i < SanatList.size(); i++) {
            System.out.println("Kitap ismi: " + SanatList.get(i).getKitapIsmi() +
                    "Yazar adi: " + SanatList.get(i).getYazar() +
                    "Basim Yili: " + SanatList.get(i).getBaskiYili());
        }
    }
}
