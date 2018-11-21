package ABC.ABC057;

import java.util.Scanner;

public class ABC057A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int ans = (A + B) % 24;
		System.out.println(ans);
	}
}
