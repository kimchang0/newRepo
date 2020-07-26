package kcy;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.IOException;
public class CodeUp6 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		scan.close();
		int b = Integer.valueOf(a, 8);
		
		System.out.printf("%d", b);
		//https://keichee.tistory.com/351
	}

}
