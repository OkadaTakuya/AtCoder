package ABC.ABC032;

import java.util.Scanner;

public class ABC032A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int a = A;
		int b = B;
		int gcd = 0;
		while(true) {
			if(a % b == 0) {
				gcd = b;
				break;
			} else {
				int cap = a % b;
				a = b;
				b = cap;
			}
		}
		int lcm = A * B / gcd;
		if(n%lcm == 0)
			System.out.println(lcm * (n/lcm));
		else
			System.out.println(lcm * (n/lcm + 1));
	}
}