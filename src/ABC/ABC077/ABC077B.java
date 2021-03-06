package ABC.ABC077;

import java.util.Scanner;

public class ABC077B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long ans = 1;
		for(long i = 1;i <= Math.sqrt(N)+1;++i) {
			if(i * i > N) {
				ans = (i-1) * (i-1);
				break;
			}
		}
		System.out.println(ans);
	}
}
