package classwork_7;

public class Monster {

	String type;
	int health;
	int damage;
	
	public Monster(String type, int health, int damage) {
		this.type = type;
		this.health = health;
		this.damage = damage;
	}
	
	public void attack() {
		System.out.println("attac");
	}
	
	public void roar() {
		System.out.println("rawr");
	}
}
