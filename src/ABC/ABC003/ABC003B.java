package ABC.ABC003;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC003B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		Set<Character> reg = new HashSet<Character>();
		reg.add('a');
		reg.add('t');
		reg.add('c');
		reg.add('o');
		reg.add('d');
		reg.add('e');
		reg.add('r');

		boolean flag = true;
		for(int i = 0;i < S.length();++i) {
			if(S.charAt(i) == T.charAt(i))
				continue;
			if(S.charAt(i) == '@' && T.charAt(i) == '@')
				continue;
			if(S.charAt(i) == '@' && reg.contains(T.charAt(i)))
				continue;
			if(reg.contains(S.charAt(i)) && T.charAt(i) == '@')
				continue;
			flag = false;
			break;
		}
		
		if(flag)
			System.out.println("You can win");
		else
			System.out.println("You will lose");
	}
}
