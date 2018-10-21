package ABC.ABC001;

import java.util.Scanner;

public class ABC101C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deg = sc.nextInt();
		int dis = sc.nextInt();
		sc.close();
		
		String dir = "";
		int w = -1;
		if(112 < deg && deg <= 337)
			dir = "NNE";
		else if(337 < deg && deg <= 562)
			dir = "NE";
		else if(562 < deg && deg <= 787)
			dir = "ENE";
		else if(787 < deg && deg <= 1012)
			dir = "E";
		else if(1012 < deg && deg <= 1237)
			dir = "ESE";
		else if(1237 < deg && deg <= 1462)
			dir = "SE";
		else if(1462 < deg && deg <= 1687)
			dir = "SSE";
		else if(1687 < deg && deg <= 1912)
			dir = "S";
		else if(1912 < deg && deg <= 2137)
			dir = "SSW";
		else if(2137 < deg && deg <= 2362)
			dir = "SW";
		else if(2362 < deg && deg <= 2587)
			dir = "WSW";
		else if(2587 < deg && deg <= 2812)
			dir = "W";
		else if(2812 < deg && deg <= 3037)
			dir = "WNW";
		else if(3037 < deg && deg <= 3262)
			dir = "NW";
		else if(3262 < deg && deg <= 3487)
			dir = "NNW";
		else
			dir = "N";
		
		dis = (dis + 3) / 6;
		if(dis <= 2) {
			w = 0;
			dir = "C";
		}else if(dis <= 15)
			w = 1;
		else if(dis <= 33)
			w = 2;
		else if(dis <= 54)
			w = 3;
		else if(dis <= 79)
			w = 4;
		else if(dis <= 107)
			w = 5;
		else if(dis <= 138)
			w = 6;
		else if(dis <= 171)
			w = 7;
		else if(dis <= 207)
			w = 8;
		else if(dis <= 244)
			w = 9;
		else if(dis <= 284)
			w = 10;
		else if(dis <= 326)
			w = 11;
		else w = 12;
		
		System.out.println(dir + " " + w);
	}
}