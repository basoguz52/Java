public class ProductManager {
    private BaseProductDao baseProductDao;

    public ProductManager(BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }

    public void add(Product product)   {    
        //İş Katmanı
        baseProductDao.add(product);
        System.out.println("Ürün İş Katmanı İşlemleri");
        System.out.println("Ürün İsmi: " + product.getName());
    }

    public void bilgileriGoster(Product product)    {
        System.out.println("Ürünün Kimliği: " + product.getId());
        System.out.println("Ürün : " + product.getName());
        System.out.println("Ürünün Fiyatı: " + product.getPrice());
    }

}