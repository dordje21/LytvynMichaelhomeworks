package com.gmail.lesson7;

public class Cat extends HomeAnimale{
	public String name; 
	
	public Cat(int id, double age, double weigh, String color, boolean isVaccinated, String name) {
		super(id, age, weigh, color, isVaccinated);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getVoice() {
		return "Hello, my name is " + name + " Meow. ";
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
}
