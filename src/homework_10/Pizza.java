package homework_10;
import java.util.ArrayList;
public class Pizza {

	String size;
	double price;
	ArrayList<String> ingredients;
	
	public Pizza(String size, double price, ArrayList<String> ingredients) {
		this.size= size;
		this.price = price;
		this.ingredients = ingredients;
	}
	
	public void adding(String ing) {
		ingredients.add(ing);
	}
	
	public void showorder() {
		System.out.printf(size, price, ingredients);
	}
}
