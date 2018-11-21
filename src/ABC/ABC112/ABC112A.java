package ABC.ABC112;

import java.util.Scanner;

public class ABC112A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = 0, B = 0;
		if (N == 2) {
			A = sc.nextInt();
			B = sc.nextInt();
		}
		sc.close();

		if (N == 1)
			System.out.println("Hello World");
		else
			System.out.println(A + B);
	}
}
