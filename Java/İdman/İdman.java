public class İdman {
    private int mekik;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public İdman(int mekik, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.mekik = mekik;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getMekik() {
        return mekik;
    }

    public void setMekik(int mekik) {
        this.mekik = mekik;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareketYap(String hareketTuru,int sayi) {
        if (hareketTuru.equals("Mekik")) {
            mekikYap(sayi);
        
        }
        else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);

        }
        else if (hareketTuru.equals("Situp")) {
            situpYap(sayi);
        
        }
        else if (hareketTuru.equals("Squat")) {
            squatYap(sayi);
        
        }
        else {
            System.out.println("Geçersiz Hareket...");
        }
    }


    public void mekikYap(int sayi) {
        if (mekik == 0) {
            System.out.println("Yapacak mekik kalmadı...");
        }
        else if (mekik - sayi<0) {
            System.out.println("Sağlamsın ha...");
            mekik = 0;
        }
        else {
            mekik -= sayi;
            System.out.println("mekik sayısı " + mekik);
        }
    }

    public void pushupYap(int sayi) {
        if (pushup_sayisi == 0) {
            System.out.println("Yapacak pushup kalmadı...");
        }
        else if (pushup_sayisi - sayi<0) {
            System.out.println("Sağlamsın ha...");
            pushup_sayisi = 0;
        }
        else {
            pushup_sayisi -= sayi;
            System.out.println("pushup sayısı " + pushup_sayisi);
        }
    }

    public void situpYap(int sayi) {
        if (situp_sayisi == 0) {
            System.out.println("Yapacak situp kalmadı...");
        }
        else if (situp_sayisi - sayi<0) {
            System.out.println("Sağlamsın ha...");
            situp_sayisi = 0;
        }
        else {
            situp_sayisi -= sayi;
            System.out.println("mekik sayısı " + situp_sayisi);
        }
    }

    public void squatYap(int sayi) {
        if (squat_sayisi== 0) {
            System.out.println("Yapacak squat kalmadı...");
        }
        else if (squat_sayisi - sayi<0) {
            System.out.println("Sağlamsın ha...");
            squat_sayisi = 0;
        }
        else {
            squat_sayisi -= sayi;
            System.out.println("squat sayısı " + squat_sayisi);
        }
    }
    

    public boolean idmanBittimi() {

        return (mekik == 0) &&
               (pushup_sayisi == 0) &&
               (squat_sayisi == 0) &&
               (situp_sayisi == 0);
        
    }



}