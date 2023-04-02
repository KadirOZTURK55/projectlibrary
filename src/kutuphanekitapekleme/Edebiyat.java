package kutuphanekitapekleme;

public class Edebiyat {
    private String Yazar;
    private String KitapIsmi;     //burada class levelde private objeler olusturduk
    private int BaskiYili;
    public Edebiyat(String yazar, String kitapIsmi, int baskiYili) { //constructor olusturduk
        this.Yazar = yazar;
        this.KitapIsmi = kitapIsmi;       //constructor u olusturduktan sonra dedikki cosntructor parametrelerini class leveldeki objelere atiyoruz
        this.BaskiYili = baskiYili;
    }
    public String getYazar() {
        return Yazar;
    }
    public void setYazar(String yazar) {
        this.Yazar = yazar;
    }
    public String getKitapIsmi() {
        return KitapIsmi;
    }
    public void setKitapIsmi(String kitapIsmi) {
        KitapIsmi = kitapIsmi;
    }
    public int getBaskiYili() {
        return BaskiYili;
    }
    public void setBaskiYili(int baskiYili) {
        BaskiYili = baskiYili;
    }
}
