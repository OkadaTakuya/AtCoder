package ABC.ABC039;

import java.util.Scanner;

public class ABC039B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		System.out.println((int)Math.sqrt(Math.sqrt(X)));
	}
}
