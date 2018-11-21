package ABC.ABC027;

import java.util.Scanner;

public class ABC027B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;++i)
			a[i] = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 0;i < N;++i)
			sum += a[i];
		if(sum % N != 0) {
			System.out.println("-1");
			return;
		}
		
		int ave = sum / N;
		int ans = 0;
		int excess = 0;
		for(int i = 0;i < N;++i) {
			excess += a[i] - ave;
			if(excess != 0)
				++ans;
		}
		System.out.println(ans);
	}
}
