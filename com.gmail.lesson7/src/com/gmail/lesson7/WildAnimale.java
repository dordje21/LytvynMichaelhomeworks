package com.gmail.lesson7;

public class WildAnimale extends Animale {
	private boolean isPredator;

	public WildAnimale(int id, double age, double weigh, String color, boolean isPredator) {
		super(id, age, weigh, color);
		this.isPredator = isPredator;
	}

	protected boolean isPredator() {
		return isPredator;
	}

	protected void setPredator(boolean isPredator) {
		this.isPredator = isPredator;
	}
	
	public String getPredator() {
		if (isPredator = true) {
			return "is Predator";
		} else {
			return "no Predator";
		}
	}

	@Override
	public String toString() {
		return "WildAnimale [isPredator=" + isPredator + "]";
	}

}
