import java.util.Scanner;

public class maas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen maaşınızı giriniz:");

        double maas = scan.nextDouble();
        
        double netmaas = maas * (79.0/100);
        double vergi = maas * (21/100.0);
        double isverenvergi = vergi * (30/100.0);
        double iscivergi = vergi * (70/100.0);

        System.out.println("Net Maaş:" + netmaas);
        System.out.println("Toplam Vergi:" + vergi);
        System.out.println("İşveren Vergi:" + isverenvergi);
        System.out.println("işci Vergi:" + iscivergi);
    
    }
    
}