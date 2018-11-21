package ABC.ABC032;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC032B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		sc.close();
		
		if(s.length() < k) {
			System.out.println("0");
			return;
		} else if(s.length() == k) {
			System.out.println("1");
			return;
		}
		
		Set<String> set = new HashSet<String>();
		for(int i = 0;i <= s.length()-k;++i) {
			if(!set.contains(s.substring(i, i+k)))
				set.add(s.substring(i, i+k));
		}
		System.out.println(set.size());
	}
}
