package ABC.ABC046;

import java.util.Scanner;

public class ABC046B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int ans = K;
		for(int i = 1;i < N;++i)
			ans *= K-1;
		System.out.println(ans);
	}
}
