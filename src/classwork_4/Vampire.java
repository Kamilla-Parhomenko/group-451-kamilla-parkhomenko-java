package classwork_4;

public abstract class Vampire extends Monster implements Attackable, Defendable, Specab{

	String state;
	
	public Vampire(String name, int health, double damage, boolean abletofly, String effect, boolean doesitbite, String state) {
		this.name = name;
		this.health = 400;
		this.damage = 350;
		this.abletofly = true;
		this.state = state;
		this.effect = effect;
		this.doesitbite = true;
	}
	
	public void metamorphose() {
		if(state.equals("Anthropomorph")) {
			state = "Bat";
		} else if(state.equals("Bat")) {
			state = "Anthropomorph";
		}
	}
	
	public void bite() {
		health+=10;
		damage+=5;
		effect = "Dizziness";
	}
	
	public void burn() {
		health-=20;
	}
	
	
	@Override
	public void attack() {
		bite();
	}
	
	@Override
	public void defend() {
		state = "Bat";
	}
	
	@Override
	public void usespecial() {
		burn();
		metamorphose();
	}
}
