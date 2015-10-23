import java.util.Scanner;
import java.util.*;

public class login
{
	public static void main(String... args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Benutzername eingeben: ");
		String user = scanner.next();

		System.out.print("Passwort eingeben: ");
		String pass = scanner.next();

		if(user.equals("ms++so13") && pass.equals("geheim"))
		{
			System.out.println("Login erfolgreich");
		}
		else 
		{
			System.out.println("Login falsch");
		}
	}

}
