package kcy;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.printf("점수를 입력하세요.==>");
		/*
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		
		
		switch (inputNum) {
		case 100:
		case 90:
		System.out.println("수");
			
			break;
			
		case 80:
		System.out.println("우");	
			break;
			
		case 70:
		System.out.println("미");	
			break;
			
		default:
		System.out.println("try again!!");
			break;
		}
		*/
		
		//inputNum.close();
		
		
		/*		System.out.print("INPUT NUMBER : ");
		int inputNum = scanner.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		}
		*/
		/*
		System.out.print("INPUT NUMBER : ");
		int ipN = scanner.nextInt();
		
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", ipN, i, (ipN * i));
			i++;
		}

		
	//	inputNum.close();
		
		*/
		
		/* 
		int j;
		
		for (j = 1; j <= 10; j++) {
			int hap = 0;
			hap += j;
		}
		
		System.out.printf(" 1에서 10까지의 합: %d \n", hap);
		*/
		
		
		
		/*
		
		String c1 = "*";
		String c2 = "**";
		String c3 = "***";
		String c4 = "****";
		String c5 = "*****";
		String c6 = "******";
		
		for (int i = 0; i < 6; i++) {
			switch(i) {
			case 0:
				System.out.printf("%s \n" , c1);
			break;
			case 1:
				System.out.printf("%s \n" , c2);
			break;
			case 2:
				System.out.printf("%s \n" , c3);
			break;
			case 3:
				System.out.printf("%s \n" , c4);
			break;
			case 4:
				System.out.printf("%s \n" , c5);
			break;
			case 5:
				System.out.printf("%s \n" , c6);
			break;
			}
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < 11; i++) {
			switch(i) {
			case 0:
				System.out.printf("%s \n" , c1);
			break;
			case 1:
				System.out.printf("%s \n" , c2);
			break;
			case 2:
				System.out.printf("%s \n" , c3);
			break;
			case 3:
				System.out.printf("%s \n" , c4);
			break;
			case 4:
				System.out.printf("%s \n" , c5);
			break;
			case 5:
				System.out.printf("%s \n" , c6);
			break;
			case 6:
				System.out.printf("%s \n" , c5);
			break;
			case 7:
				System.out.printf("%s \n" , c4);
			break;
			case 8:
				System.out.printf("%s \n" , c3);
			break;
			case 9:
				System.out.printf("%s \n" , c2);
			break;
			case 10:
				System.out.printf("%s \n" , c1);
			break;
			}
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < 6; i++) {
			switch(i) {
			case 0:
				System.out.printf("%6s \n" , c1);
			break;
			case 1:
				System.out.printf("%6s \n" , c2);
			break;
			case 2:
				System.out.printf("%6s \n" , c3);
			break;
			case 3:
				System.out.printf("%6s \n" , c4);
			break;
			case 4:
				System.out.printf("%6s \n" , c5);
			break;
			case 5:
				System.out.printf("%6s \n" , c6);
			break;
			}
		}

		System.out.println(" ");
		
		for (int i = 0; i < 11; i++) {
			switch(i) {
			case 0:
				System.out.printf("%6s \n" , c1);
			break;
			case 1:
				System.out.printf("%6s \n" , c2);
			break;
			case 2:
				System.out.printf("%6s \n" , c3);
			break;
			case 3:
				System.out.printf("%6s \n" , c4);
			break;
			case 4:
				System.out.printf("%6s \n" , c5);
			break;
			case 5:
				System.out.printf("%6s \n" , c6);
			break;
			case 6:
				System.out.printf("%6s \n" , c5);
			break;
			case 7:
				System.out.printf("%6s \n" , c4);
			break;
			case 8:
				System.out.printf("%6s \n" , c3);
			break;
			case 9:
				System.out.printf("%6s \n" , c2);
			break;
			case 10:
				System.out.printf("%6s \n" , c1);
			break;
			}
		}
		*/
		
		/*
		int i;
		int j;
		int k;
		
		for (i = 0; i < 6; i++) {
			for (j = 0; j <= i; j++) {
				System.out.printf("*");
			}
				System.out.println();
			
		}
		
		System.out.println();
		i=0;
		j=0;
		
		for (i = 0; i < 6; i++) {
			for (j = 0; j <= i; j++) {
				System.out.printf("*");
			}
				System.out.println();
		}
		for (i = 5; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.printf("*");
			}
				System.out.println();
		}
		
		
		
		
		*/
		/*
		  Scanner scan = new Scanner(System.in);

	         double row = 14;
	         double col = 8;

	         while (Math.pow((row - col), 2) > 1) {
	            System.out.println("행과 열의 값이 적절하지 않습니다.");
	            System.out.println("행의 갯수 입력");
	            row = scan.nextInt();
	            System.out.println("열의 갯수 입력");
	            col = scan.nextInt();
	         }

	         System.out.println("row : " + row + ", col : " + col);
	         System.out.println("--------------------------------");

	         for (int i = 1; i <= row; i++) {
	            for (int j = 1; j <= col; j++) {
	               if (i <= (row / 2)) {
	                  System.out.print((col - i + 2 <= j) ? "*" : " ");
	               } else {
	                  System.out.print((i - (col / 2) <= j)  ? "*" : " ");
	               } 
	            }
	            System.out.println();
	         }
			 */
	      
		
	         /*
	         for(int i = 1; i <= 11; i++) {
	        	 for(int j = 1; j <= 7; j++) {
	        		 if(i <= 6) {
	        			System.out.print((6 - i <= j-2) ? "*" : " "); 
	        		 } else {
	        			System.out.print((i - 6 <= j-2) ? "*" : " ");
	        		 }
	        	 }
	        	System.out.println();
	         }
			*/
			/*
		int num, start, end, center;
		
		num = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		num = scan.nextInt();
		while (num == 0) {
            System.out.println("숫자가 적절하지 않습니다.");
            System.out.println("정수를 입력해주세요.");
            num = scan.nextInt();
         }
	      
		  center = (num - 2) / 2; //배열의 가운데에 와야 하므로 2를 뺀뒤 나눠주면 가운데로 온다.
	      start = center;
	      end = (num - 2 - 1) - ((num - 2) / 2); //-2를 한 이유는 맨 위,아래의 각각 한줄씩은 따로 돌기 때문, -1을 한 이유는 7이라고 예를 들면 5인데 배열은 01234이므로 5-1을 해주어 4로 만들어준다.
	      
	      
	 if(num % 2 == 1){
	      
	   
		 
	      for(int i = 0; i < num - 2; i++)
	      {
	         System.out.print("**");
	      }
	      System.out.println();
	      for(int i = 0; i < num - 2; i++)
	      {
	         for(int j = 0; j < num - 2; j++)
	         {
	            System.out.print((j != start && j != end) ? "**" : "  ");  
	         }
	         if(i < center)
	         {
	            start--;
	            end++;
	         }
	         else
	         {
	            start++;
	            end--;
	         }
	         System.out.println();
	      }
	      for(int i = 0; i < num - 2; i++)
	      {
	         System.out.print("**");
	      }
	      
	      
	 } if(num % 2 == 0){
			
		 
	      for(int i = 0; i < num - 2; i++)
	      {
	         System.out.print("*");
	      }
	      System.out.println();
	      for(int i = 0; i < num - 1; i++)
	      {
	         for(int j = 0; j < num - 2; j++)
	         {
	            System.out.print((j != start && j != end) ? "*" : " ");  
	         }
	         if(i < center)
	         {
	            start--;
	            end++;
	         }
	         else
	         {
	            start++;
	            end--;
	         }
	         System.out.println();
	      }
	      for(int i = 0; i < num - 2; i++)
	      {
	         System.out.print("*");
	      }
		
	 }
		
			*/
			/*
			for(int i = 1; i < 13; i++) {
				for(int j = 0; j < 6; j++) {
					if(i <= 6) {
					System.out.print((6 - i <= j) ? "*" : "");
					} else {
					System.out.print((i - 7 < j) ? "*" : "");
					}
				}
				System.out.println();
			}
			*/   
		
		/*
			for(int i = 1; i <= 7; i++) { //star1
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();

			for(int i = 1; i <= 11; i++) { //star2
				if(i <= 6) {
					for(int j = 1; j <= 6; j++) {
						if(6 - i < j) {
							System.out.print("*");
						}
						else {
							System.out.print("");
						}
					}
					System.out.println();
				}
				else {
					for(int j = 1; j <= 6; j++) {
						if(i - 6 < j) {
							System.out.print("*");
						}
						else {
							System.out.print("");
						}
					}
					System.out.println();
				}
			}
			System.out.println();
			
			for(int i = 1; i <= 11; i++) { //star3
				if(i <= 6) {
					for(int j = 1; j <= 6; j++) {
						if(6 - i < j) {
							System.out.print("*");
						} 
						else {
							System.out.print(" ");
						}
					}
				} 
				else {
					for(int j = 1; j <= 6; j++) {
						if(i - 6 < j) {
							System.out.print("*");
						} 
						else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
			System.out.println();
			    
			for(int i = 1; i <= 7; i++) { //star4
				for(int j = 1; j <= 7; j++) {
					if(7 - i < j) {
						System.out.print("*");
					} 
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			*/    

		
		
		
		
		
		
		
		
		
	
	}
}
