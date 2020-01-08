package com.gmail.lesson5;

import java.util.Arrays;

public class SortStudent {
	public static void sortStudent(String[] string) {
		int sum = 0;
		for (int i = 0; i < string.length; i++) {
			if (string[i] != null) {
				sum++;
			}
		}
		String[] sortArray = new String[sum];

		for (int i = 0; i < string.length; i++) {
			if (string[i] != null) {
				for (int j = 0; j < sortArray.length; j++) {
					if (sortArray[j] == null) {
						sortArray[j] = string[i];
						break;
					}
				}
			}
		}
		Arrays.sort(sortArray);
		System.out.println(Arrays.toString(sortArray));
	}
}
