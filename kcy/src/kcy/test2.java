package kcy;

public class test2 {

	public static void main(String[] args) {
		
		int array[] = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println(sum(array));
		
	}
	
	public static long sum(int[] a) {
		long b = 0;
		int i = 0;
		
		while(i < a.length) {
			b += a[i];
			i++;
		}
		
		
		
		return b;
	}

}
