package terningspill;

public class Spiller {

	private String navn;
	private int verdi;
	
	public Spiller (String navn) {
		this.navn = navn;
		verdi = 0;   //hindre NullPointerException
	}
	
	public String getNavn() {
		return navn;
	}

	
	public void setNavn(String navn) {
		this.navn = navn;
	}


	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}



	public void spill(Kopp kopp) {
		kopp.trill();
		verdi = kopp.getSum();
	}
	
	
}
