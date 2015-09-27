import java.io.PrintStream;

import java.util.Scanner;




public class JPoQSpT {
	public static Scanner in = new Scanner(System.in);
	
	public static PrintStream out = new PrintStream(System.out);

	public static void main(String[] args) {
		int x = in.nextInt();
		int s = 0;
		while(x>0){
			s= s + (x%10);
			x = x / 10;

		}
		out.println(s);

	}
}
