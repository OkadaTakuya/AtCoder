package ABC.ABC086;

import java.util.Scanner;

public class ABC086A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a % 2 == 1 && b % 2 == 1)
			System.out.println("Odd");
		else
			System.out.println("Even");
	}
}
