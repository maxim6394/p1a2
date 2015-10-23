import java.util.*;


/*
rot: 	0 /	100	/ 50
cyan: 	180 / 100 / 50
grau: 	x	/ 0 / 50
schwarz x / 0 / 0

hier gibts hilfe mit der formel: http://www.wisotop.de/vonRGBnachHSV.shtml
*/

public class rgbnachhsv
{
	public static void main(String... args)
	{	
		Scanner scanner = new Scanner(System.in);
		String input;

		System.out.print("Drei Werte zwischen 0 und 1 eingeben (red, green, blue): ");
		double r = scanner.nextDouble();
		double g = scanner.nextDouble();
		double b = scanner.nextDouble();

		double h,s,v;

		double min = Math.min(b,Math.min(r,g));
		double max = Math.max(b,Math.max(r,g));

		v = max;

		double delta = max - min;

		if(max != 0 )
		{
			s = delta / max;

			if(max == min)
			{
				h = 0;
				s = 0;
			}
			else if (r == max)
			{
				h = (g-b)/delta;
			}
			else if (g == max)
			{
				h = 2 + (b -r ) / delta;
			}
			else
			{
				h = 4 + (b - r) / delta;
				h *= 60;
			}

			if(h<0)
			{
				h+= 360;
			}

		} 
		else
		{
			
			s = 0;
			h = -1;
		}

		System.out.println("H/S/V Werte: "+h+" / "+s+" / "+v);

	}

}
