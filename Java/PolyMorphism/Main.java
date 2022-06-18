class Hayvan {

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konuşuyor...";
    }

}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim() + " miyavlıyor...";
    }

}

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim() + " havlıyor...";
    }

}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim() + " kişniyor...";
    }

}

class Kus extends Hayvan {

    public Kus(String isim) {
        super(isim);
    }
    
    @Override
    public String konus() {
        return getIsim() + " ötüyor..." ;
    }
    
    
}

public class Main {

    public static void konustur(Object obje)  {
        //System.out.println(hayvan.konus());
        if (obje instanceof Kopek) {
            Kopek kopek = (Kopek) obje;
            System.out.println(kopek.konus());
        }

        else if (obje instanceof Kedi)  {
            Kedi kedi = (Kedi) obje;
            System.out.println(kedi.konus());
        }

        else if (obje instanceof At)    {
            At at = (At) obje;
            System.out.println(at.konus());
        }

        else if (obje instanceof Hayvan)    {
            Hayvan hayvan = (Hayvan) obje;
            System.out.println(hayvan.konus());
        }
    }

    public static void main(String[] args) {

        System.out.println("\n\n\n\n\n\n\n\n\n");   //eğlenmelik....
        //instance off
        Kopek kopek = new Kopek("Karabaş");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Şah");
        Hayvan hayvan = new Hayvan("Balık");
        Kus kus = new Kus("Zeytin");

        
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);  //Kursta bunu tekrar tanımlama gereğini duyduğumuzdan bahsediyor fakat buna gerk yok çünkü biz en yukarıda hayvan superclass'ını
                        //oluşturuken kendimiz bu durum için bir constuctor tanımladık ve konustur metodunun içindeki en son else if yapısını kullanarak
                        // hayvan classındaki konus fonkisyonuna gönderdik bu yüzden normla bir şekilde çalıştı...
    }
}
