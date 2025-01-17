package SWexpert;
import java.util.*;
public class Swea5356 {
	static Scanner sc = new Scanner(System.in);
	static int C;

	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String[] st = new String[5];
			int max = 0;
			for(int i=0;i<5;i++) {
				st[i] = sc.next();
				max = st[i].length() >max?st[i].length():max;
			}
			
			String[][] map = new String[5][max];
			
			for(int i=0;i<5;i++) {
				Arrays.fill(map[i], "");
				for(int j=0;j<st[i].length();j++) {
					map[i][j] = String.valueOf(st[i].charAt(j));
				}
			}
			
			String result = "";
			
			for(int j=0;j<map[0].length;j++) {
				for(int i=0;i<5;i++) {
					result += map[i][j];
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
