import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Beyblade Arenasına Hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basınız...");

        Scanner scan = new Scanner(System.in);

        while (true)    {
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ?");
            String islem = scan.nextLine();
            if (islem.equals("q"))  {
                System.out.println("Arenadan çıkılıyor...");
                break;
            }
            else {
                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade == null)   {
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
                }
                else    {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }

            
        }
    }
    
}