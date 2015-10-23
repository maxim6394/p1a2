import java.util.Scanner;

public class registrieren
{
	public static void main(String... args)
	{	

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Benutzername: ");
		String user = scanner.next();

		System.out.print("E-Mail: ");		
		String email = scanner.next();		

		System.out.print("Passwort: ");
		String pass = scanner.next();

		System.out.print("Passwort wiederholen: ");
		String pass2= scanner.next();

		if(user.length() == 0)
			System.out.println("Fehler: Benutzername ist leer!");
		if(!email.contains("@"))
			System.out.println("Fehler: ungueltige Email!");
		if(pass.compareTo(pass2) != 0)
			System.out.println("Fehler: falsche Wiederholung des Passworts");	
	}
}
