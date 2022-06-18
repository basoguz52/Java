public class Main
{
  public static void main (String[]args)
  {
    System.out.println("\n");
    ProductManager productManager = new ProductManager(new OracleProductDao("Oracle Veritabanına Bağlanma(Erişim) Stringi"));
    productManager.add(new Product(2, "Jelibon", 300));
    System.out.println("\n");
    productManager.add(new Product(1, "Kraker", 20));
    System.out.println("\n");
    ProductManager productManager2 = new ProductManager(new Oguzhan("Selam Söyle"));
    productManager2.add(new Product(3, "Berkinin Karakteri", -100));
    productManager2.bilgileriGoster(new Product(12, "Çikolata", 3));

  }

}