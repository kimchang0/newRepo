package kcy;

public class soloStudy {

	public static void main(String[] args) {

		
		int i = 1;
		long j = 1;
		
		while(true) {
			i++;
			j *= i;
			System.out.printf("i = %d, j = %d\n", i, j);
			if(i == 100) {
				break;
			}
		}
		
		System.out.println(j);
		
		
	}

}
