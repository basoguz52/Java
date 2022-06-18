public class test {
    public static void main(String[] args) {
        
        Telefon özellikler = new Telefon();

        /*özellikler.brand = "Apple";
        özellikler.model = "İphone";
        özellikler.user_name = "Ozi";
        özellikler.charge = 100;
        özellikler.volume = 5;

        System.out.println("Phone Brand : " + özellikler.brand);
        System.out.println("Phone Model : " + özellikler.model);
        System.out.println("Phone Username : " + özellikler.user_name);
        System.out.println("Phone Charge  : " + özellikler.charge);
        System.out.println("Phone Volume : " + özellikler.volume);
        */
        özellikler.setModel("İphone");
        System.out.println("Phone Model: " + özellikler.getModel());

        özellikler.setBrand("Apple");
        System.out.println("Phone Brand: " + özellikler.getBrand());

        özellikler.setCharge(-2);
        //System.out.println(özellikler.getCharge());

    
    }
    
}