package classwork_6;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//1
		System.out.println("Input a number");
		int n = s.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}
		
		//2
		System.out.println("number");
		int m = s.nextInt();
		if(m>0) {
			System.out.println("positive");
		} else if(m<0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
		
		//3
		for(int i = 1;i<=10;i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		
		//4
		for(int i = 1; i<=100; i++) {
			int sum = 0;
			sum+=i;
		}
		
		//5
//		int g = 7;
//		System.out.println("");
//		int hm = s.nextInt();
//		while(hm!=7) {
//			if(hm>7) {
//				System.out.println("less");
//			} else if(hm<7) {
//				System.out.println("more");
//			} else if(hm == 7) {
//				System.out.println("correct");
//			}
//		}
		
		//6
		// я не буду это все вводить
		int[] a = {4, 5, 7, 8, 2, 10, 78,88, 45,98};
		for(int b : a) {
			int c = 0;
			if(b%2==0) {
				c++;
			}
		}
		
		//7
		 System.out.println("number please");
		 int f = s.nextInt();
		 for(int i = f;i>0;i--) {
			 int fktrl = 1;
			 fktrl*=i;
		 }
		 
		 //10
		 for(int i = 0; i<=5; i++) {
			 System.out.println("*".repeat(i));
		 }
		 
		 //11
		 int theN = 56;
		 int sum = 0;
		 for(int i = theN; i>0; i--) {
			 sum+=i;
		 }
		 
		 //12
		 String pw = "java123";
		 System.out.println("password");
		 String gpw = s.nextLine();
		 while(gpw!=pw) {
			 if(gpw==pw) {
				 System.out.println("correct");
			 } else {
				 System.out.println("no");
			 }
		 }
		 
		 //11 (new)
		 for(int i = 10; i>0;i--) {
			 System.out.println(i);
		 }
		 
		 //13
		 for(int i = 1; i<=10; i++) {
			 for(int h = 1; h<=10; h++) {
				 System.out.println(i*h);
			 }
		 }
		
	}
}
