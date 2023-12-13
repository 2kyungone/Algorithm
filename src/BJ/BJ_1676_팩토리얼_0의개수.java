package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.*/
public class BJ_1676_팩토리얼_0의개수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        /*첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)*/
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while (N >= 5) {
            count += N / 5;
            N /= 5;
        }
        System.out.println(count);
    }
}
