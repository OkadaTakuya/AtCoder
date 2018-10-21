package ABC.ABC004;

import java.util.Scanner;

public class ABC004B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = new String[4];
		for(int i = 0;i < 4;++i)
			input[i] = sc.nextLine();
		sc.close();
		
		char[][] mat = new char[4][4];
		for(int i = 0;i < 4;++i) {
			String[] token = input[i].split(" ");
			for(int j = 0;j < 4;++j)
				mat[i][j] = token[j].charAt(0);
		}
		
		for(int i = 3;i >= 0;--i) {
			System.out.print(mat[i][3]);
			for(int j = 2;j >= 0;--j) {
				System.out.print(" " + mat[i][j]);
			}
			System.out.println();
		}
	}
}
