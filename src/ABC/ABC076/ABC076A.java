package ABC.ABC076;

import java.util.Scanner;

public class ABC076A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		sc.close();
		
		System.out.println((2*G - R));
	}
}
