package zahlenumrechner;

import java.util.Scanner;

public class Zahlenumrechner_v1 {
	static Scanner scanMenuEingabe = new Scanner(System.in); //Scanner welcher die Eingaben des Users Scannt und diese in die daf�r vorgesehene Variable zuweist
	static String menuAuswahldesZahlensystems; // Variable in der die User Eingabe gespeichert wird um in dem Menu die 2 Zahlensysteme mit einem Switch/Case verfahren auszuw�hlen
	static String menuAuswahlderRichtung; // Variable in der die User Eingabe gesepeichert wird um in dem Menu die Richtung der umrechnung zu bestimmen mit einem Switch/Case verfahren
	static String menuZahl; // Variable in der die umzurechnende Zahl gespeichert wird die der User eingegeben hat
	static int zahlenlaenge; // Zahlenl�nge der eingabe f�r Dual -> Dezimal da diese Variable von 2 Methoden verwendet wird
	static boolean nochmal = false; // f�r einen zus�tzlichen durchlauf 
	
	public static void main(String[] args) {
		
		do {
			System.out.println("1.Dezimal <--> Dual   2.Dual <--> Hexadezimal   3.Dezimal <--> Hexadezimal");
			System.out.println("Auswahl: ");
			menuAuswahldesZahlensystems = scanMenuEingabe.nextLine(); // Auswahl durch User der 2 Zahlensysteme mit user Eingabe einer Zahl 1-3
			switch (menuAuswahldesZahlensystems) {
			case "1":
				System.out.println("1.Dezimal -> Dual   2.Dual -> Dezimal");
				System.out.println("Auswahl: ");
				menuAuswahlderRichtung = scanMenuEingabe.nextLine();  // Auswahl durch User der richtung Zwischen der 2 zuvor ausgew�hlten Zahlensystemen
				switch (menuAuswahlderRichtung) { 
				case "1":
					System.out.println("Gebe die Dezimale Zahl ein die du umrechnen willst: ");
					menuZahl = scanMenuEingabe.nextLine(); // User eingabe der Zahl die umgerechnet werden soll ind as zuvor ausgew�hlte Zahlensystem
					dezidu(); //Methodenaufruf welche die menuZahl zu einer Dualen Zahl umrechnet und diese ausgibt.
					break;
				case "2":
					System.out.println("Gebe die Duale Zahl ein die du umrechnen willst: ");
					menuZahl = scanMenuEingabe.nextLine();
					dudezi();
					break;
				default:
					System.out.println("Falsche Eingabe!");
					System.out.println(menuAuswahlderRichtung);
					break;
				}
				break;
			case "2":
				System.out.println("1.Dual -> Hexadezimal   2.Hexadezimal -> Dual");
				System.out.println("Auswahl: ");
				menuAuswahlderRichtung = scanMenuEingabe.nextLine();
				switch (menuAuswahlderRichtung) {
				case "1":
					System.out.println("Gebe die Duale Zahl ein die du umrechnen willst: ");
					menuZahl = scanMenuEingabe.nextLine();
					duhex();
					break;
				case "2":
					System.out.println("Gebe die Hexadezimale Zahl ein die du umrechnen willst: ");
					menuZahl = scanMenuEingabe.nextLine();
					hexdu();
					break;
				default:
					System.out.println("Falsche Eingabe!");
					break;
				}
				break;
			case "3":
				System.out.println("1.Dezimal -> Hexadezimal   2.Hexadezimal -> Dezimal");
				System.out.println("Auswahl: ");
				menuAuswahlderRichtung = scanMenuEingabe.nextLine();
				switch (menuAuswahlderRichtung) {
				case "1":
					System.out.println("Gebe die  Dezimale Zahl ein die du umrechnen willst: ");
					menuZahl = scanMenuEingabe.nextLine();
					dezihex();
					break;
				case "2":
					System.out.println("Gebe die  Hexadezimale Zahl ein die du umrechnen willst: ");
					menuZahl = scanMenuEingabe.nextLine();
					hexdezi();
					break;			
				default:
					System.out.println("Falsche Eingabe");
					break;
				}
				break;
			default:
				System.out.println("Falsche Eingabe!");
				break;
			}
			System.out.println("Erneute Umrechnung starten? j/n");
			String neueUmrechnung = scanMenuEingabe.nextLine();
			switch (neueUmrechnung) {
			case "j":
				nochmal=true;
				break;

			default:
				nochmal=false;
				break;
			}
		  } while (nochmal == true);
		}

