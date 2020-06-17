public class Abone {
    
    public String isim;
    
    public int bakiye;
    
    public String sehir;
    
    public void gaz_kullan(int miktar) {
        
        if((this.bakiye - miktar) < 0) {
            
            System.out.println("Yeterli bakiye yok...");
            
        }
        else {
            this.bakiye -= miktar;
            
            if (this.bakiye <= 0) {
                
                System.out.println("Bakiyeniz bitmiştir lütfen en yakın abone merkezine giderek kredi yükleyiniz...");
                System.out.println("Kredi Limiti 120 TL...");
            }
            
            else {
                
                System.out.println("Yeni bakiye" + bakiye);
            }
        }
        
    }
    
    public void bakiye_ogren() {
        System.out.println("Bakiyeniz: " + bakiye);
    }
   
}
