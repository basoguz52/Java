
public class Hayvan {
    
    private String isim;

    private int kilo;

    private int boy;

    private int bacak_sayisi;

    public Hayvan(String isim, int kilo, int boy, int bacak_sayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
    }

    public void yemek_ye()  {
        System.out.println("Hayvan şu anda yemek yiyor...");
    }
    public void harekete_gec(int hiz)   {
        System.out.println("Hayvan " + hiz + " ile hareket ediyor...");
    }
    
}