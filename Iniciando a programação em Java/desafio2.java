import java.io.IOException;
import java.util.Scanner;

public class CPFCLASS
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		String scn = sc.next();
		String x = scn.substring(0, 3);
		String y = scn.substring(4, 7);
		String z = scn.substring(8, 11);
		String d = scn.substring(12, 14);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(d);
		sc.close();
	}
}
