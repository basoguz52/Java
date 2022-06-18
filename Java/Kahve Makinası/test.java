public class test {

    public static void main(String[] args) {
        Materials bardaksayisi = new Materials(0, 300);
        Materials water = new Materials(0, 35000);
        Materials coffee = new Materials(0, 10000);
        Materials milk = new Materials(0, 15000);
        //Sugar seker = new Sugar(0, 5000, "KG"); //hata
        Materials seker = new Materials(0, 5000);

        System.out.println(seker.Add(123));
        //System.out.println(seker.getTip());
        System.out.println(seker.Add(12)); //boolean olması sebebi ile ekleyemiyoruz bunu set metodu ile kullanmalıyız...
        System.out.println(seker.getAmount()); //add metodunun değeri değiştirmediğini gösteriyor...
        System.out.println(seker.getCapacity());
        System.out.println(bardaksayisi.getAmount());
        System.out.println(bardaksayisi.Reduce(1));
        System.out.println(bardaksayisi.Reduce(0));
        System.out.println(milk.Add(15000));
        System.out.println(milk.Add(15001));
        System.out.println(water.Add(1));

    }
    
}