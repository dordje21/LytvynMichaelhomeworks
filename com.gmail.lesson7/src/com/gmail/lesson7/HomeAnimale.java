package com.gmail.lesson7;

public class HomeAnimale extends Animale {
	private boolean isVaccinated;

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public HomeAnimale(int id, double age, double weigh, String color, boolean isVaccinated) {
		super(id, age, weigh, color);
		this.isVaccinated = isVaccinated;
	}

	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public String getVaccinated() {
		if (isVaccinated = true) {
			return "Vaccinated";
		} else {
			return "no Vaccinated";
		}
	}
}
