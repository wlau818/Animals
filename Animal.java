
public abstract class Animal {
	
	protected int legs;
	
	public Animal (int legs) {
		this.legs = legs;
	}
	
	abstract protected String eat();
	
	public String walk() {
		return "It walks " + legs + " legs.";
	}

}
