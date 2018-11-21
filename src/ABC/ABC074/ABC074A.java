package ABC.ABC074;

import java.util.Scanner;

public class ABC074A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		
		System.out.println((N*N-A));
	}
}
