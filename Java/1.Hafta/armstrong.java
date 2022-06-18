import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        System.out.print("Basamak sayısını giriniz: ");
        int basamak = scan.nextInt();

        int toplam = 0;
        int gecici = sayi;
        
        do {
            toplam += Math.pow(gecici%10,basamak);
            gecici /= 10;
        }   while (gecici > 0);

        if (toplam == sayi)
            System.out.println("\n" + sayi + " armstrong sayısıdır...");
        else
            System.out.println("\n" + sayi + " armstrong sayısı değildir...");
    }
}

// Math.pow metodunu hem videodan hem de "https://code.replyfeed.com/sorular/5977/java-us-alma-programi-sayinin-kuvvetini-bulma" adresinden öğrendim...