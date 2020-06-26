public class Main
{
  public static void main (String[]args)
  {
    ProductManager productManager = new ProductManager ();
      productManager.add (new Product (1, "Su", 2), 1);
      System.out.println ("\n");
      //Bir arayC<z uygulamasD1ndaki farklD1 ekranlar olduDunu dC<EC<nebiliriz...
      //Main2
      System.out.println ("Main 2");
      productManager.add (new Product (1, "Su", 2), 2);
  }
}
