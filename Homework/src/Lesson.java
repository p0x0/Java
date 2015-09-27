import java.util.Scanner;


public class Lesson {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in );
		int x =in.nextInt();
		int minuta = x % 60;

		int chas = x/60 % 24;
		
		
		System.out.println(chas + " " + minuta);
	}

}
