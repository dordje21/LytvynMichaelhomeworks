import java.util.Arrays;

public class myArray {
	public static void add(int[] array, int arrIndex, int put) {
		array[arrIndex] = put;
	}

	public static void get(int[] array, int i) {
		System.out.println(array[i]);
	}

	public static void contains(int[] array, int i) {
		for (int num : array) {
			if (num == i) {
				System.out.println("Массив содержет число " + i);
			}
		}
	}

	public static void addAll(int[] array, int[] arrayCopyOf) {
		for (int i = 0; i < arrayCopyOf.length; i++) {
			array[i] = arrayCopyOf[i];
		}
	}

	public static void equals(int[] array, int i, int j) {
		if (array[i] == j) {
			System.out.println("элемент " + i + " соответствует " + j);
		}
	}

	public static void clear(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		System.out.println("массив очищен " + Arrays.toString(array));
	}

	public static int find(int[] array, int integer) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == integer) {
				index = i;
			}
		}
		return index;

	}

	public static void getSize(int[] array) {
		System.out.println("длинна массива = " + array.length);

	}

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int min_i = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}
			if (i != min_i) {
				int tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
		}
	}
}
