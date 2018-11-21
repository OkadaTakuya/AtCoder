package ABC.ABC023;

import java.util.Scanner;

public class ABC023A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		System.out.println((X/10 + X%10));
	}
}
