package ABC.ABC071;

import java.util.Scanner;

public class ABC071A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int l1 = Math.abs(x - a);
		int l2 = Math.abs(x - b);
		
		if(l1 > l2)
			System.out.println("B");
		else
			System.out.println("A");
	}
}
