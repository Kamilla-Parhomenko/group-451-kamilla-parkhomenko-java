package yetanotherpractice;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
		}
		
		for(int i = 1; i<=9;i++) {
			for(int j = 1;j<=9;j++) {
				System.out.println(i + "*" + j + "= " + (i*j));
			}
		}
		int a = 0;
		int sum = 0;
		while (a<=100) {
			sum+=a;
			a++;
		}
		System.out.println(sum);
		
		// фибоначчи не буду делать
		
		int b = 10;
		do {
			System.out.println(b);
			b--;
		} while(b>=0);
		
		for(int c = 0;c<=30;c++) {
			if(c%2==0) {
				System.out.println(c);
			} else {
				continue;
			}
		}
		
		int nn = (int) Math.round(Math.random()*10);
		Scanner s = new Scanner(System.in);
		System.out.println("Try to guess what number im thinking about!");
		int q = s.nextInt();
		if(q==nn) {
			System.out.println("Correct!");
		} else if(q<nn) {
			System.out.println("Close enough! try a bigger number.");
		} else if(q>nn) {
			System.out.println("Close enough! try a smaller number.");
		}
		
		System.out.println("input a number");
		int f = s.nextInt();
		if(f%2==0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		
		int g = 5;
		int h = 8;
		int v = 57;
		int mx = 0;
		if(g>h) {
			mx=g;
		} else {
			mx = h;
		}
		if(v>mx) {
			mx=v;
		}
		System.out.println(mx);
		
		System.out.println("How many points did you get on the test?");
		int gr = s.nextInt();
		if(gr>=90) {
			System.out.println("excellent");
		} else if (gr>=70 && gr<90) {
			System.out.println("Great");
		} else if(gr>=50 && gr<70) {
			System.out.println("Good enough");
		} else if (gr<50) {
			System.out.println("not good.");
		}
		
		
		System.out.println("numer 1");
		int t = s.nextInt();
		System.out.println("munber 2");
		int k = s.nextInt();
		System.out.println("operation?");
		String y = s.nextLine();
		
		switch (y) {
		case "+" -> System.out.println(t+k);
		case "-" -> System.out.println(t-k);
		case "*" -> System.out.println(t*k);
		case "/" -> System.out.println(t/k);
		}
	}
}
