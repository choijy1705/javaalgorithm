package hackerrank;
import java.util.*;
public class CakeWalk {
	static Scanner sc = new Scanner(System.in);
	static int j;
	public static void main(String[] args) {
		
		j = sc.nextInt();

		int[] arr = new int[j];
		
		for(int i=0;i<j;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		long sum=0;
		int k = j;
		for(int i=0;i<j;i++) {

			sum+=Math.pow(2, (k-1)) * arr[i];
			k--;
		}
		System.out.println(sum);
	}

}
