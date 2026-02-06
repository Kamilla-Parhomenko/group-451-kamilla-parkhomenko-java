package classwork_4;

public abstract class Ghost extends Monster implements Attackable, Defendable, Specab{

	boolean visible;
	
	public Ghost(String name, int health, double damage, boolean abletofly, String effect, boolean visible, boolean doesitbite) {
		this.name = name;
		this.health = 300;
		this.abletofly = true;
		this.damage = 120;
		this.effect = effect;
		this.visible = visible;
		this.doesitbite = false;
	}
	
	public void haunt() {
		effect = "Haunted";
		System.out.println("A ghost is haunting you!");
	}
	
	public void invisible() {
		visible = false;
		System.out.println("You swore you could see something, but it seemed to vanish....");
	}
	
	@Override
	public void attack() {
		visible = true;
		haunt();
		damage+=10;
	}
	
	@Override
	public void defend() {
		visible = false;
		effect = "Mandela";
		System.out.println("But it was right there!!");
	}
	
	@Override
	public void usespecial() {
		System.out.println("The ghost passed through a wall!");
	}
}
