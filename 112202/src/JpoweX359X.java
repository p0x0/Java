import java.io.PrintStream;
import java.util.Scanner;

public class JpoweX359X {
	public static Scanner in = new Scanner(System.in);
	public static PrintStream out = new PrintStream(System.out);

	public static void main(String[] args) {
		long x = in.nextInt();
		long n = in.nextInt();
		int i;
		long s;
		i = 0;
		s = 0;
		while (i < Math.abs(n)) {
			s = s + x;
			i++;

		}
		if (x != 0) {
			if (n / x > 0) {
				s = Math.abs(s);
			} else if (n < 0)
				s = s * (-1);

		}

		out.println(s);
	}

}
