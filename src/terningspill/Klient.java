package terningspill;

import java.util.Scanner;

public class Klient {

	public static void main(String[] args) {

		Terningspill ts = new Terningspill(1);
		kjorSpill(ts);
		ts.spill();
		ts.finnVinner();
		
	}	
		
	
	public static void kjorSpill(Terningspill ts) {
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Skriv antallet spiller: ");	
		int input = Integer.parseInt(scan.nextLine());
		
			
		for (int i = 0; i < input; i++) {
			System.out.println("Skriv inn navnet på spiller: ");
			ts.leggTilspiller(scan.nextLine());
			System.out.println();
		}
		
		scan.close();
			
	}
		

}
