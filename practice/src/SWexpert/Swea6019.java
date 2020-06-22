package SWexpert;
import java.util.*;

public class Swea6019 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int A;
	static int B;
	static int fly;
	static int distance;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			distance = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			fly = sc.nextInt();
			
			int dir = 0;
			double realtime = 0;
			double crushtime = distance/(A+B);
			double time = 1;
			while(time >0) {
				
				if(dir ==0) {
					time = distance/(fly + B);
				}else {
					time = distance/(fly+A);
				}
				realtime += time;
				distance -= (A+B)*time;
				if(dir == 0) {
					dir = 1;
				}else {
					dir = 0;
				}
				
			}
			
			double flydistance = realtime * fly;
			
			System.out.println("#" + tc + " " + flydistance);
		}

	}

}
