
public class Fish extends Animal implements Pet{
	
	private String name;
	
	protected Fish(int legs) {
		super(legs);
	}
	
	public Fish() {
		super(0);
		name = "Piscene";
	}
	
	public String walk() {
		return "Fish can't walk and don't have legs. ";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public void play() {
		System.out.println("Fish swim around. ");
	}
	
	public String eat() {
		return "Fish eat algae. ";
	}

}
