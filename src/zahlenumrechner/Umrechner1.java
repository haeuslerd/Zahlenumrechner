package zahlenumrechner;

import java.util.Scanner;

public class Umrechner1 {
	
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String zahl = zahlEinlesen(in);
		
		String duzdarst;
		duzdarst = umrechnungDezimalBinaer(zahl);
		duzdarst = formatiereDualzahlen(duzdarst);
		
		String hexaDualDarstellen;
		hexaDualDarstellen=umrechnungHexainDual(zahl);
		
		
		
		
		System.out.println(duzdarst);
		System.out.println(hexaDualDarstellen);
	}

	

	private static String formatiereDualzahlen(String duzdarst) {
		int i, j, laenge;
		duzdarst = duzdarst.replace(" ", "");
		laenge = duzdarst.length();
		j = 4 - (laenge % 4);
		if (j < 4) {
			while (j > 0) {
				duzdarst = "0" + duzdarst;
				j--;
			}
		}
		laenge = duzdarst.length();
		for (i = laenge; i > 0; i--) {
			if (i % 4 == 0) {
				duzdarst = duzdarst.substring(0, i) + " " + duzdarst.substring(i);
			}
		}
		return duzdarst;
	}

	private static String zahlEinlesen(Scanner in){ 
		System.out.println("Bitte Zahl eingeben: "); 
		String duzdarst = in.next(); return duzdarst;
		
		
	}

	private static String umrechnungDezimalBinaer(String dezdarst) {
		String duzdarst;
		int dez, x;
		duzdarst = "";
		dez = Integer.parseInt(dezdarst);
		do {
			x = dez % 2;
			duzdarst = Integer.toString(x) + duzdarst;
			dez = dez / 2;
		} while (dez > 0);
		return duzdarst;
	}
	
}


