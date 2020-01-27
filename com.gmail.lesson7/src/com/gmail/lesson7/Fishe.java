package com.gmail.lesson7;

public class Fishe extends HomeAnimale {
	private String name;

	public Fishe(int id, double age, double weigh, String color, boolean isVaccinated, String name) {
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
		return "....";
	}

	@Override
	public String toString() {
		return "Fishe [" + (name != null ? "name=" + name : "") + "]";
	}

}
