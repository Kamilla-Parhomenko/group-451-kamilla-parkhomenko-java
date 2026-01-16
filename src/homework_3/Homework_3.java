package homework_3;

import java.util.Arrays;

public class Homework_3 {
	public static void main(String[] args) {
		int[] og = {56, 88, 89, 95};
		int[] copycat = Arrays.copyOf(og, 4);
		
		
		int[] melkiy = Arrays.copyOfRange(og, 1, 4);
		
		
		String[] n25sgs = {"D/N/A", "Bake no Hana", "Phony", "Envy Baby", "Bug"};
		System.out.println(Arrays.toString(n25sgs));
		
		
		int[] ghj = {2, 4, 5, 3, 8, 7};
		System.out.println(Arrays.binarySearch(ghj, 8));
		
		
		int[] jhg = {7, 8, 3, 5, 4, 2};
		System.out.println(Arrays.equals(ghj, jhg));
		
		int[] fu = jhg.clone();
		System.out.println(fu);
	}
}
