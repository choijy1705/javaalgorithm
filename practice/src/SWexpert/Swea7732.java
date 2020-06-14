package SWexpert;
import java.util.*;
public class Swea7732 {
	static Scanner sc = new Scanner(System.in);
	static int C;

	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String[] s1 = sc.next().split(":");
			String[] s2 = sc.next().split(":");
			
			int start = 0;
			int end = 0;
			
			for(int i=0;i<3;i++) {
				if(i == 0) {
					start += Integer.parseInt(s1[i]) * 3600;
					end += Integer.parseInt(s2[i]) * 3600;
				}else if(i==1) {
					start += Integer.parseInt(s1[i]) * 60;
					end += Integer.parseInt(s2[i]) * 60;
				}else {
					start += Integer.parseInt(s1[i]);
					end += Integer.parseInt(s2[i]);
				}
			}
			int time;
			if(end-start >0) {
				time = end - start;
			}else {
				int mid = 24*3600;
				
				time = mid - start + end;
			}
			
			int h = time/3600;
			time %= 3600;
			int m = time/60;
			time %= 60;
			int s = time;
			System.out.printf("# %d %2d:%2d:%2d\n", tc,h,m,s);
			
		}

	}

}