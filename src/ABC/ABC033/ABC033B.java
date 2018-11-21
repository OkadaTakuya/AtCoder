package ABC.ABC033;

import java.util.Scanner;

public class ABC033B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];
		int[] P = new int[N];
		for(int i = 0;i < N;++i) {
			S[i] = sc.next();
			P[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0, max = 0, maxIdx = 0;
		for(int i = 0;i < N;++i) {
			sum += P[i];
			if(max < P[i]) {
				max = P[i];
				maxIdx = i;
			}
		}
		if(sum/2 < max)
			System.out.println(S[maxIdx]);
		else
			System.out.println("atcoder");
	}
}
