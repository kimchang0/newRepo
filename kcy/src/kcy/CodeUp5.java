package kcy;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.IOException;
public class CodeUp5 {

	public static void main(String[] args) throws IOException {
	    
		
		
		
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    scan.close();
	    
	    StringTokenizer st = new StringTokenizer(str,".");
	    
	    String[] ymd = new String[3];
	    
	    for(int i = 0; i < 3; i++) {
	    	String token = st.nextToken();
	    	ymd[i] = token;
	    }
	    String yyyy = ymd[0];
	    String mm = ymd[1];
	    String dd = ymd[2];
	    
	    int a = Integer.parseInt(yyyy);
	    int b = Integer.parseInt(mm);
	    int c = Integer.parseInt(dd);
	    System.out.printf("%02d-%02d-%04d", c, b, a);
	}

}
