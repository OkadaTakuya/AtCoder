package ABC.ABC030;

import java.util.Scanner;

public class ABC030A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		
		int takahashi = B * C;
		int aoki = D * A;
		if(takahashi == aoki)
			System.out.println("DRAW");
		else if(takahashi > aoki)
			System.out.println("TAKAHASHI");
		else
			System.out.println("AOKI");
	}
}
