package classwork_8;

import java.util.Scanner;

public class Main {

	public void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		// 1
//		System.out.println("input number");
//		int n = scan.nextInt();
//		if (n % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
//
//		// 2
//		System.out.println("your test result");
//		int p = scan.nextInt();
//		if (p >= 90 && p <= 100) {
//			System.out.println("something i will never achieve");
//		} else if (p >= 75 && p <= 89) {
//			System.out.println("good");
//		} else if (p >= 60 && p <= 74) {
//			System.out.println("ok");
//		} else if (p < 60) {
//			System.out.println(".try better.");
//		} else {
//			System.err.println("ERROR: GRADE UNDEFINED OR DOESNT FIT IN THE STANDARTS. TRY AGAIN.");
//		}
//
//		// 3
//		System.out.println("input side a");
//		int a = scan.nextInt();
//		System.out.println("input side b");
//		int b = scan.nextInt();
//		System.out.println("input side c");
//		int c = scan.nextInt();
//
//		if (a < b + c && b < a + c && c < a + b) {
//			System.out.println("correct, possible triangle");
//		} else {
//			System.out.println("impossible, nonexistent triangle");
//		}
//
//		// 4
//		System.out.println("input price for discount");
//		int pr = scan.nextInt();
//
//		if (pr >= 5000) {
//			pr *= 0.15;
//		} else if (pr >= 2000) {
//			pr *= 0.1;
//		} else if (pr >= 1000) {
//			pr *= 0.05;
//		} else {
//			System.out.println("no discount for you");
//		}
//		System.out.println(pr);

		// 5
		// аааа опять эти прямоугольники сколько можно
		
		System.out.println("height");
		int h = scan.nextInt();
		System.out.println("width");
		int w = scan.nextInt();
		
		// ya sdayus
		
		//6
		System.out.println("nummbr");
		int t = scan.nextInt();
		for(int i = 1;i<=10;i++) {
			System.out.println(t + " * " + i + " = " + (t*i));
		}
		
		//7
		System.out.println("NUMBAR AGAIN AHH");
		int aa = scan.nextInt();
		int sum = 0;
		int count =0;
		for(int l = 0; l<=aa; l++) {
			if(l%2==0) {
				sum+=l;
				count++;
			}
		}
		
		//8
		System.out.println("again a number");
		int fn = scan.nextInt();
		int frl = 0;
		for(int f = 1;f<=fn; f++) {
			frl*=f;
		}
		
		//9
		Rectangle r1 = new Rectangle(6.7, 4.5);
		Rectangle r2 = new Rectangle(8.8, 3.4);
		
		r1.printinfo();
		r2.printinfo();
	}
}
