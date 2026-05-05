package classworkkkkaa;

public class HelpTheTasksAreAfterMe {

	public static void main(String[] args) {
		//1
		int number = -7;
		
		if(number>0) {
			System.out.println("positive");
		} else if(number<0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
		
		//2
		int num2 = 14;
		if(num2%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		//3
		int a = 25;
		int b = 31;
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		//4
		int age = 17;
		if(age>=18) {
			System.out.println("you pass");
		} else {
			System.out.println("shoo shoo");
		}
		
		//5
		int score = 82;
		if(score>=90 && score<=100) {
			System.out.println("excellent");
		} else if(score>=70 && score<=89) {
			System.out.println("good");
		} else if(score>=50 && score<=69) {
			System.out.println("decent");
		} else if(score>=0 && score<=49) {
			System.out.println("fail");
		} else {
			System.err.println("??");
		}
		
		//6
		String login = "admmin";
		String password = "1234";
		if(login.equals("admin") && password.equals("1234")) {
			System.out.println("pass");
		} else {
			System.out.println("no");
		}
		
	}
}
