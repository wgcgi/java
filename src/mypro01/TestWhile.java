package mypro01;

public class TestWhile {
	public static void main(String[] args) {
		// int eec = 1;
		// int sum = 0;
		// while (eec < 101) {
		// sum += eec;
		// eec++;
		// }
		// System.out.println(sum);
		// System.out.println("whileÑ­»·½áÊø");
		int sum1 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				System.out.print(i + "\t");
			}
			if (i % 15 == 0) {
				System.out.println();
			}
		}

	}
}
