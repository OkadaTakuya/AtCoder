package ABC.ABC087;

import java.util.Scanner;

public class ABC087A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		System.out.println((X-A)%B);
	}
}
