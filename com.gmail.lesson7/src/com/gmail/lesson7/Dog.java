package com.gmail.lesson7;

public class Dog extends isTrained {

	private String name;

	public Dog(int id, double age, double weigh, String color, boolean isVaccinated, boolean isTrained, String name) {
		super(id, age, weigh, color, isVaccinated, isTrained);
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public String getVoice() {
		String temp = "";
		
		if (isTrained == true) {
			temp = "Hello, I can take you home.";
		} else if (isTrained == false) {
			temp = "Hello, my name is " + name + " Woof. ";
		}
		return temp;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}
