package ABC.ABC048;

import java.util.Scanner;

public class ABC048B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		sc.close();
		
		long ans = 0;
		for(long n = 0;;n += x)
			if(n >= a) {
				if(n <= b)
					ans = (b-n)/x + 1;
				break;
			}
		System.out.println(ans);
	}
}
