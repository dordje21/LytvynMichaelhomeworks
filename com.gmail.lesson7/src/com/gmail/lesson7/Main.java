package com.gmail.lesson7;


public class Main {

	public static void main(String[] args) {
		Dog dogOne = new Dog(1, 2, 6, "green", true, false, "Rex");
		Cat catOne = new Cat(2, 3, 2, "black", true, "Garfild");
		Fishe fisheOne = new Fishe(3, 0.2, 0.1, "blue", false, "Dori");
		Lione lioneOne = new Lione(4, 5, 12, "yellow", true);
		Wolf wolfOne = new Wolf(5, 3, 8, "grey", true);
		Giraffe giraffeOne = new Giraffe(6, 7, 24, "yellow", false);
		Hamster hamsterOne = new Hamster(7, 0.3, 0.1, "black", false, "Pik");
		Dog dogTwo = new Dog(8, 2, 6, "green", true, true, "Rex");
		Crocodile crocodileOne = new Crocodile(9, 12, 43, "green", true);
		
		
		Object [] animales = new Object [9];
		animales[0] = dogOne;
		animales[1] = catOne;
		animales[2] = fisheOne;
		animales[3] = lioneOne;
		animales[4] = wolfOne;
		animales[5] = giraffeOne;
		animales[6] = hamsterOne;
		animales[7] = dogTwo;
		animales[8] = crocodileOne;
		
		for(int i = 0; i < animales.length; i++) {
			System.out.println(((Animale) animales[i]).getVoice());
		}
	}

}
