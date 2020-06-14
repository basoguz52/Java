public class Anakart	{

	private String model;

	private String uretici;

	private int yuva_sayisi;

	private String isletim_sistemi;

	public Anakart(String model,String uretici,int yuva_sayisi,String isletim_sitemi){

		this.model = model;
		this.uretici = uretici;
		this.yuva_sayisi = yuva_sayisi;
		this.isletim_sistemi = isletim_sitemi;
	}

	public void isletim_sistemi_yukle(String isletim_sistemi){

		this.isletim_sistemi = isletim_sistemi;

		System.out.println("İşletim sistemi yüklendi: " + isletim_sistemi);

	}

}