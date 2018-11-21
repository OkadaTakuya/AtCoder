package ABC.ABC030;

import java.util.Scanner;

public class ABC030B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		n = n % 12;
		double nang = 30*n + ((double)m/2);
		double mang = 6*m;
		double ans = Math.abs(nang - mang);
		if(ans <= 180)
			System.out.println(ans);
		else
			System.out.println(360-ans);
	}
}
