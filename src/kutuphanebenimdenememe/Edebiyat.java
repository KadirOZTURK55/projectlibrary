package kutuphanebenimdenememe;

public class Edebiyat {
    private String Yazar;
    private String KitapIsmi;     //burada class levelde private objeler olusturduk
    private int BaskiYili;

    public Edebiyat(String yazar, String kitapIsmi, int baskiYili) { //constructor olusturduk
        this.Yazar = yazar;
        this.KitapIsmi = kitapIsmi;       //constructor u olusturduktan sonra dedik ki cosntructor
        this.BaskiYili = baskiYili;       // parametrelerini class leveldeki objelere atiyoruz

    }

    public void setYazar(String yazar) {
        Yazar = yazar;
    }

    public void setKitapIsmi(String kitapIsmi) {
        KitapIsmi = kitapIsmi;
    }

    public void setBaskiYili(int baskiYili) {
        BaskiYili = baskiYili;
    }

    public String getYazar() {
        return Yazar;
    }

    public int getBaskiYili() {
        return BaskiYili;
    }

    public String getKitapIsmi() {
        return KitapIsmi;
    }
}