	private static void dezihex() {
		dezidu();
		duhex();
	}

	private static void hexdu() {
		// TODO Auto-generated method stub
		int menuZahlLaenge = menuZahl.length();
		char[] arrayHexEingabe = menuZahl.toCharArray();
		int stelle = 0;
		String ergebnis = "";
		do {
			if (arrayHexEingabe[stelle]== '0') {
				System.out.println("Keine berechnung an dieser stelle --> "+stelle+" Wert: HEX 0 --> 0");
			} else if (arrayHexEingabe[stelle]=='1') {
				ergebnis += "0001 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX 1 --> DUAL 0001 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='2') {
				ergebnis += "0010 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX 2 --> DUAL 0010 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='3') {
				ergebnis += "0011 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX 3 --> DUAL 0011 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='4') {
				ergebnis += "0100 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX 4 --> DUAL 0100 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='5') {
				ergebnis += "0101 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX 5 --> DUAL 0101 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='6') {
				ergebnis += "0110 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX 6 --> DUAL 0110 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='7') {
				ergebnis += "0111 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX 7 --> DUAL 0111 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='8') {
				ergebnis += "1000 ";
				System.out.println("Stelle: "+stelle+" Wert: Hex 8 --> DUAL 1000 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='9') {
				ergebnis += "1001 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX 9 --> DUAL 1001 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='A'||arrayHexEingabe[stelle]=='a') {
				ergebnis += "1010 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX A --> DUAL 1010 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='B'||arrayHexEingabe[stelle]=='b') {
				ergebnis += "1011 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX B --> DUAL 1011 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='C'||arrayHexEingabe[stelle]=='c') {
				ergebnis += "1100 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX C --> DUAL1100 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='D'||arrayHexEingabe[stelle]=='d') {
				ergebnis += "1101 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX D --> DUAL 1101 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='E'||arrayHexEingabe[stelle]=='e') {
				ergebnis += "1110 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX E --> DUAL 1110 bisheriges Ergebnis: "+ergebnis);
			} else if (arrayHexEingabe[stelle]=='F'||arrayHexEingabe[stelle]=='f') {
				ergebnis += "1111 ";
				System.out.println("Stelle: "+stelle+" Wert: HEX F --> DUAL 1111 bisheriges Ergebnis: "+ergebnis);
			}else {
				System.out.println("Fehler!");
			}
			stelle++;
			menuZahlLaenge--;
		} while (menuZahlLaenge!=0);
	System.out.println("Ergebnis: DUAL "+ergebnis);
		menuZahl= ergebnis;
	}

