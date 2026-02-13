package classwork_7;

public class Hero {

	String name;
	int health;
	int strength;
	int level;
	
	public Hero(String name, int health, int strength, int level) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.level = level;
	}
	
	public void attack() {
		System.out.println("he  a t t a c" + strength);
	}
	
	public void hurt(int damg) {
		health -= damg;
	}
	
	
}
