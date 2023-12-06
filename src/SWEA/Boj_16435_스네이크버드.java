package SWEA;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 버드가 과일을먹으면 길이 +1
 * i번째 과일의 높이는 hi
 * 버드의 처음 길이는 L / 먹을수 있는 과일의 높이는 hi<=L
 * @author SSAFY
 *
 */
public class Boj_16435_스네이크버드 {

	static int N; // 과일의 개수
	static int L; // 버드의 초기 길이
	static int[] h; // 과일들의 높이
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		L = sc.nextInt();
		h = new int[N];
		
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		
		for (int i = 0; i < N; i++) {
			if(L>=h[i]) {
				L++;
			}
		}
		System.out.println(L);
	}
	
}
