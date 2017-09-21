
public class Cat extends Animal implements Pet {
	
	private String name;
	
	public Cat() {
		super(4);
	}
	
	public Cat(String name) {
		super(4);
		this.name = name;
		legs = 4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public void play() {
		System.out.print("Cat rolls around. ");
		
	}

	public String eat() {
		return "Cats eat mice. ";
		
	}

}
