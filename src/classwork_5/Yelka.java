package classwork_5;

import java.util.Arrays;

public class Yelka {

	public static void main(String[] args) {
		
		System.out.println("        ✦");
		
//		for(int i = 0; i<=8;i++) {
//			String[] a = new String[1+i];
//			double b = (Math.round(Math.random()));
//			if(b==0) {
//				Arrays.fill(a, "*"); // я сейчас зарежусь
//				System.out.println(a);
//			} else {
//				Arrays.fill(a, "o");
//				System.out.println(a);
//			}
//		}
		
		
		int s = '*';
		
		for(int i =0;i<=8;i++) {
			for(int b =0; b<=18;b++) {
				System.out.println(s * b);//i ragequit
			}
		}
	}
}
