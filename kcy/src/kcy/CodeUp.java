package kcy;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.IOException;
public class CodeUp {

	public static void main(String[] args) throws IOException {
	    
		
		
		
		
		Scanner scan = new Scanner(System.in);		// ��ĳ�� ����  scan ����
	    String str = scan.nextLine();		// ���� �Է°� String���� ����
	    scan.close();		//scan ����
	    
	    StringTokenizer st = new StringTokenizer(str,".");		// ���ڿ� ��ū ȸ���� st ����
	    
	    String[] ymd = new String[3];		// ��Ʈ�� ������ �Է¹ް� ũ�Ⱑ 3�� �迭 ymd ����
	    
	    for(int i = 0; i < 3; i++) {		// ���� i = 0�̰� i�� 3���� ���� �� ����(�迭�� ���߷��� ������ ����) �ݺ� ��ġ���� ++
	    	String token = st.nextToken();		//String���� token ���� ���� ��ū(���ڿ����� ���� ����� Ư�� ������ ��) token���� ����
	    	ymd[i] = token;		// token ���� ymd �迭�� ����
	    }
	    String yyyy = ymd[0];		// �迭�� ���ִ� ���� ��Ʈ�� ������ �Է�
	    String mm = ymd[1];		// �迭�� ���ִ� ���� ��Ʈ�� ������ �Է�
	    String dd = ymd[2];		// �迭�� ���ִ� ���� ��Ʈ�� ������ �Է�
	    
	    int a = Integer.parseInt(yyyy);		// �迭 ���� �Է¹��� ��Ʈ�� ������ int������ ��ȯ
	    int b = Integer.parseInt(mm);		// �迭 ���� �Է¹��� ��Ʈ�� ������ int������ ��ȯ
	    int c = Integer.parseInt(dd);		// �迭 ���� �Է¹��� ��Ʈ�� ������ int������ ��ȯ
	    System.out.printf("%02d.%02d.%04d", a, b, c);		//�������� ����Ʈ�� yyyy.mm.dd ������ ���(0�� �����ڸ� 0���� ä�� 0 �ڴ� �ڸ���)
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
	}
}