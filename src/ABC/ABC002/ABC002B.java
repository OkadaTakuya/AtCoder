package ABC.ABC002;

import java.util.Scanner;

public class ABC002B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		sc.close();
		
		StringBuilder ans = new StringBuilder();
		for(int i = 0;i < W.length();++i) {
			switch(W.charAt(i)) {
			case 'a':
			case 'i':
			case 'u':
			case 'e':
			case 'o':
				break;
			default:
				ans.append(W.charAt(i));
				break;
			}
		}
		System.out.println(ans.toString());
	}
}
