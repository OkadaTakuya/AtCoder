package ABC.ABC109;

import java.util.Scanner;

public class ABC109A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if(A % 2 == 0 || B % 2 == 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
