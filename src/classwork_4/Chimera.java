package classwork_4;

public abstract class Chimera extends Monster implements Attackable, Defendable, Specab{

	double mischieviousnesslvl;
	
	public Chimera(String name, int health, double damage, boolean abletofly, String effect, boolean doesitbite, double mischieviousnesslvl) {
		this.name = name;
		this.health = 460;
		this.damage = 300;
		this.abletofly = true;
		this.effect = effect;
		this.doesitbite = true;
		this.mischieviousnesslvl = mischieviousnesslvl;
	}
	
	public void hiss() {
		effect = "Threatened";
		System.out.println(name + "hissed at you! Jeez!");
	}
	
	public void tackle() {
		effect = "Headache";
		System.out.println(name + "tackled you down and you hit your head! Ouch!");
	}
	
	public void daze() {
		effect = "Hypnotized"; //saaraba konna jidai ni atsunaeta nana nana nina nika seieieieee nunuunu mesmerizer reference
		System.out.println("You feel dizzy and cant think anymore........ You got hypnotized!");
	}
	
	public void secretfunchehe() {
		System.out.println("tetotetotetotetotetotetotetotetoteto");
		System.out.println("Looks like the chimera was secretly Kasane Teto! Come and listen to her sing! And maybe give her some baguette!");
	}
	
	@Override
	public void attack() {
		health+=50;
		mischieviousnesslvl+=15;
		System.out.println("Whoosh! Chimera attacked you!");
	}
	
	@Override
	public void defend() {
		attack();
		System.out.println(name + "is angry!");
	}
	
	@Override
	public void usespecial() {
		daze();
	}
}
