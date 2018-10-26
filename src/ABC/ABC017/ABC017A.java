package ABC.ABC017;

import java.util.Scanner;

public class ABC017A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[3];
		int[] e = new int[3];
		for(int i = 0;i < 3;++i) {
			s[i] = sc.nextInt();
			e[i] = sc.nextInt();
		}
		sc.close();
		
		int ans = 0;
		for(int i = 0;i < 3;++i) {
			ans += s[i] / 10 * e[i];
		}
		System.out.println(ans);
	}
}
