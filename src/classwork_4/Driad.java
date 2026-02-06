package classwork_4;

public abstract class Driad extends Monster implements Attackable, Defendable, Specab{

	boolean appear;
	boolean heretohelp;
	String treetype;
	
	public Driad(String name, int health, double damage, boolean abletofly, String effect, boolean appear, boolean heretohelp, String treetype, boolean doesitbite) {
		this.name = name;
		this.health = 600;
		this.damage = 340;
		this.abletofly = abletofly;
		this.doesitbite = false;
		this.effect = effect;
		this.heretohelp = heretohelp;
		this.treetype = treetype;
		
	}
	
	public void appear() {
		appear = true;
	}
	
	public void disappear() {
		appear = false;
	}
	
	public void attacked() {
		heretohelp = false;
		effect = "Guilt";
	}
	
	public void heal() {
		if(appear = false) {
			health+=200;
		}
	}
	
	public void aura() {
		if(heretohelp = true) {
			effect = "Brightness";
		} else {
			effect = "Blindness";
		}
	}
	
	@Override
	public void attack() {
		aura();
		health+=40;
		System.out.println("Oh! Careful!");
	}
	
	@Override
	public void defend() {
		disappear();
		System.out.println("y.");
	}
	
	@Override
	public void usespecial() {
		aura();
		disappear();
	}
}
