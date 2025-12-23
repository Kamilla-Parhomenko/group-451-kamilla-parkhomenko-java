package homework_1;

public class Homework_1 {

	public static void main() {
		int num = 5;
		System.out.println(++num);
		
		int n = 0;
		System.out.println((n>0) ? "Polojitelnoe" : "Otricatelnoe");
		
		int month = 12;
		if(month == 12 || month == 1 || month == 2) {
			System.out.println("Winter");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("Spring");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("Summer");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("Autumn");
		}
		
		int a = 18;
		int b = 3;
		if(a>0 && b!=0 && a/b > 5) {
			System.out.println("+");
		} else {
			System.out.println("-");
		}
		
		int sum = 0;
        
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i * j == 12) {
                    System.out.println("Found: i=" + i + ", j=" + j);
                    break;
                	}
            	}
        	}
}}
