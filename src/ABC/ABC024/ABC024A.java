package ABC.ABC024;

import java.util.Scanner;

public class ABC024A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int S = sc.nextInt();
		int T = sc.nextInt();
		sc.close();
		
		int ans = 0;
		ans += A * S;
		ans += B * T;
		if(S + T >= K)
			ans -= (S + T) * C;
		System.out.println(ans);
	}
}
