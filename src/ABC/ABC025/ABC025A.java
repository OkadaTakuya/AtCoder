package ABC.ABC025;

import java.util.Scanner;

public class ABC025A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = sc.nextInt() - 1;
		sc.close();
		
		System.out.println(S.charAt(N/5) + "" + S.charAt(N%5));
	}
}
