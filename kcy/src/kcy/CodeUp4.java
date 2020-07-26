package kcy;
import java.util.StringTokenizer;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.text.SimpleDateFormat;
public class CodeUp4 {

	public static void main(String[] args) throws IOException {
		
		
	    /* 날짜 포멧 변경하기
	     * ********************************
	     * 
		Date day = new Date();
	    System.out.println("day : " + day);
	    SimpleDateFormat format1;
	    format1 = new SimpleDateFormat("MM-dd-yyyy");
	    
	    System.out.println(format1.format(day));
	    
	     * ********************************
	     * */
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();		
	    scan.close();
	    
	    System.out.println("str : " + str);
	    
	    
	    String[] dd = str.split("\\.");

	    System.out.println("dd.length : " +dd.length);
	    
	    for(int i=0 ; i < dd.length; i++) {
	    	System.out.println("dd [" + i +"] : " + dd[i]);
	    }
	    
	    String[] tt = new String[10];
	    
	    //for(int i = 0; i < 10; i++) { ------기존 코드 Index 3 out of bounds for length 3  *i비교
	    for(int i = 0; i < dd.length; i++) {
	    	String token = dd[i];
	    	System.out.println("token : " +token);
	    	tt[i] = token;
	    	System.out.println("tt [" + i +"] : " + tt[i]);
	    }
	    
	    String v = tt[0];
	    String w = tt[1];
	    String x = tt[2];
	    String y = tt[3];
	    String z = tt[4];

	    System.out.println("v : " + v);
	    System.out.println("w : " + w);
	    System.out.println("x : " + x);
	    System.out.println("y : " + y);
	    System.out.println("z : " + z);

	    int a = Integer.parseInt(v);
	    int b = Integer.parseInt(w);
	    int c = Integer.parseInt(x);
	    int d = Integer.parseInt(y);
	    int e = Integer.parseInt(z);
	    
	    System.out.printf("[%d]\n", a*10000);
	    System.out.printf("[%d]\n", b*1000);
	    System.out.printf("[%d]\n", c*100);
	    System.out.printf("[%d]\n", d*10);
	    System.out.printf("[%d]\n", e);
	}

}
