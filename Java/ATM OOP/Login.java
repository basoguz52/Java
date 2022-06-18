import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Kullanıcı adı: ");
        String username = scan.nextLine();
        
        System.out.print("Sifre: ");
        String password = scan.nextLine();
        

        if (  hesap.getUsername().equals(username) && hesap.getPassword().equals(password)  ) {
            return true;
        }
        else {
            return false;
        }

    }
    
}