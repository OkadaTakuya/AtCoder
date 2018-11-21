package ABC.ABC027;

import java.util.Scanner;

public class ABC027A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] l = new int[3];
		for(int i = 0;i < 3;++i)
			l[i] = sc.nextInt();
		sc.close();
		
		if(l[0] == l[1])
			System.out.println(l[2]);
		else if(l[0] == l[2])
			System.out.println(l[1]);
		else
			System.out.println(l[0]);
	}
}
