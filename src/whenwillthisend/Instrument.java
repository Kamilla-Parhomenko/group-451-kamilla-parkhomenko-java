package whenwillthisend;

public abstract class Instrument {

	String name;
	Instrument(String name){
		this.name = name;
	}
}

abstract class Guitar extends Instrument implements Playable{

	Guitar(String name) {
		super(name);
	}
	
	
}