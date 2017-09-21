
public class Spider extends Animal {
	
	protected Spider(int legs) {
		super(legs);
	}
	
	public Spider() {
		super(8);
	}
	
	public String eat() {
		return "Spiders eat flies.";
	}

}
