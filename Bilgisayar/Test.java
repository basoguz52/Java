public class Test {

	public static void main(String[] args) {
		
		Resolution resolution1 = new Resolution(1920,1080);
		
		Monitor monitor1 = new Monitor("VS197DE","ASUS","18.5", resolution1 );

		Kasa kasa1 = new Kasa("Shadow Blade","Shadow","Temperli Cam");

		Anakart anakart1 = new Anakart("B250-PRO","ASUS",10,"Windows 10");

		Bilgisayar pc1= new Bilgisayar(monitor1,kasa1,anakart1);

		 
		pc1.getKasa().bilgisayari_ac();

		pc1.getMonitor().monitoru_kapat();
		
		pc1.getAnakart().isletim_sistemi_yukle("Windows XP");
		
	}

}