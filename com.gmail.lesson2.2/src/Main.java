import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("введите числа через запятую");
		String nums = sc.next();

		String spliter = ",";

		String[] substring = nums.split(spliter);
		int numArray[] = new int[substring.length];

		for (int i = 0; i < substring.length; i++) {
			numArray[i] = Integer.parseInt(substring[i]);
		}

		double sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}
		System.out.println("Ваше среднее число = " + sum / numArray.length);

		sc.close();
	}

}