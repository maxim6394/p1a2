import java.util.*;

public class alterberechnen
{
	public static void main(String... args)
	{	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Jahr eingeben: ");
		int year = scanner.nextInt();

		System.out.print("\r\nMonat eingeben: ");
		int month = scanner.nextInt();

		System.out.print("\r\nTag eingeben: ");
		int day = scanner.nextInt();
		
		System.out.println("");

		GregorianCalendar geburtsDatum= new GregorianCalendar(year, month -1, day);		// monat fängt bei der klasse mit 0 an, eingegebener monat soll mit 1 anfangen

		// Java - Objekt mit aktuellem Datum erzeugen
		GregorianCalendar calendar = new GregorianCalendar();
		
		// die Attribute auslesen
		/* wird bei meiner lösung nicht benutzt	
			int jahrHeute = calendar.get(Calendar.YEAR );	
			int monatHeute = calendar.get(Calendar.MONTH );
			int tagHeute = calendar.get(Calendar.DAY_OF_MONTH );	
		*/		

		long diff = calendar.getTimeInMillis() - geburtsDatum.getTimeInMillis();
		
		//die GregorianCalendar klasse kann scheinbar nur millisekunden zurückgeben, also rechne ich in jahre und runde ab
		System.out.println((int)(diff / (1000.0 * 60 * 60 * 24 * 365)) + " Jahre");

	}

}
