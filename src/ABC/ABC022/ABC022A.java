package ABC.ABC022;

import java.util.Scanner;

public class ABC022A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int T = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		int currentWeight = 0;
		for(int i = 0;i < N;++i) {
			currentWeight += A[i];
			if(S <= currentWeight && currentWeight <= T)ans++;
		}
		System.out.println(ans);
	}
}
