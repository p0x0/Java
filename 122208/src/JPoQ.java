import java.io.PrintStream;
import java.util.Scanner;

public class JPoQ {
	public static Scanner in = new Scanner(System.in);
	public static PrintStream out = new PrintStream(System.out);

	public static void main(String[] args) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int i = 10000;
		int s = 0;
		
		while(i<100000){
			if (i % a == b && i % c == d){
				s=i;
				out.print(i+" ");
			}


			i++;
		}
		if (s == 0)
			System.out.print("-1");

	}
}
