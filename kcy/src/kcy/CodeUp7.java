package kcy;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.IOException;
public class CodeUp7 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		String hex = scan.nextLine();
		int num = Integer.parseInt(hex, 16);
		String oct = Integer.toOctalString(num);
		System.out.print(oct);
	}

}
