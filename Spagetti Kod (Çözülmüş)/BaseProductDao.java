public class BaseProductDao {
    
    private String connectionString; //connectionString : Bağlanmak istediğimiz veritabanını na erişmek için kullandığımız yol...
    
    public BaseProductDao(String connectionString) {
        this.connectionString = connectionString;
    }
    
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void add(Product product)    {
        System.out.println("Default Database : " + product.getName());
    }

    

}