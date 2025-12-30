package homework_2;
import java.util.Scanner;

public class Homework_2 {

	public static void main() {
		
		Scanner fgh = new Scanner(System.in);
		int gr = fgh.nextInt();
		
		if (gr == 5) {
            System.out.println("excellent");
        } else if (gr == 4) {
            System.out.println("good");
        } else if (gr == 3) {
            System.out.println("not bad");
        } else if (gr == 2) {
            System.out.println("bad");
        } else {
            System.out.println("bro what");
        }
		
		int a = 3;
		int b = 5;
		int c = 8;
		// ne ponyal
		
int month = 12;
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28");
                break;
        }
        
        System.out.print("age?");
        int age = fgh.nextInt();
        
        if (age < 0) {
            System.out.println("??");
        } else if (age <= 12) {
            System.out.println("child");
        } else if (age <= 17) {
            System.out.println("teen");
        } else if (age <= 59) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
        
        int num1 = 5;
        int num2 = 8;
        char op = '*';
        
        switch (op) {
        case '+':
            System.out.println(num1 + num2);
            break;
        case '-':
            System.out.println(num1 - num2);
            break;
        case '*':
            System.out.println(num1 * num2);
            break;
        case '/':
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("no");
            }
        }
        
        String lt = "g";
        switch (lt) {
        case "a": case "e": case "i": case "o": case "u":
            System.out.println("vowel");
            break;
        case "b": case "c": case "d": case "f": case "g": case "h":
        case "j": case "k": case "l": case "m": case "n": case "p":
        case "q": case "r": case "s": case "t": case "v": case "w":
        case "x": case "y": case "z":
            System.out.println("consonant");
            break;
        default:
            System.out.println("?? what");
    }
        
        int score = 88;
        if (score < 0 || score > 100) {
            System.out.println("ERROR");
        } else if (score >= 90) {
            System.out.println("5");
        } else if (score >= 75) {
            System.out.println("4");
        } else if (score >= 60) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }
           
        System.out.print("");
        int day = fgh.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wen");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("amerika keshf eleme");
        }
        
        System.out.print("10. Введите год: ");
        int yr = fgh.nextInt();
        
        if (yr % 400 == 0 && yr % 4 == 0) {
        	System.out.println("leap");
        } else if (yr % 100 == 0) {
        	System.out.println("no");
        }
	}
}
