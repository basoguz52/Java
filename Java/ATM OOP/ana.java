import java.util.Scanner;

public class ana {

    public static void main(String[] args) {
        System.out.println("╭──────────────╮\n"
                          +"| ✦✧✦✧✦✧✦✧✦✧✦✧ |\n"
                          +"| Oğuzhan  ATM |\n"
                          +"| ✦✧✦✧✦✧✦✧✦✧✦✧ |\n"
                          +"╰──────────────╯\n");
        
        ATM atm = new ATM();
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı adı girin: ");
        String username = scan.nextLine();
        System.out.print("Sifreyi oluşturun: ");
        String password = scan.nextLine();
        
        Hesap hesap1 = new Hesap();
        hesap1.setUsername(username);
        hesap1.setPassword(password);
        //Hesap hesap2 = new Hesap(username, password, bakiye)

        atm.run(hesap1);
        System.out.println("Görüşmek Üzere...");

    }

}