
public class BytMain {
	
	public static void main(String[] args) {
		
		OvladaniTopeni manualni = new OvladaniTopeni();
		manualni.zmenaTeploty(2);
		manualni.zmenaTeploty(5);
		manualni.zmenaTeploty(3);
		manualni.zmenaTeploty(2);
		manualni.zmenaTeploty(-1);
		
		Topeni centralni = new Topeni("centralni", manualni);
		centralni.ovladaniTopeni(3);
		centralni.ovladaniTopeni(5);		
		centralni.ovladaniTopeni(9);
		centralni.ovladaniTopeni(-2);
		centralni.ovladaniTopeni(3);
		
		Lampa lampa = new Lampa("Moderni", false); 
		
		Pokoj mujPokoj = new Pokoj(4, "drevena", "Kitin", centralni,lampa);
		mujPokoj.getLampa().rozniLampu();
		mujPokoj.topeni();
		centralni.ovladaniTopeni(3);
		
		
	}

}
