package ABC.ABC009;

import java.util.Scanner;

public class ABC009B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = sc.nextInt();
		int ans = 0;
		for(int i = 1;i < N;++i) {
			int cap = sc.nextInt();
			if(cap > max) {
				ans = max;
				max = cap;
			} else if(cap != max && cap > ans) {
				ans = cap;
			}
		}
		sc.close();
		
		System.out.println(ans);
	}
}
