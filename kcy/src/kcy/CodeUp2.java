package kcy;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.IOException;
public class CodeUp2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    scan.close(); //scan ´ÝÀ½
	    
	    StringTokenizer st = new StringTokenizer(str,"-");
	    
	    String[] ymd = new String[2];
	    
	    for(int i = 0; i < 2; i++) {
	    	String token = st.nextToken();
	    	ymd[i] = token;
	    }
	    String x = ymd[0];
	    String y = ymd[1];
	    
	    int a = Integer.parseInt(x);
	    int b = Integer.parseInt(y);

	    System.out.printf("%06d%d", a, b);
	    //000907-1121112 ÀÔ·ÂÇÏ¸é 0 »ç¶óÁü
	}

}
