package classwork_2;

import java.util.Scanner;

public class Classwork_2 {

	public static void main(String[] args) {
		Scanner h = new Scanner(System.in);
		System.out.println("How much did you sleep today?");
		int s = h.nextInt();
		if (s < 6) {
			System.out.println("Too little, go rest :(");
		} else if (s > 6 && s < 8) {
			System.out.println("Kinda short but still good :)");
		} else if (s > 8 && s < 10) {
			System.out.println("Had a good sleep, didn't you? :D");
		} else {
			System.out.println("You sleepyhead!");
		}

		Scanner n = new Scanner(System.in);
		System.out.println("enter number(1-5)");
		int v = n.nextInt();
		if (v == 1) {
			System.out.println("Apple: Vitamin C amd kletchatka");
		} else if (v == 2) {
			System.out.println("Banana: Kalium for your heart <3");
		} else if (v == 3) {
			System.out.println("Orange: Immunity is UP!");
		} else if (v == 4) {
			System.out.println("Pear: Juicy and refreshing ^^");
		} else if (v == 5) {
			System.out.println("Kiwi: Exotic with vitamins ;)");
		}

	}
}
