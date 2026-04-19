package practice1;

import java.util.ArrayList;
import java.util.List;

public class Something {

	static int sumArray(int[] arr) {
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		sumArray(array);

		//

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i * j);
			}
		}
	}

	//

	static int[] findMinMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];

		for (int num : arr) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		return new int[] { min, max };
	}

	//

	static String reverseString(String s) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = s.length()-1; i >= 0; i--) {
	        sb.append(s.charAt(i));
	    }
	    return sb.toString();
	}

	//
	
	List<Shape> shapes = new ArrayList<>();
    
    shapes.add(new Circle(5));
    shapes.add(new Triangle(4, 3));
    shapes.add(new Square(6));
    
    for (Shape s : shapes) {
        System.out.println("Площадь: " + s.area());
    }
}}
