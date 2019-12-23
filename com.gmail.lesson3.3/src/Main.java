import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] students = new String[15];

		int[][] marks = new int[15][32];

		int mark = 12;
		int lesson = 2;
		String st1 = "Andrey";
		students[5] = "Vasy";
		students[7] = "Kate";
		students[11] = "Maks";
		students[14] = "Masha";
		addStudent(students, st1);
		String name = "Kate";
		setmark(marks, students, name, mark, lesson);
		printmark(marks, students, name, lesson);
		del(students, "Vasy");
		print(students);
		contains(students, "Andrey");
		sortStudent(students);

		System.out.println(Arrays.toString(students));

		clear(students);
	}

	public static void setmark(int[][] marks, String[] students, String name, int mark, int lesson) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == (name)) {
				marks[i][lesson] = mark;
				break;
			}	
		}System.out.println("добавили оценку  " + mark + " " + name + " за занятие " + lesson);
	}
	
	public static void printmark(int[][] marks, String[] students, String name, int lesson) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == (name)) {
				System.out.println(name + " получила оценку за занятие" + " номер " + lesson + " = " + marks[i][lesson]);
			}
		}
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
		System.out.println();
	}

	public static void del(String[] string, String st) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == st) {
				string[i] = null;
			}
		}
	}

	public static void contains(String[] string, String st) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == st) {
				System.out.println(st + " есть в группе");
			}
		}
	}

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

	public static void clear(String[] string) {
		for (int i = 0; i < string.length; i++) {
			string[i] = null;
		}
		System.out.println(Arrays.toString(string));
	}

}
