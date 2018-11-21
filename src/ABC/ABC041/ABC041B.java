package ABC.ABC041;

import java.util.Scanner;

public class ABC041B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		sc.close();
		
		long ans = (A * B) % ((long)10E8+7);
		ans = (ans * C) % ((long)10E8+7);
		System.out.println(ans);
	}
}
