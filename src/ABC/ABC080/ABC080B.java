package ABC.ABC080;

import java.util.Scanner;

public class ABC080B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int cap = N;
		int fx = 0;
		for(int i = (int)Math.log10(N);i >= 0;--i) {
			fx += cap / Math.pow(10, i);
			cap = cap % (int)Math.pow(10, i);
		}
		
		if(N % fx == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}