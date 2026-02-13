package homework_9;

public class Cube {
	
	
	public static int roll() {
		return (int)(Math.random() * 6) + 1;
	}
	
	public static void main(String[] args) {
		
		byte rollcount = 15;
		
		System.out.println("game on");
		for(int i = rollcount; i>0; i--) {
			int points = roll();
			System.out.println("take " + i + ":" + points);
		}
	}
}
