public class Bilgisayar {

	private Monitor monitor;

	private Kasa kasa;

	private Anakart anakart;

	public Bilgisayar(Monitor monitor,Kasa kasa,Anakart anakart) {

		this.monitor = monitor;
		this.kasa = kasa;
		this.anakart = anakart;

	}

	public Kasa getKasa() {
		return kasa;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}

	public Anakart getAnakart() {
		return anakart;
	}

}