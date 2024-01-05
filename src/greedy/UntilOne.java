package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1이 될 때까지
 */
public class UntilOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        while (n > 1) {
            if (n % k != 0 || n < k) {
                n -= 1;
                count++;
            } else {
                n /= k;
                count++;
            }
        }
        System.out.println(count);
    }
}
