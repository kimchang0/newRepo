package kcy;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.IOException;
public class CodeUp {

	public static void main(String[] args) throws IOException {
	    
		
		
		
		
		Scanner scan = new Scanner(System.in);		// 스캐너 변수  scan 선언
	    String str = scan.nextLine();		// 다음 입력값 String으로 받음
	    scan.close();		//scan 닫음
	    
	    StringTokenizer st = new StringTokenizer(str,".");		// 문자열 토큰 회수기 st 선언
	    
	    String[] ymd = new String[3];		// 스트링 값으로 입력받고 크기가 3인 배열 ymd 선언
	    
	    for(int i = 0; i < 3; i++) {		// 포문 i = 0이고 i가 3보다 작을 때 까지(배열과 맞추려고 저렇게 설정) 반복 후치증가 ++
	    	String token = st.nextToken();		//String변수 token 선언 다음 토큰(문자열에서 내가 명령한 특문 제외한 것) token으로 대입
	    	ymd[i] = token;		// token 값을 ymd 배열에 넣음
	    }
	    String yyyy = ymd[0];		// 배열에 들어가있는 값을 스트링 변수로 입력
	    String mm = ymd[1];		// 배열에 들어가있는 값을 스트링 변수로 입력
	    String dd = ymd[2];		// 배열에 들어가있는 값을 스트링 변수로 입력
	    
	    int a = Integer.parseInt(yyyy);		// 배열 값을 입력받은 스트링 변수를 int형으로 변환
	    int b = Integer.parseInt(mm);		// 배열 값을 입력받은 스트링 변수를 int형으로 변환
	    int c = Integer.parseInt(dd);		// 배열 값을 입력받은 스트링 변수를 int형으로 변환
	    System.out.printf("%02d.%02d.%04d", a, b, c);		//서식지정 프린트로 yyyy.mm.dd 형으로 출력(0은 남는자리 0으로 채움 0 뒤는 자릿수)
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
	}
}