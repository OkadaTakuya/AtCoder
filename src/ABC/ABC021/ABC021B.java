package ABC.ABC021;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC021B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		set.add(sc.nextInt());	// a
		set.add(sc.nextInt());	// b
		int K = sc.nextInt();
		boolean flag = true;
		for(int i = 0;i < K;++i) {
			int cap = sc.nextInt();
			if(set.contains(cap)) {
				flag = false;
			}else {
				set.add(cap);
			}
		}
		sc.close();
		
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
