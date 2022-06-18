import java.util.Scanner;

public class method {
    
    public static int faktoriyel(int sayi) {

        //Scanner scan = new Scanner(System.in);
        //System.out.print("Lütfen sayı giriniz: ");
        //int sayi = scan.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi ; i++)    {
            faktoriyel *= i;          
        }
        return faktoriyel;
        //System.out.println(sayi + "! = " + faktoriyel);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();
        //faktoriyel(sayi);
        System.out.println(sayi + "!: " + faktoriyel(sayi));
    }
    
}