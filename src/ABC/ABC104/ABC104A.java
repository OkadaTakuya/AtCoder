package ABC.ABC104;

import java.util.Scanner;

public class ABC104A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();

		if (r < 1200)
			System.out.println("ABC");
		else if (r < 2800)
			System.out.println("ARC");
		else
			System.out.println("AGC");
	}
}
