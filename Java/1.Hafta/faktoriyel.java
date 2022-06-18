import java.util.Scanner;


public class faktoriyel {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        long fakt = 1;

        System.out.print("Lütfen faktöriyelini bulmak istediğiniz sayıyı giriniz...");

        long sayi = scan.nextInt();

        for (long a = 1 ; sayi >= a ; a++) {
            fakt *= a;
            //System.out.println("Faktöriyel:" + fakt + "   a : " + a);
        }

        System.out.println(sayi + "! = " + fakt);

    }

}

