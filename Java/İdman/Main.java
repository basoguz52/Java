import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //İdman egzersiz = new İdman(4, 2, 4, 6);

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hoşgeldiniz...");
        
        System.out.print("Mekik Sayısı: ");
        int hedef_mekik = scan.nextInt();

        System.out.print("Pushup Sayısı: ");
        int hedef_pushup = scan.nextInt();

        System.out.print("Squat Sayısı: ");
        int hedef_squat = scan.nextInt();

        System.out.print("Situp Sayısı: ");
        int hedef_situp = scan.nextInt();

        scan.nextLine();
        

        İdman idman = new İdman(hedef_mekik, hedef_pushup, hedef_situp, hedef_squat);

        /*
        System.out.println("Geçerli hareketler;\n"
                          +"Mekik\n"
                          +"Pushup\n"
                          +"Situp\n"
                          +"Squat\n"
                          +"*-*-*-*-*\n");
        */

        while (idman.idmanBittimi() == false) {
            System.out.println("Hangi hareketi yapacaksınız...\n----------------------\n"
                          +"Hareketin ismini giriniz..."
                          +"\nMekik: " + idman.getMekik()
                          +"\nPushup: " + idman.getPushup_sayisi()
                          +"\nSitup: " + idman.getSitup_sayisi()
                          +"\nSquat: " + idman.getSquat_sayisi());
            String tur = scan.nextLine();
            //scan.nextLine();
            System.out.print("Kaç tane bu hareketten yapacaksınız: ");
            int sayi = scan.nextInt();
            scan.nextLine();

            idman.hareketYap(tur, sayi);


        }

        System.out.println("İdmanınız bitti");
        System.out.println("Sporla kalın,Sağlıklı kalın");
        System.out.println("İyi Günler...");

    }


}