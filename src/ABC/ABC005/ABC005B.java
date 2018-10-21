package ABC.ABC005;

import java.util.Scanner;

public class ABC005B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = sc.nextInt();
		for(int i = 1;i < N;++i) {
			int cap = sc.nextInt();
			if(cap < min)
				min = cap;
		}
		sc.close();
		
		System.out.println(min);
	}
}
