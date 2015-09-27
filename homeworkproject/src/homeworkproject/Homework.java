
import java.util.Scanner;

public class Homework {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int x = in.nextInt();
		int i = in.nextInt();
		System.out.println(x>>i<<i);
	}

}
