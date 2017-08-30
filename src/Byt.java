
public class Byt {

	private int steny;
	private String podlaha;
	private Topeni topeni; 
	
	public Byt(int steny, String podlaha, Topeni topeni) {
		this.steny = steny;
		this.podlaha = podlaha;
	}
	
	public Byt(int steny, String podlaha) {
		this.steny = steny;
		this.podlaha = podlaha;
	}

	public int getSteny() {
		return steny;
	}

	public String getPodlaha() {
		return podlaha;
	}
	
}
