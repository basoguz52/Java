import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static int[] arrayi_doldur(int sayi) {
        Scanner scan = new Scanner(System.in);
        int[] cikti = new int[sayi];
        
        for (int i = 0 ; i < sayi ; i++)    {
            cikti[i] = scan.nextInt();
        }
        return cikti;
    }

    public static void arrayi_bastir(int[] array)   {
        for (int i = 0; i < array.length; i++)  {
            System.out.println("Element " + (i+1) + ": " + array[i]);
        }
    }

    public static void array_sort(int [] array) {
        Arrays.sort(array);
        arrayi_bastir(array);
    }

    public static void main(String[] args) {
        //int[] dizi = arrayi_doldur(5);
        //arrayi_bastir(dizi);

        //array_sort(dizi);
        
        int []a1 = {1,2,3,4,5};
        int []b1 = {1,2,3,4,5};

        if (Arrays.equals(a1, b1))   {
            System.out.println("Eşit");
        }
        else    {
            System.out.println("Eşit Değil");
        }
    }
    
}