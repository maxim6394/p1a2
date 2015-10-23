import java.util.Scanner;

public class schaltjahr
{
	public static void main(String... args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Jahreszahl eingeben: ");
		int jahr = scanner.nextInt();

		if(jahr % 4 == 0)
		{
			if(jahr % 100 == 0)
			{
				if(jahr % 400 == 0)
				{
					System.out.println(jahr + " ist ein Schaltjahr");
				}
				else
				{
					System.out.println(jahr + " ist kein Schaltjahr");
				}		
			}
			else
			{
				System.out.println(jahr + " ist ein Schaltjahr");
			}
		}
		else
		{
			System.out.println(jahr + " ist kein Schaltjahr");
		}	
		
	//****************

			System.out.println("Ist "+jahr+" ein Schaltjahr?" + (jahr % 4 == 0 && !(jahr % 100 == 0 && jahr % 400 != 0)));

	}

}
