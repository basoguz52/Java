import java.util.Scanner;

public class Hesap {
    Scanner scan = new Scanner(System.in);

    private String username;
    private String password;
    private int bakiye = 0;
    private int sinir = 1500;

    /*
    public Hesap(String username, String password, int bakiye) {
        this.username = username;
        this.password = password;
        this.bakiye = bakiye;
    }
    */
    

    public void paraCek (int tutar) {
              
        
        if (sinir < 1500) {
            System.out.println("Bir günde en fazla 1500 TL çekebilirsiniz...");
        }
        else if (bakiye - tutar < 0) {
            System.out.println("Akbilim boş\nAkbilim akbilim o benim güzel içi boş akbilim");
            System.out.println("Yetersiz bakiye シ ");
        }
        else {
            sinir -= tutar;
            bakiye -= tutar;
            System.out.println("Yeni bakiye: " + bakiye);
        }
        

    }

    public void paraYatir (int tutar) {
        System.out.print("Yatırdığınız tutarı onaylıyor musunuz?(evet/hayır):" + tutar + " ");
        String onay = scan.nextLine();
        if (onay.equals("evet")) {
            bakiye += tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
            System.out.println("--------------------------");
        }
        else if (onay.equals("hayır")) {
            System.out.println("Lütfen işlemini ve paranızı kontrol edip tekrar deneyiniz...");
        }
        else {
            System.out.println("?=?=?=?=?=?"+"Mekanic Center Olsun"+"?=?=?=?=?=?");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
}