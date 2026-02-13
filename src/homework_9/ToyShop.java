package homework_9;

public class ToyShop {

	public static int round(double price) {
		return (int) Math.round(price);
	}
	
	public static void main(String[] args) {
		
		double[] p = {45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3};
		double pricesum = 0.0;
		
		for(double pr : p) {
			int rprice = round(pr);
			pricesum+=rprice;
		}
		
		System.out.println(Math.round(pricesum / 10));
	
	
	}
}
