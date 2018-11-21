package ABC.ABC028;

import java.util.Scanner;

public class ABC028B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		int[] count = new int[6];
		for(int i = 0;i < S.length();++i)
			count[S.charAt(i) - 'A']++;
		System.out.print(count[0]);
		for(int i = 1;i < 6;++i)
			System.out.print(" " + count[i]);
		System.out.println();
	}
}
