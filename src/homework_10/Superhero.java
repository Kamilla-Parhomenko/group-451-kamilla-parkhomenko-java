package homework_10;

public class Superhero {

	String name;
	int powerLvl;
	String secretId;
	boolean goodIntentions;
	
	public Superhero(String name, int powerLvl, String secretId, boolean goodIntentions) {
		this.name = name;
		this.powerLvl = powerLvl;
		this.secretId = secretId;
		this.goodIntentions = goodIntentions;
	}
	
	public void showHeroCard() {
		System.out.println("This hero, with a power level of " + powerLvl + ", is known as " + name + ". Though no one knows that in reality they're " + secretId + "!");
	}
	
	public void usePower() {
		System.out.println(name + " uses their power with a " + powerLvl + " level!");
	}
}
