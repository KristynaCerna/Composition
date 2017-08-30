
public class Topeni {

	private String typ;
	private int teplota;
	private int stupen;
	private OvladaniTopeni termostat;
	
		public Topeni(String typ, OvladaniTopeni termostat) {
		this.typ = typ;
		this.teplota = 15;
		this.stupen = 1;
		this.termostat = termostat;
	}
		public void jeZapnuto(){
			System.out.println("Topeni je zapnuto.");
			ovladaniTopeni(stupen);
		}

	public void ovladaniTopeni(int stupen){
		termostat.zmenaTeploty(stupen);
	}
	
}
