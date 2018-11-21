package ABC.ABC037;

import java.util.Scanner;

public class ABC037A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		if(A > B)
			System.out.println(C/B);
		else
			System.out.println(C/A);
	}
}
