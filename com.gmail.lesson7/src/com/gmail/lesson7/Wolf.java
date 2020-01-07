package com.gmail.lesson7;

public class Wolf extends WildAnimale {

	public Wolf(int id, double age, double weigh, String color, boolean isPredator) {
		super(id, age, weigh, color, isPredator);
	}

	public String getVoice() {
		return "Hello, I am a wild animal and I am angry";
	}
}
