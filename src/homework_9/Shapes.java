package homework_9;

public class Shapes {

	public static double sq(double side) {
		return side * side;
	}
	
	public static double rt(double height, double width) {
		return height * width;
	}
	
	public static void main(String[] args) {
		
		
		double[] sds = {5, 8, 3, 10, 6};
		
		for(double s : sds) {
			System.out.println(sq(s));
		}
		
//		double[] rsds = {(4, 6), (7,3), };
	}
}
