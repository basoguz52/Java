import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz.");

        double ilksayi = scan.nextDouble();
        
        System.out.println("Lütfen yapılacak işlemi gir,niz\n" 
                            + "Toplama için ==> +\n" 
                            + "Çıkarma için ==> -\n"
                            + "Çarpma için ==> *\n"
                            + "Bölme için ==> /");
        
        String işlem = scan.next();

        while (!(işlem.equals("+") || işlem.equals("-") || işlem.equals("*") || işlem.equals("/"))) {
            System.out.println("Lütfen işlem giriniz");
            işlem = scan.next();
        }
                            
        System.out.println("İkinci sayıyı giriniz.");

        double ikincisayi = scan.nextDouble();

        if (işlem.equals("+")) {System.out.println("Sonuç" + (ilksayi+ikincisayi));}
        else if (işlem.equals("-")) {System.out.println("Sonuç" + (ilksayi-ikincisayi));}
        else if (işlem.equals("*")) {System.out.println("Sonuç" + (ilksayi*ikincisayi)); }      
        else                        {System.out.println("Sonuç" + (ilksayi/ikincisayi));}    
    }
}