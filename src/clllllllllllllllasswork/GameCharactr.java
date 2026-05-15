package clllllllllllllllasswork;

public class GameCharactr {

	String name;
	int health;
	int level;
	
	public GameCharactr(String name, int health, int level) {
		this.name = name;
		this.health = 100;
		this.level = 1;
	}
	
	void takeDamage(int damage) {
		if(damage<=health) {
			health-=damage;
		}
	}
	
	void heal(int amount) {
		if(amount+health<=100) {
			health+=amount;
		}
	}
	
	boolean isAlive() {
		boolean live = (health>0) ? true : false;
		return live;
	}
	
	void lvlUp() {
		level++;
	}
}
