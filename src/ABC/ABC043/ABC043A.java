package ABC.ABC043;

import java.util.Scanner;

public class ABC043A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i = 1;i <= N;++i)
			ans += i;
		System.out.println(ans);
	}
}
