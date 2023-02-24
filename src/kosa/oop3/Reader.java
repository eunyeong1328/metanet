package kosa.oop3;

public class Reader extends Man implements Speakable{
	
	public Reader(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		return getName() + "열심히 일해야 한다.";
	}

}
