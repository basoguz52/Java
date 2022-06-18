import java.util.Scanner;

public class rakamToplam {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();  //123
        int toplam = 0;

        do  {
            toplam += sayi%10;
            sayi /= 10;
        } while (0 < sayi);

        System.out.println("Rakamların toplamı: " + toplam);

    }
    
}