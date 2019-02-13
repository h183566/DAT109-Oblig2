package terningspill;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Terningspill {

	private int id;
	private Kopp k;
	private ArrayList<Spiller> spillere = new ArrayList<>();  //ArrayList fordi et ukjent ant. spillere kan spille 
	
	
	public Terningspill(int id) {
		this.id = id;
		this.k = new Kopp(id);
		spillere = new ArrayList<Spiller>();
	}


	public void leggTilspiller(String navn) {
		Spiller s = new Spiller(navn);
		spillere.add(s);
	}
	
	
	public void spill() {
		for (int i = 0; i < spillere.size(); i++) {
			spillere.get(i).spill(k);   //spill(k) hentet fra Spiller
			System.out.println("Spiller nr. " + (i+1) + " heter " + spillere.get(i).getNavn());
		}

			System.out.println("-------------------------------");
	}
	
	
	public void finnVinner() {
		Spiller vinner = spillere.stream()
			.max(Comparator.comparing(Spiller::getVerdi))
			.orElse(null);
		
		System.out.println("\nVinneren av spillet: " + vinner.getNavn() +
				"\nSummen av de to ternignene: " + vinner.getVerdi());
	}
	
	
}
