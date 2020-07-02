public class Oguzhan extends BaseProductDao {

    public Oguzhan(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Oğuzhan Database : " + product.getName() + " eklenemedi...");
    }

    
    
}