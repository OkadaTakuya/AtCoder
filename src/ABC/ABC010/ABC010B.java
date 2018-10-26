package ABC.ABC010;

import java.util.Scanner;

public class ABC010B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;++i)
			a[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i = 0;i < n;++i) {
			switch(a[i]) {
			case 9:
			case 7:
			case 3:
			case 1:
				break;
			case 8:
			case 2:
			case 4:
				ans += 1;
				break;
			case 5:
				ans += 2;
				break;
			case 6:
				ans += 3;
				break;
			}
		}
		
		System.out.println(ans);
	}
}
