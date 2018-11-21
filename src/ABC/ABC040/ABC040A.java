package ABC.ABC040;

import java.util.Scanner;

public class ABC040A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		
		if(n - x >= x)
			System.out.println(x-1);
		else
			System.out.println(n-x);
	}
}
