package myInterfaceImpl;

import myInterface.Person;

public class Woman implements Person{

	private String name;
	private Man lover;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Man getLover() {
		return lover;
	}
	public void setLover(Man lover) {
		this.lover = lover;
	}
	
	@Override
	public void love() {
		System.out.println("I love " + lover.getName());
	}
}
