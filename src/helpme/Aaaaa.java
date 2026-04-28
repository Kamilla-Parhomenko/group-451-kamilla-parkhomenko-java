package helpme;

public class Aaaaa {

	static void greet(String name) {
		System.out.println("Привет, " + name + "!");
	}
	
	static int max3(int a, int b, int c){
		return Math.max(Math.max(a, b), c);
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		//

		int age = 15;
		int future = age + 10;
		System.out.println("Через 10 лет мне будет: " + future);

		//

		int n = 7;
		if (n % 2 == 0) {
			System.out.println("Чётное");
		} else {
			System.out.println("Нечётное");
		}

		//

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		//

		greet("Someone");

		//

		for (int i = 1; i <= 10; i++) {
			System.out.println("3 × " + i + " = " + (3 * i));
		}
		
		//
		
		max3(5,7,13);

	}
}
