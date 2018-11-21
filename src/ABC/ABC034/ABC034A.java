package ABC.ABC034;

import java.util.Scanner;

public class ABC034A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		if(y > x)
			System.out.println("Better");
		else
			System.out.println("Worse");
	}
}
