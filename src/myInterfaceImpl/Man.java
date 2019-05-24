package myInterfaceImpl;

import myInterface.Person;

public class Man implements Person{

	private String name;
	private Woman lover;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Woman getLover() {
		return lover;
	}

	public void setLover(Woman lover) {
		this.lover = lover;
	}
	
	@Override
	public void love() {
		System.out.println("I love " + lover.getName());
	}
}
