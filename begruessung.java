import java.util.Scanner;
import java.util.*;

public class begruessung
{
	public static void main(String... args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte sprache waehlen: (de en it es)");
		String sprache = scanner.next();

		switch(sprache)
		{
			case "de":
			System.out.println("Hallo Welt");
			break;

			case "it":
			System.out.println("Ciao mondo");
			break;
			
			case "en":
			System.out.println("Hello world");
			break;

			case "es":
			System.out.println("...");
			break;

			default:
			System.out.println("Falsche eingabe");		

		}
		
	}

}
