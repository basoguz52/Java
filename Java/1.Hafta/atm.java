/* While döngüsü ile atm porgramı...
İşlemler
1.İşlem:Bakiye Öğrenme
2.İşlem:Para Çekme
3.İşlem:Para Yatırma
Çıkış : q
*/
import java.util.Scanner;

public class atm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hoş geldiniz...");
        System.out.print("Bakiyenizi Giriniz: ");

        int bakiye = scan.nextInt();

        while (true) {
            System.out.println("\n------------------------------------------"
            +"\nLütfen yapmak istediğiniz işlemi giriniz" 
            + "\n1.İşlem : Bakiye Öğrenme"
            + "\n2.İşlem : Para Çekme"
            + "\n3.İşlem : Para Yatırma "
            + "\nÇıkış : q");

            String işlem = scan.next();

            if (işlem.equals("1")) {
                System.out.print("Bakiyeniz : " + bakiye);
            }
            else if (işlem.equals("2")) {
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int çekilenPara = scan.nextInt();
                
                if ((bakiye-çekilenPara) >= 0) {    //Bu if bloğu çekilmek istenen paranın bakiyede bulunup bulunmadığını kontrol eder...
                    bakiye -= çekilenPara;          //Aksi durumda bakiyenin yetersiz olduğunu kullanıcıya bildirir...
                    System.out.print("Yeni bakiyeniz: " + bakiye);
                }
                else {
                    System.out.print("Yetersiz bakiye :( \nMevcut bakiyeniz: " + bakiye);
                }
            }
            else if (işlem.equals("3")) {
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                int yatırılanPara = scan.nextInt();
                bakiye += yatırılanPara;
                System.out.print("Yeni bakiyeniz: " + bakiye);
            }
            else if (işlem.equals("q")) {
                System.out.print("ATM'den çıkılıyor...");
                break;
            }
            else {
                System.out.println("Herhangi bir işlem girmediniz...");
            }
        }
    }
}