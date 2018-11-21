package ABC.ABC035;

import java.util.Scanner;

public class ABC035A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		sc.close();
		
		if(H + H/3 < W)
			System.out.println("16:9");
		else
			System.out.println("4:3");
	}
}
