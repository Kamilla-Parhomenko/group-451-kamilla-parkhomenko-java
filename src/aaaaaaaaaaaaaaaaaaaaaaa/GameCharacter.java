package aaaaaaaaaaaaaaaaaaaaaaa;

public class GameCharacter {

	protected String name;
    protected int health;


    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public void attack() {
        System.out.println(name + " attacked for 10 hp");
    }

    
}

class Mage extends GameCharacter {
    private int mana;


    public Mage(String name, int health, int mana) {
        super(name, health); 
        this.mana = mana;
    }


    @Override
    public void attack() {
        super.attack(); 
        System.out.println(name + " attacked for 25 hp");
    }