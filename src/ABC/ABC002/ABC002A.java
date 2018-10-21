package ABC.ABC002;

import java.util.Scanner;

public class ABC002A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		
		if(X > Y)
			System.out.println(X);
		else
			System.out.println(Y);
	}
}
