package com.gmail.lesson7;

public class Animale {
	private int id;
	private double age;
	private double weigh;
	private String color;

	public Animale(int id, double age, double weigh, String color) {
		super();
		this.id = id;
		this.age = age;
		this.weigh = weigh;
		this.color = color;
	}

	public Animale() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getWeigh() {
		return weigh;
	}

	public void setWeigh(double weigh) {
		this.weigh = weigh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getVoice() {
		return "Hello, ";
	}

	@Override
	public String toString() {
		return "Animale [id=" + id + ", age=" + age + ", weigh=" + weigh + ", color=" + color + "]";
	}
	
}
