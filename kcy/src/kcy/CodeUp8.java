package kcy;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp8 {

	public static void main(String[] args) throws IOException {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		 * 
		 * System.out.print((a > b ? b : a) < c ? (a > b ? b : a) : c);
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt();
		 * 
		 * 
		 * 
		 * if(a >= 1) { if(a % 2 == 0) { System.out.println("plus");
		 * System.out.println("even"); } else { System.out.println("plus");
		 * System.out.println("odd"); } } else { if(a % 2 == 0) {
		 * System.out.println("minus"); System.out.println("even"); } else {
		 * System.out.println("minus"); System.out.println("odd"); } }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt();
		 * 
		 * if (a >= 90) { System.out.println("A"); } else if (89 >= a && a >= 70) {
		 * System.out.println("B"); } else if (69 >= a && a >= 40) {
		 * System.out.println("C"); } else if (39 >= a && a >= 0) {
		 * System.out.println("D"); }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt();
		 * 
		 * switch(a) { case 12: case 1: case 2: System.out.println("winter"); break;
		 * case 3: case 4: case 5: System.out.println("spring"); break; case 6: case 7:
		 * case 8: System.out.println("summer"); break; case 9: case 10: case 11:
		 * System.out.println("fall"); break;
		 * 
		 * }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = 1;
		 * 
		 * while(a != 0) { a = sc.nextInt(); if(a == 0) {
		 * 
		 * } else { System.out.println(a); } }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * long a = sc.nextInt();
		 * 
		 * 
		 * while (a != 0) { long b = sc.nextInt(); System.out.println(b); a--; }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * char a = sc.next().charAt(0); char b = 97; while(a != 96) {// A = 65 Z = 91 a
		 * = 97
		 * 
		 * System.out.printf("%c ", b); b++; a--; }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int b = 0; while(a != -1) {// A = 65 Z = 91 a = 97
		 * 
		 * System.out.printf("%d\n", b); b++; a--; }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int b = 1; int c = 0; while(a != 0) {// A = 65 Z = 91 a
		 * = 97 if(b % 2 ==0) { c = c + b; } b++; a--; } System.out.println(c);
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * char a = 2; char g = 1; while(a != g) { a = sc.next().charAt(0); if(a == 'q')
		 * { System.out.println(a); g = 'q'; } else { System.out.println(a); } }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int k = 0; for (int i = 0; i<=a; i++) { if (k < a) { k
		 * = k + i; } else{ System.out.println(i-1); break; } }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int k = sc.nextInt();
		 * 
		 * for(int i = 1; i <= a; i++) { for(int j = 1; j <= k; j++) {
		 * System.out.printf("%d %d\n", i, j); }
		 * 
		 * }
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * char a = sc.next().charAt(0);
		 * 
		 * for(int i = 0; i <= 15; i++) {
		 * 
		 * }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("�����Է� : "); String a = sc.nextLine();
		 * 
		 * //����ǥ������ �̿� ^A����-Z���� boolean flag = Pattern.matches("^[A-Z]*$", a);
		 * 
		 * if(flag) { //String�� 16������ ����ȯ int num = Integer.parseInt(a, 16);
		 * 
		 * for(int i=1; i<16; i++) { // %X ������ 16�������� ǥ�� %n�� �ڵ��Ǵ� �ٹٲ�
		 * System.out.format("%X*%X=%X%n",num,i,num*i); } }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int b = 1; while(a != 0) { if(b % 3 ==0) {
		 * System.out.printf("X "); } else { System.out.printf("%d ", b); } b++; a--; }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d =
		 * sc.nextInt();
		 * 
		 * for(int i = 0; i < a; i++) { for(int j = 0; j < b; j++) { for(int k = 0; k <
		 * c; k++) { System.out.printf("%d %d %d\n", i, j, k); d++; } } }
		 * System.out.print(d);
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int h = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int s =
		 * sc.nextInt(); double total = h * b * c * s; double result =
		 * ((total/8)/Math.pow(2, 10))/Math.pow(2, 10);
		 * System.out.format("%.1f MB",result);
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int h = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); double
		 * total = 0;
		 * 
		 * total = (double) h * b * c;
		 * 
		 * double result = ((total/8)/Math.pow(2, 10))/Math.pow(2, 10);
		 * System.out.format("%.2f MB",result);
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int k = 0; for (int i = 0; i<=1000000000; i++) { if (k
		 * < a) { k = k + i; } else{ System.out.println(k); break; } }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int b = 1; while(a != 0) { if(b % 3 ==0) {
		 * System.out.printf(""); } else { System.out.printf("%d ", b); } b++; a--; }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * long h = sc.nextInt(); long b = sc.nextInt(); long d = sc.nextInt(); long c =
		 * sc.nextInt();
		 * 
		 * for(int i = 1; i < c; i++) { h = (h * b)+d; } System.out.println(h);
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * long a = sc.nextInt(); long b = sc.nextInt(); long c = sc.nextInt();
		 * 
		 * int day = 1; while(day % a != 0 || day % b != 0 || day % c != 0) { day++; }
		 * System.out.println(day);
		 * 
		 */

		/*
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * int d[] = new int[24]; for(int i = 0; i <24; i++) { long a = sc.nextInt();
		 * d[i] = d[i] + 1; }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n, j, i, x, y; n = sc.nextInt(); int a, b; int [][] c = new int[20][20];
		 * for(i = 0; i < n; i++) { a = sc.nextInt(); b = sc.nextInt(); c[a][b] = 1; }
		 * for(i=1; i<=19; i++) //�� ��(������ �Ʒ���) �� { for(j=1; j<=19; j++) //�� ��(���ʿ���
		 * ����������) �� { System.out.printf("%d ", a[i][j]); //�� ��� }
		 * System.out.printf("\n"); //�� �ٲٱ� } //String[][] dd = a.split("\\.");
		 * 
		 * //String[][] c = new String[20][20];
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int arr[][]= new int[20][20]; int x,y;
		 * 
		 * int n = sc.nextInt();
		 * 
		 * for(int i = 0; i < n; i++) { x = sc.nextInt(); y = sc.nextInt(); //��ĭ�� ���ܼ�
		 * �Էµ������Ƿ� -1�� ���ش� arr[x-1][y-1] = 1; } for(int i = 0; i < arr.length-1; i++) {
		 * //�� for(int j = 0; j < arr.length-1; j++) { //��
		 * System.out.print(arr[i][j]+" "); } System.out.println(); }
		 */
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * try { String[][] arr = new String[19][19];
		 * 
		 * //�ٵϾ��� ����ִ� ��Ȳ 19*19�� �Է¹޴´� for(int i = 0; i < arr.length; i++) { //String
		 * �迭�� " "�� �������� �ϳ��� �߶� ��� ��´� String[] ar1 = br.readLine().split(" "); for(int
		 * j = 0; j < arr.length; j++) { //[��][��] �߶��� ���ڵ��� ���� [j]�������� ��� ��´� arr[i][j] =
		 * ar1[j]; } }
		 * 
		 * //���� �ڱ�� Ƚ��(n)�� �Է¹޴´� int n = Integer.parseInt(br.readLine());
		 * 
		 * ArrayList<String> list = new ArrayList<String>();
		 * 
		 * //���� �ڱ��� ��ǥ�� Ƚ��(n)��ŭ �Էµȴ� for (int i = 0; i < n; i++) {
		 * list.add(br.readLine()); //list�� [10 10, 12 12] ���� }
		 * //System.out.println(list);
		 * 
		 * for (int i = 0; i < list.size(); i++) {
		 * 
		 * //String �迭�� " "�� �������� ��ǥ�� �߶� �����Ѵ� String[] point = list.get(i).split(" ");
		 * 
		 * int x = Integer.parseInt(point[0]); int y = Integer.parseInt(point[1]);
		 * 
		 * for (int j = 0; j < 19; j++) { if(arr[x-1][j] == "0"){ //x�� 0�̸� arr[x-1][j] =
		 * 1 + ""; //1�� �־��ش� }else{ arr[x-1][j] = 0 + ""; //�ƴϸ� 0�� �־��ش� } } for (int j =
		 * 0; j < 19; j++) { if(arr[j][y-1] == "0"){ //y�� 0�̸� arr[j][y-1] = 1 + ""; //1��
		 * �־��ش� }else{ arr[j][y-1] = 0 + ""; //�ƴϸ� 0�� �־��ش� } } }
		 * 
		 * //��ü ��� for�� for (int i = 0; i <arr.length; i++) { for (int j = 0; j <
		 * arr[i].length; j++) { System.out.print(arr[i][j] + " "); }
		 * System.out.println(); }
		 * 
		 * 
		 * }catch(NumberFormatException e) { e.printStackTrace(); }
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * int a = sc.nextInt(); int b = sc.nextInt(); int sum = 0; int sum2 = 0; if(a <
		 * b) { for(int i = a; i <= b; i++) { sum += i; } System.out.print(sum); } else
		 * if(a > b){ for(int j = b; j <= a; j++) { sum2 += j; } System.out.print(sum2);
		 * } else if(a == b) { System.out.print(a); }
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * int x = sc.nextInt(); int n = sc.nextInt(); long[] answer = new long[n];
		 * 
		 * for(int i = 1; i <= n; i++) { answer[i-1] += x * i;
		 * System.out.print(answer[i]); }
		 * 
		 */

		/*
		 * long n = sc.nextInt();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * long answer = 0;
		 * 
		 * for(int i = 1; i <= n; i++) { if(Math.pow(i, 2) == n) { answer = (long)
		 * Math.pow(i+1, 2); break; } else if (Math.pow(i, 2) != n) { answer = -1; } }
		 * // ������ �ȹ��� �� �����ϴ� ���� ����� System.out.println(answer);
		 */
		/*
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int h = 1; h <= t; h++) {

			int a = scan.nextInt();
			int b = scan.nextInt();
			long c = 1;
			long d = 1;
			int count = 0;
			System.out.println(System.nanoTime() + "ddddddd");
			for (int i = 1; i <= a; i++) {
				count = 1;
				for (int k = 1; k <= b; k++) {
					if (i < k) {
						count++;
						System.out.println("count = " + count);
					}
				}
				c *= count;
			}
			for (int i = 1; i <= a; i++) {
				d *= i;
			}
			System.out.println(c / d);
		}
		 */
		/*
		 * int a = scan.nextInt(); int b = scan.nextInt(); int m = 1; int n = 1; for
		 * (int i = a; i >= a - b + 1; i--) {
		 * 
		 * m *= i;
		 * 
		 * } for (int j = 1; j <= b; j++) { n *= j; }
		 * 
		 * System.out.println(m/n);
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		long b = scan.nextLong();
		int c = 0;
		
		while(b != 0) {
			c += b % 10;
			b /= 10;
		}
		System.out.println(c);
	
		
		
		
	}
}
