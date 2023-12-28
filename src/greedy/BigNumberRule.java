package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 큰수의 법칙
 */
public class BigNumberRule {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);
        String[] arr2 = br.readLine().split(" ");
        Arrays.sort(arr2);
        int first = Integer.parseInt(arr2[n - 1]);
        int second = Integer.parseInt(arr2[n - 2]);
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            sum += i % k == 0 ? second : first;
        }
        System.out.println(sum);
    }
}
