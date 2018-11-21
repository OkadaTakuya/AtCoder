package ABC.ABC026;

import java.util.Scanner;

public class ABC026A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
		
		System.out.println(((A/2) * (A - A/2)));
	}
}
