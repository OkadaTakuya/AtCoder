package ABC.ABC072;

import java.util.Scanner;

public class ABC072B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < s.length();i+=2)
			sb.append(s.charAt(i));
		System.out.println(sb.toString());
	}
}
