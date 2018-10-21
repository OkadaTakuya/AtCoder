package ABC.ABC006;

import java.util.Scanner;

public class ABC006A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N % 3 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
