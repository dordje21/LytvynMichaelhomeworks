import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = new String[15];
		String st1 = "Andrey";
		String st2 = "Vasy";
		students[5] = "Vasy";

		addStudent(students, st1);
		del(students, "Vasy");
		print(students);

		System.out.println(Arrays.toString(students));
	}

	public static void addStudent(String[] string, String st) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == null) {
				string[i] = st;
				break;
			}
		}
	}

	public static void print(String[] string) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == null) {
				System.out.print(" - ");
			} else {
				System.out.print(string[i]);
			}
		}
	}

	public static void del(String[] string, String st) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == st) {
				string[i] = null;
			}
		}
	}
	
	

}
