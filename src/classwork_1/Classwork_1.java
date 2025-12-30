package classwork_1;

public class Classwork_1 {

	public static void main() {
		int gr = 4;
		if(gr == 2) {
			System.out.println("Neudovletvoritelno");
		} else if (gr == 3) {
			System.out.println("Udovlet");
		} else if (gr == 4) {
			System.out.println("good");
		} else if (gr == 5) {
			System.out.println("excellent");
		}
		
		int m = 12;
		switch(m) {
		case 1 -> System.out.println("31");
		case 2 -> System.out.println("28");
		case 3 -> System.out.println("31");
		case 4 -> System.out.println("30");
		case 5 -> System.out.println("31");
		case 6 -> System.out.println("30");
		case 7 -> System.out.println("31");
		case 8 -> System.out.println("31");
		case 9 -> System.out.println("30");
		case 10 -> System.out.println("31");
		case 11 -> System.out.println("30");
		case 12 -> System.out.println("31");
		}
		
		int ag = 89;
		if(ag > 0 && ag <= 12) {
			System.out.println("Child");
		} else if (ag > 12 && ag<=17) {
			System.out.println("Teen");
		} else if (ag >17 && ag <=59) {
			System.out.println("Adult");
		} else if (ag > 60) {
			System.out.println("Elder");
		}
		
		int n1 = 5;
		int n2 = 8;
		char cr = '*';
		if (cr == '*') {
			System.out.println(n1 * n2);
		} else if (cr == '-') {
			System.out.println(n1 - n2);
		} else if (cr == '/') {
			System.out.println(n1 / n2);
		} else if (cr == '+') {
			System.out.println(n1 + n2);
		}
		
		String g = "g";
		switch(g) {
		case "a","e","i","o","u" -> System.out.println("Vowel");
		}
	}
}
