import java.util.Scanner;

public class ATM {

    public  void run(Hesap hesap) {
        Login login = new Login();

        Scanner scan = new Scanner(System.in);

        int trials = 3;
        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı ✓");
                break;
            } else {
                System.out.println("-----------------------------");
                System.out.println("Yanlış parola veya kullanıcı adı");
                trials -= 1;
                System.out.println("Kalan deneme sayısı: " + trials);
                System.out.println("-----------------------------");
            }
            if (trials == 0) {
                System.out.println("İnsan hesabını unutur mu ㋡");
                return;
            }
        }

        String islemler = "------------------------" + "\n| Bakiye Öğrenme  ▸  1 |" + "\n|  Para Yatırma  ▸  2  |"
                + "\n|   Para Çekme  ▸  3   |" + "\n|     Çıkış  ▸  q      |" + "\n------------------------";
        System.out.println(islemler);

        while (true) {
            System.out.println("İşlemi seçiniz: ");
            String islem = scan.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz:" + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.print("Çekmek istediğiniz tutar: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            } else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}