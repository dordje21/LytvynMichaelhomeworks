package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("введите высоту");
		int h = sc.nextInt();

		System.out.println("введите ширину");
		int w = sc.nextInt();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (i % 2 != 0) {
					if (j % 2 == 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} 
			}
			System.out.println();
		}
		sc.close();
	}

}
