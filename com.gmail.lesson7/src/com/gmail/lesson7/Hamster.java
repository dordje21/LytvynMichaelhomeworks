package com.gmail.lesson7;

public class Hamster extends HomeAnimale {
	private String name;
	
	public Hamster(int id, double age, double weigh, String color, boolean isVaccinated, String name) {
		super(id, age, weigh, color, isVaccinated);
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	public String getVoice() {
		return "Hello, my name is " + name;
	}
	
	@Override
	public String toString() {
		return "Hamster [" + (name != null ? "name=" + name : "") + "]";
	}

}
