public class asal {
    /*public static int asalmi(int sayi) {

        int flag = 1;

        for ( int i = 1 ; i != sayi ; i++)  {
                
            if (sayi%i == 0)  {
                flag = 0;
                return flag;
            }       
        
        }
        
        if (flag == 1) {
            System.out.println(sayi + "Asaldır...");
        }

    }*/

    public static void main(String[] args) {
        
        int toplam = 0;

        for (int sayi = 2 ; sayi <=1000 ; sayi++) {
            
            int flag = 1;
            
            for (int i = 2 ; i < sayi ; i++) {
                if (sayi%i == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                toplam +=1;
                System.out.println(sayi + " asaldır " );
            }


        }

        System.out.println(toplam + " tane asal sayı var...");

        
    }
    
}