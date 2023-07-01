package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class YourMom extends AbstractClassDemo implements InterfaceDemo, DemoInterface {

	@Override
	public void abstractDemo() {
		System.out.println("hello there" + "General Kenobi, Ive been expecting you");
		
	}

	@Override
	public int abstractNumDemo() {
		return 69;
	}

	@Override
	public double interDemo() {
		return 42;
	}

	@Override
	public String faceDemo() {
		System.out.println("Face");
		return null;
	}

}
