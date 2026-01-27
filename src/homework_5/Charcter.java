package homework_5;

public class Charcter {

	String name;
	int health;
	int strength;
	
	public Charcter(String name, int health, int strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}
	
	public Charcter heal(int value) {
		health+=value;
		return this;
	}
	
	public Charcter train() {
		strength++;
		return this;
	}
	
	public Charcter getst() {
		return this;
		
	}
}
