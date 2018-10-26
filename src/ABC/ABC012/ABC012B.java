package ABC.ABC012;

import java.util.Scanner;

public class ABC012B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int h = N / 3600;
		int m = (N % 3600) / 60;
		int s = N % 60;
		System.out.println(String.format("%02d:%02d:%02d", h, m, s));
	}
}
