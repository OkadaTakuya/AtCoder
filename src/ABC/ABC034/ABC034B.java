package ABC.ABC034;

import java.util.Scanner;

public class ABC034B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if(n % 2 == 0)
			System.out.println(n-1);
		else
			System.out.println(n+1);
	}
}
