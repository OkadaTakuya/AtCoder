package ABC.ABC009;

import java.util.Scanner;

public class ABC009A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.println((N/2 + N%2));
	}
}
