package kosa.oop3;

public class Worker extends Man implements Speakable{
	
	public Worker(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return getName() + "공부나 열심히 해";
		
	}
}
