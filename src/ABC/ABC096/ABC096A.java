package ABC.ABC096;

import java.util.Scanner;

public class ABC096A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int min = a > b ? a-1 : a;
		System.out.println(min);
	}
}
