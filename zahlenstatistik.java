import java.util.Scanner;

public class zahlenstatistik
{
	public static void main(String... args)
	{	

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Drei Zahlen eingeben:");

		double zahl1 = scanner.nextDouble();		
		double zahl2 = scanner.nextDouble();		
		double zahl3 = scanner.nextDouble();	
		
		System.out.println("Summe: "+(zahl1+zahl2+zahl3));	
		System.out.println("Mittelwert: "+(zahl1+zahl2+zahl3)/3);
		System.out.println("Mittelwert: "+(zahl1+zahl2+zahl3)/3);		
		System.out.println("Produkt: "+(zahl1*zahl2*zahl3));

//----------------------------------------------------------------------		

		System.out.print("Kleinste Zahl: (if-else)");
		
		if(zahl1<zahl2)
		{
			if(zahl1<zahl3)
				System.out.print(zahl1);
			else
				System.out.print(zahl3);
		}
		else if(zahl2<zahl3)
			System.out.print(zahl2);
		else
			System.out.print(zahl3);

		System.out.println("");
		
//----------------------------------------------------------------------

		System.out.print("Größte Zahl (if-else): ");

		if(zahl1>zahl2)
		{
			if(zahl1>zahl3)
				System.out.print(zahl1);
			else
				System.out.print(zahl3);
		}
		else if(zahl2>zahl3)
			System.out.print(zahl2);
		else
			System.out.print(zahl3);

		System.out.println("");

//----------------------------------------------------------------------
		
		System.out.println("Kleinste Zahl (Math.min): "+Math.min(Math.min(zahl1, zahl2),zahl3));				

		System.out.println("Kleinste Zahl (Math.max): "+Math.max(Math.max(zahl1, zahl2),zahl3));				

	}
}
