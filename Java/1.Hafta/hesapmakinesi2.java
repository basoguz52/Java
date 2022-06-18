import java.util.Scanner;

public class hesapmakinesi2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz: ");

        double sayi = scan.nextDouble();

        double sonuc = sayi;

        //String işlem = scan.next();
        System.out.println("\nLütfen yapılacak islemi giriniz\n" 
        + "Toplama için ==> +\n" 
        + "Çıkarma için ==> -\n"
        + "Çarpma için ==> *\n"
        + "Bölme için ==> /\n"
        + "Sonuç için ==> =");

        while (true) {

            System.out.print("İşlemi giriniz: ");

            String işlem = scan.next();
            
            if (işlem.equals("+")) {
                System.out.print("Sayı giriniz: ");
                double sayi2 = scan.nextDouble();
                sonuc += sayi2;
            }
            else if (işlem.equals("-")) {
                System.out.print("Sayı giriniz: ");
                double sayi2 = scan.nextDouble();
                sonuc -= sayi2;
            }
            else if (işlem.equals("*")) {
                System.out.print("Sayı giriniz: ");
                double sayi2 = scan.nextDouble();
                sonuc *= sayi2;
            }
            else if (işlem.equals("/")) {
                System.out.print("Sayı giriniz: ");
                double sayi2 = scan.nextDouble();
                sonuc /= sayi2;
            }
            else if (işlem.equals("=")) {
                System.out.print("Sonuç ==> " + sonuc);
                break;
            }
            else {
                System.out.println("\n----------------------------------------------------"
                                    +"\nGeçerli bir işlem girmediniz..."
                                    +"\n----------------------------------------------------");
            }
        } 
    }
}