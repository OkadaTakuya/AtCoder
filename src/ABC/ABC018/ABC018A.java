package ABC.ABC018;

import java.util.Scanner;

public class ABC018A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		for(int i = 0;i < 3;++i)
			x[i] = sc.nextInt();
		sc.close();
		
		int min = x[0];
		int max = x[0];
		if(x[1] > max)
			max = x[1];
		else if(x[1] < min)
			min = x[1];
		if(x[2] > max)
			max = x[2];
		else if(x[2]< min)
			min = x[2];
		
		for(int i = 0;i < 3;++i) {
			if(x[i] == max)
				System.out.println("1");
			else if(x[i] == min)
				System.out.println("3");
			else
				System.out.println("2");
		}
	}
}
