package terningspill;

import java.util.Random;

public class Terning {

	private int id;    // for å vite hvilken terning det er
	private int verdi;
	private Random random = new Random();

	public Terning(int id) {
		this.id = id;
		verdi = 0;   //hindre NullPointerException
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
	
	
	public void trill() {
		verdi = random.nextInt(6) + 1;  // +1 fordi man går videre til neste verdi på terningen 
	}
	
	
	

}
