import java.util.Scanner;

public class quersumme
{
	public static void main(String... args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ganzzahl eingeben: ");
		int eingabe = scanner.nextInt();
		
		if(eingabe < 0)
		{
			System.out.println("Fehler: Zahl ist negativ");
		}
		else if(eingabe > Short.MAX_VALUE)
		{
			System.out.println("Fehler: Wertebereich überschritten");
		}
		else
		{
			short zahl = (short)eingabe;
			int quersumme = 0;
			while(zahl > 0)	//schleife addiert die letzte stelle zur summe und teilt die zahl dann durch 10 bis die zahl bei 0 ist
			{
				quersumme += zahl % 10;
				zahl /= 10;
			}

			System.out.println("Quersumme: "+quersumme);
		}
	}
}