	public static void duhex() {
		// TODO Auto-generated method stub
		String duzdarst = menuZahl;
		String formatiert = formatiereDualzahlen(duzdarst);
		System.out.println("Formatiert: "+ formatiert);
		int DualzahlLaenge = formatiert.length();
		int anzahlDurchlaeufe = DualzahlLaenge / 4;
		int stelleEins = 0;
		int stelleZwei = 1;
		int stelleDrei = 2;
		int stelleVier = 3;
		String pfeil = " --> ";
		String ergebnis = "";
		
		do {
			char[] dualZahlFormatiertArray = formatiert.toCharArray();
					if (dualZahlFormatiertArray[stelleEins]=='0'&&dualZahlFormatiertArray[stelleZwei]=='0'&&dualZahlFormatiertArray[stelleDrei]=='0'&&dualZahlFormatiertArray[stelleVier]=='0') {
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);	
					}else if (dualZahlFormatiertArray[stelleEins]=='0'&&dualZahlFormatiertArray[stelleZwei]=='0'&&dualZahlFormatiertArray[stelleDrei]=='0'&&dualZahlFormatiertArray[stelleVier]=='1') {
						ergebnis = ergebnis +"1";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);	
					}else if (dualZahlFormatiertArray[stelleEins]=='0'&&dualZahlFormatiertArray[stelleZwei]=='0'&&dualZahlFormatiertArray[stelleDrei]=='1'&&dualZahlFormatiertArray[stelleVier]=='0') {
						ergebnis = ergebnis+"2";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='0'&&dualZahlFormatiertArray[stelleZwei]=='0'&&dualZahlFormatiertArray[stelleDrei]=='1'&&dualZahlFormatiertArray[stelleVier]=='1') {
						ergebnis = ergebnis+"3";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='0'&&dualZahlFormatiertArray[stelleZwei]=='1'&&dualZahlFormatiertArray[stelleDrei]=='0'&&dualZahlFormatiertArray[stelleVier]=='0') {
						ergebnis = ergebnis+"4";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='0'&&dualZahlFormatiertArray[stelleZwei]=='1'&&dualZahlFormatiertArray[stelleDrei]=='0'&&dualZahlFormatiertArray[stelleVier]=='1') {
						ergebnis = ergebnis+"5";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='0'&&dualZahlFormatiertArray[stelleZwei]=='1'&&dualZahlFormatiertArray[stelleDrei]=='1'&&dualZahlFormatiertArray[stelleVier]=='0') {
						ergebnis = ergebnis+"6";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='0'&&dualZahlFormatiertArray[stelleZwei]=='1'&&dualZahlFormatiertArray[stelleDrei]=='1'&&dualZahlFormatiertArray[stelleVier]=='1') {
						ergebnis = ergebnis+"7";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='1'&&dualZahlFormatiertArray[stelleZwei]=='0'&&dualZahlFormatiertArray[stelleDrei]=='0'&&dualZahlFormatiertArray[stelleVier]=='0') {
						ergebnis = ergebnis+"8";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='1'&&dualZahlFormatiertArray[stelleZwei]=='0'&&dualZahlFormatiertArray[stelleDrei]=='0'&&dualZahlFormatiertArray[stelleVier]=='1') {
						ergebnis = ergebnis+"9";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='1'&&dualZahlFormatiertArray[stelleZwei]=='0'&&dualZahlFormatiertArray[stelleDrei]=='1'&&dualZahlFormatiertArray[stelleVier]=='0') {
						ergebnis = ergebnis+"A";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='1'&&dualZahlFormatiertArray[stelleZwei]=='0'&&dualZahlFormatiertArray[stelleDrei]=='1'&&dualZahlFormatiertArray[stelleVier]=='1') {
						ergebnis = ergebnis+"B";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='1'&&dualZahlFormatiertArray[stelleZwei]=='1'&&dualZahlFormatiertArray[stelleDrei]=='0'&&dualZahlFormatiertArray[stelleVier]=='0') {
						ergebnis = ergebnis+"C";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='1'&&dualZahlFormatiertArray[stelleZwei]=='1'&&dualZahlFormatiertArray[stelleDrei]=='0'&&dualZahlFormatiertArray[stelleVier]=='1') {
						ergebnis = ergebnis+"D";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='1'&&dualZahlFormatiertArray[stelleZwei]=='1'&&dualZahlFormatiertArray[stelleDrei]=='1'&&dualZahlFormatiertArray[stelleVier]=='0') {
						ergebnis = ergebnis+"E";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}else if (dualZahlFormatiertArray[stelleEins]=='1'&&dualZahlFormatiertArray[stelleZwei]=='1'&&dualZahlFormatiertArray[stelleDrei]=='1'&&dualZahlFormatiertArray[stelleVier]=='1') {
						ergebnis = ergebnis+"F";
						System.out.print(dualZahlFormatiertArray[stelleEins]);
						System.out.print(dualZahlFormatiertArray[stelleZwei]);
						System.out.print(dualZahlFormatiertArray[stelleDrei]); 
						System.out.print(dualZahlFormatiertArray[stelleVier]);
						System.out.println(pfeil+ergebnis);
					}
			stelleEins+=5;
			stelleZwei+=5;
			stelleDrei+=5;
			stelleVier+=5;
			anzahlDurchlaeufe--;
		} while (anzahlDurchlaeufe!=0);
		System.out.println("Ergebnis: HEX "+ergebnis);
	}
	
	private static String formatiereDualzahlen(String duzdarst) {
		// TODO Auto-generated method stub
		int i, j,  laenge;
		duzdarst.replace(" ", "");
		laenge=duzdarst.length();
		j = 4 - (laenge % 4);
		while (j>0) {
			duzdarst = '0' +duzdarst;
			j--;
		}
		laenge = duzdarst.length();
		for(i = laenge; i>0; i--) {
			if (i%4==0) {
				duzdarst=duzdarst.substring(0, i) +" "+duzdarst.substring(i);
			}
		}
		duzdarst = duzdarst.trim();
		return duzdarst;
	}
	
	private static void hexdezi() {
		// TODO Auto-generated method stub
		hexdu();
		dudezi();
	}
	
	private static void dudezi() {
		// TODO Auto-generated method stub
		int zwischenergebnis;
		int ergebnis = 0;
		int stelle = 0;
		menuZahl = menuZahl.replace(" ", "");
		zahlenlaenge = menuZahl.length();
		do {
				if (menuZahl.charAt(stelle)== '1') {
					 zwischenergebnis = potenzieren();     
					 ergebnis = ergebnis+zwischenergebnis;
					 stelle= stelle+1;
				}else if (menuZahl.charAt(stelle)=='0'){
				stelle= stelle+1;
				zahlenlaenge=zahlenlaenge-1;
				}
		} while ( zahlenlaenge != 0);
		System.out.println("Ergebnis: DEZ "+ergebnis);
	}
	
	public static void dezidu() {
		// TODO Auto-generated method stub
		long zwischensumme;
		long rest;
		long userEingabeZahl= Long.parseLong(menuZahl);
		String ergebnis = "";
			do {
			zwischensumme = userEingabeZahl/2;
			rest=userEingabeZahl % 2;
			userEingabeZahl=zwischensumme;
			if (rest==0) {
				ergebnis= "0" + ergebnis;
			}else {
				ergebnis= "1" + ergebnis;
			}
			} while (userEingabeZahl!=0);
		System.out.println("Ergebnis: BIN "+formatiereDualzahlen(ergebnis));
		menuZahl = ergebnis;	// damit Dezi zu Hex klappt �ber dual 		
	}
	
	public static int potenzieren() {
		int potensErgebnis = 2;
		if (zahlenlaenge == 3) {
			potensErgebnis = 4;
			zahlenlaenge=zahlenlaenge-1;
		}else if (zahlenlaenge == 2) {
			potensErgebnis = 2;
			zahlenlaenge=zahlenlaenge-1;
		}else if (zahlenlaenge == 1) {
			potensErgebnis = 1;
			zahlenlaenge=zahlenlaenge-1;
		}else {
		zahlenlaenge= zahlenlaenge-2;
			for (int i = 0; i < zahlenlaenge; i++) {
				potensErgebnis = potensErgebnis*2;
			}
			zahlenlaenge = zahlenlaenge+1;
		}
		return potensErgebnis;
	}
}

