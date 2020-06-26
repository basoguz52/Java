public class ProductManager {
    
    public void add(Product product,int databasType)    
    {
        if (databasType == 1)   
        {
            MySqlProductDao mysqlProductDao = new MySqlProductDao("MySql String");
            mysqlProductDao.add(product);
        }
        else if (databasType == 2)  
        {
            OracleProductDao oracleProductDao = new OracleProductDao("Oracle String");
            oracleProductDao.add(product);
        }
        
        
        //İş Katmanı
        System.out.println("Ürün İş Katmanı İşlemleri");
        System.out.println("Ürün İsmi: " + product.getName());
    }
}
