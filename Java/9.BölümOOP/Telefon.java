public class Telefon {

    private int volume;
    private String brand;
    private String model;
    private int charge;
    private String user_name;

    //set ve get metodu oluştumak için sağ tık + kaynak eylemi ==> set ve get models

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {

        if (charge > 0) {
            this.charge = charge;
        }
        else {
            System.out.println("Low Charge...");
            //this.charge = charge;
        }
        
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

}