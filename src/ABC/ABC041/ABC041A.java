package ABC.ABC041;

import java.util.Scanner;

public class ABC041A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = sc.nextInt();
		sc.close();

		System.out.println(s.charAt(i-1));
	}
}
