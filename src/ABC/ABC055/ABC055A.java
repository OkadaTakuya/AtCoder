package ABC.ABC055;

import java.util.Scanner;

public class ABC055A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int x = 800*N;
		int y = 200*(N/15);
		System.out.println(x-y);
	}
}
