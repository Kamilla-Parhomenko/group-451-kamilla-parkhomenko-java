package classwork_3;
import java.util.Arrays;
public class Classwork_3 {
	public static void main(String[] args) {
		//1
		int[] h = new int[5];
//		Arrays.fill(h, 1, 3, 10);
		h[0] = 10;
		h[1] = 20;
		h[2] = 30;
		h[3] = 40;
		h[4] = 50;
		System.out.println(Arrays.toString(h));
		
		//2
		int[] ns = {88, 56, 68, 45, 9, 23, 89, 77};
		for(int n=0;n<=ns.length;n++) {
			if(ns[n]%2 == 0) {
				System.out.println(ns[n]);
			}
		}
		
		//3
		int[] aa = {5, 12, 8, 3, 9, 1};
		
}
}
