package ABC.ABC046;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC046A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		Set<Integer> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		System.out.println(set.size());
	}
}
