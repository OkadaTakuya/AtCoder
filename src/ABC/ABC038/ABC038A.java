package ABC.ABC038;

import java.util.Scanner;

public class ABC038A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		if(S.charAt(S.length()-1) == 'T')
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
