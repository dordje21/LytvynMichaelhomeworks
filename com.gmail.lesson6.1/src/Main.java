import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		


		
		for (int i = 0; i < arrayCopyOf.length; i++) {
			arrayCopyOf[i] = (int) (Math.random() * 10);
		}
		System.out.println("массив случайных чисел = " + Arrays.toString(arrayCopyOf));

		System.out.print("добавляем в пустой массив на 2 индекс число 12 = ");
		ArrayTool.add(array, 2, 12);
		System.out.println(Arrays.toString(array));

		System.out.print("сортируем массив случайных чисел по возрастанию ");
		ArrayTool.sort(arrayCopyOf);
		System.out.println(Arrays.toString(arrayCopyOf));

		System.out.print("достаем элемент 2 из массива = ");
		ArrayTool.get(array, 2);

		ArrayTool.contains(array, 12);
		ArrayTool.equals(array, 2, 12);
		System.out.println("ищем индекс элемента, индекс = " + ArrayTool.find(array, 12));

		ArrayTool.addAll(array, arrayCopyOf);
		System.out.println("перенесли все данные из массива случайных чисел " + Arrays.toString(arrayCopyOf)
				+ " в массив другой с заменой данных " + Arrays.toString(array));

		System.out.print("узнаем длину массива. ");
		ArrayTool.getSize(array);
		
		ArrayTool.clear(array);
	}

}
