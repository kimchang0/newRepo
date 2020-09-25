package kcy;

import java.util.Scanner;

public class test3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int [] array = new int[num];
		
		int memory = 0;
		int ans = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		int i = 0;
		while(i < array.length) {
			
			
			if(array[i]%2 == 1) {
				int k = 2;
				int check = 0;
				while(k <= 10) {
					if(array[i]%k == 0) {
						check++;
					} else if(array[i]/k == 1 && array[i]/k == 1) {
						if(check == 0) {
							if(memory != i) {
								ans++;
							}
							memory = i;
						}
					}
					
					k++;
				}
			}
			i++;
		}
		
		System.out.println(ans);
		
	}
	
}
