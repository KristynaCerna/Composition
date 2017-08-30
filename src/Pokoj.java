
public class Pokoj extends Byt{

	private String nazev;
	private Topeni topeni;
	private Lampa lampa;
	
	public Pokoj(int steny, String podlaha, String nazev, Topeni topeni, Lampa lampa) {
		super(steny, podlaha);
		this.nazev = nazev;
		this.topeni = topeni;
		this.lampa = lampa;
	}
	
	public Lampa getLampa(){
		return this.lampa;
	}
	
	public void topeni(){
		topeni.jeZapnuto();
	}
	

	public String getNazev() {
		return nazev;
	}

	public Topeni getTopeni() {
		return topeni;
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
}
