import java.io.PrintStream;
import java.util.Scanner;


public class Max {
	public static Scanner in = new Scanner(System.in);
	public static PrintStream out = new PrintStream(System.out);
	public static void main(String[] args){
		//Lory's commit
		int a,b,c,max;
		a= in.nextInt();
		b= in.nextInt();
		c= in.nextInt();
		if (a>b){
			max = a;
		}
		 else{
			 max = b;
		}

		if (c>max) max = c;
		out.println(max);
	}
}
