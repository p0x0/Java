import java.util.Scanner;


public class Vbh {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in );
		long x = in.nextInt();
		long ch = x / 60 / 60 % 24;
		long ch1 = x / 60 / 60;
		long h = x / 60 - ch1 * 60;
		long s = x- ch1*3600 - h * 60;
		System.out.println(ch+":"+h/10+""+h%10+":"+s/10+""+s%10);
		
	}

}
