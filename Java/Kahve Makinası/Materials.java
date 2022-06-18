public class Materials {

    private double amount;
    private double capacity;
    
	public boolean Add(double amount) {
        if (this.amount + amount <= capacity) {
            return true; // Eklenen miktar kapasiteyi geçmedi
        } 
        else {
            return false;  //false mu true mu ???????    // + "Uyarı,hazne tamamıyla doldu!!!";
        }
    }

    public boolean Reduce( double amount) {
        if (this.amount-amount < 0 ) {
            return false;
        }       
        else if (this.amount == amount) {
            return true;    //  + unit + " bitti!!!";
        }
        else {
            return true;
        }

    }

    public Materials(double amount, double capacity) {
        this.amount = amount;
        this.capacity = capacity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

}