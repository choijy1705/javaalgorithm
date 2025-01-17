package SWexpert;
// 사랑의 카운슬러
import java.util.*;

public class Swea7227 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			
			int[][] arr = new int[N][2];
			int[][] dis = new int[N][N];
			
			for(int i=0;i<N;i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
				Arrays.fill(dis[i],0);
			}
			
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					dis[i][j] = (int)Math.pow(arr[i][0] - arr[j][0], 2) +(int) Math.pow(arr[i][1] - arr[j][1], 2);
					System.out.println(dis[i][j]);
				}
			}
			boolean[] visit = new boolean[N];
			
			conn(dis,visit,0,0);
			Collections.sort(list);
			int result = list.get(0);
			System.out.println("#" + tc + " " + result);
		}
	}

	private static void conn(int[][] dis, boolean[] visit, int i,int sum) {
		if(i == N-1) {
			list.add(sum);
			return;
		}
		
		if(visit[i]) {
			conn(dis,visit,i+1,sum);
			return;
		}
		
		visit[i]=true;
		for(int j=i+1;j<N;j++) {
			visit[j] = true;
			conn(dis,visit,i+1,sum +dis[i][j]);
			visit[j] = true;
		}
	}


}
