import java.util.Scanner;

public class ebob {

    public static int ebob(int a,int b) {
        
        int ebob = 1;
        for (int i = 1 ; i <= a && i <= b ; i ++) {

            if ( (a%i==0) && (b%i==0) ) {
                ebob = i;
            }
            
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        int birinci = scan.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        int ikinci = scan.nextInt();

        System.out.println("Girdiğiniz sayıların EBOB'u " + ebob(birinci,ikinci) );
    }
    
}