package ABC.ABC013;

import java.util.Scanner;

public class ABC013B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int cost1 = Math.abs(a-b);
		int cost2 = 10 - a + b;
		int cost3 = a + 10 - b;
		int min = cost1;
		if(min > cost2)
			min = cost2;
		if(min > cost3)
			min = cost3;
		System.out.println(min);
	}
}
