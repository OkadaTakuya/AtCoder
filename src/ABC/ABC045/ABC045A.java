package ABC.ABC045;

import java.util.Scanner;

public class ABC045A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		sc.close();

		System.out.println((a + b)*h/2);
	}
}
