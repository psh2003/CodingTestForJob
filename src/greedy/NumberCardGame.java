package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자 카드 게임
 */
public class NumberCardGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        String[][] arr = new String[n][m];
        int max = 0;
        for (int i = 0; i < n; i++){
            arr[i] = br.readLine().split(" ");
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr[i].length; j++){
                min = Math.min(Integer.parseInt(arr[i][j]), min);
            }
            max = Math.max(max, min);
        }
        System.out.println(max);
    }
}
