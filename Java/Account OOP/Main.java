public class Main {
    
    public static void main(String[] args) {
        Account hesap = new Account();
        Account oguzhan = new Account("123456789",0, "Oğuzhan", "basoguz52@hotmail.com", "05462425291");
        //System.out.println(hesap.getHesapNo());
        System.out.println("Bakiye: " + oguzhan.getBakiye());
        System.out.println(oguzhan.getHesapNo());
        System.out.println(oguzhan.getIsim());
        System.out.println(oguzhan.getEmail());
        System.out.println(oguzhan.getTelefonNo());

    }
}