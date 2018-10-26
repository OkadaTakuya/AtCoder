package ABC.ABC020;

import java.util.Scanner;

public class ABC020B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int ans = ((A * (int)Math.pow(10, (int)Math.log10(B) + 1)) + B) * 2;
		System.out.println(ans);
	}
}
