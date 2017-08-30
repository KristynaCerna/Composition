
public class OvladaniTopeni {

	private int stupen;
	
	public OvladaniTopeni() {
		this.stupen = 1;
	}
	
	private void ovladaniTermostatu(int novyStupen) {
		if (novyStupen > 0 && novyStupen < 7){
		System.out.println("Novy stupen je " + novyStupen); 
		}else{
			System.out.println("Neplatna hodnota!");
		}
	}

	public void zmenaTeploty(int stupen){
		int teplota;
		ovladaniTermostatu(stupen);
		switch(stupen){
		case 1:
			teplota = 15;
			System.out.println("Topeni je na stupni " + stupen +
					". Teplota je nastavena na " + teplota + " °C.");
			break;
		case 2:
			teplota = 18;
			System.out.println("Topeni je na stupni " + stupen +
					". Teplota je nastavena na " + teplota + " °C.");
			break;
		case 3:
			teplota = 20;
			System.out.println("Topeni je na stupni " + stupen +
					". Teplota je nastavena na " + teplota + " °C.");
			break;
		case 4: 
			teplota = 23; 
			System.out.println("Topeni je na stupni " + stupen +
					". Teplota je nastavena na " + teplota + " °C.");
			break;
		case 5:
			teplota = 26;
			System.out.println("Topeni je na stupni " + stupen +
					". Teplota je nastavena na " + teplota + " °C.");
			break;
		case 6:
			teplota = 30;
			System.out.println("Topeni je na stupni " + stupen +
					". Teplota je nastavena na " + teplota + " °C.");
			break;
		default: 
			System.out.println("Nelze zmenit");
		}
	}
	
}
