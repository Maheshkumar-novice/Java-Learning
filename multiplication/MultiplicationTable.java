package multiplication;

public class MultiplicationTable {
	public static void print() {
		print(5, 1, 10);
	}

	public static void print(int number) {
		print(number, 1, 10);
	}

	public static void print(int number, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d x %d = %d", number, i, number * i).println();
		}
	}
}
