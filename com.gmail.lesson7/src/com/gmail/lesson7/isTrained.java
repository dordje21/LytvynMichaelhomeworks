package com.gmail.lesson7;

public class isTrained extends HomeAnimale{
	public boolean isTrained;

	public isTrained(int id, double age, double weigh, String color, boolean isVaccinated, boolean isTrained) {
		super(id, age, weigh, color, isVaccinated);
		this.isTrained = isTrained;
	}

	public void setTrained(boolean isTrained) {
		this.isTrained = isTrained;
	}

	@Override
	public String toString() {
		return "isTrained [isTrained=" + isTrained + "]";
	}
	
	
}
