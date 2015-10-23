import java.util.Scanner;

public class kaffeeautomat
{
	public static void main(String... args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		double espresso = 0.8, kaffee = 0.5, milch = 0.2, zucker = 0.3;
		double gesamt = 0.0;

		System.out.print("Bitte wählen: Espresso (e), Kaffee (k):");

		String inputGetraenk, inputMilch, inputZucker;
		inputGetraenk = scanner.next().toLowerCase();	//eingabe in kleinbuchstaben umwandeln um beide möglichkeiten abzudecken
		
		System.out.print("Milch (J/N)? ");
		inputMilch = scanner.next().toLowerCase();

		System.out.print("Zucker (J/N)? ");
		inputZucker = scanner.next().toLowerCase();
		
		if(inputGetraenk.equals("e"))
		{
			gesamt += espresso;
		}
		else if(inputGetraenk.equals("k"))
		{
			gesamt+= kaffee;
		}
		else
		{
			System.out.println("Ungültige Auswahl des Getränks.");
		}

		if(inputMilch.equals("j"))
		{
			gesamt += milch;
		}
		else if (!inputMilch.equals("n"))
		{
			System.out.println("Ungültige Auswahl bei Milch.");
		}

		if(inputZucker.equals("j"))
		{
			gesamt += zucker;
		}
		else if (!inputZucker.equals("n"))
		{
			System.out.println("Ungültige Auswahl bei Zucker.");
		}


		System.out.print("Zu zahlen sind: "+gesamt+" Euro");
			
	}

}
