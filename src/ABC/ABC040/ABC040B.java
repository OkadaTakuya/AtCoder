package ABC.ABC040;

import java.util.Scanner;

public class ABC040B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int ans = Integer.MAX_VALUE;
		for(int i = 1;i*i <= n;++i) {
			int mod = n - i * i;
			int cap = mod / i + mod % i;
			if(ans > cap)
				ans = cap;
		}
		System.out.println(ans);
	}
}
