package kostana.maksic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Deklaracija stringova
				// "dddadaassdfgqerge

				// String ime; // deklaracija stringa
				// String izraz = "Andrija"; // Inicijalizacija stringa
				// System.out.println(izraz); // Ispisivanje vrednosti stringa

				// Ucitavanje (i smestanje unete) vrednosti sa konzole

				Scanner ulaz = new Scanner(System.in);
				System.out.println("Kako se zovete?\t");
				String Ime = ulaz.nextLine();

				System.out.println("Vi se zovete: " + Ime);

				System.out.print("\nKoliko imate godina?\t");
				int brojGodina = ulaz.nextInt();
				System.out.println("Imate godina: " + brojGodina);

				ulaz.close();

			}

		}
