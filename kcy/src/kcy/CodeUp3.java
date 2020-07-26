package kcy;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.IOException;
public class CodeUp3 {

	public static void main(String[] args) throws IOException {
		

		String a;
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();
		scan.close();
		
	    StringTokenizer st = new StringTokenizer(a,".");
	    
	    String[] ymd = new String[2];
	    
	    for(int i = 0; i < 2; i++) {
	    	String token = st.nextToken();
	    	ymd[i] = token;
	    }
	    String x = ymd[0];
	    String y = ymd[1];
	    
	    int b = Integer.parseInt(x);
	    int c = Integer.parseInt(y);

	    System.out.printf("%d\n%d", b, c);
		
		
		
		
	}

}