
public class Lampa {

	private String styl;
	private boolean jeNaBarky;
	
	public Lampa(String styl, boolean jeNaBarky) {
		this.styl = styl;
		this.jeNaBarky = jeNaBarky;
	}
	
	public void rozniLampu(){
		System.out.println("Lampa se rozla.");
	}

	public String getStyl() {
		return styl;
	}

	public boolean isJeNaBarky() {
		return jeNaBarky;
	}
	
	
	
}
