package kutuphanekitapekleme;

public class Sanat {
    private String Yazar;
    private String KitapIsmi;
    private int BaskiYili;

    public Sanat(String yazar, String kitapIsmi, int baskiYili) {
        this.Yazar = yazar;
        this.KitapIsmi = kitapIsmi;
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
        this.KitapIsmi = kitapIsmi;
    }

    public int getBaskiYili() {
        return BaskiYili;
    }

    public void setBaskiYili(int baskiYili) {
        this.BaskiYili = baskiYili;
    }
}
