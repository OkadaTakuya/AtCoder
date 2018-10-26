package ABC.ABC014;

import java.util.Scanner;

public class ABC014A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int ans = (a % b) == 0 ? 0 : b - (a % b);
		System.out.println(ans);
	}
}
