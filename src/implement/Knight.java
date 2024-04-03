package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 왕실의 나이트
 */
public class Knight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int col = s.charAt(0) % 97;
        int row = Integer.parseInt(s.substring(1, 2));
        int count = 0;
        int[][] steps = {{-2, -1}, {-1,-2},{1,-2}, {2,-1}, {2,1},{1,2}, {-1,2},{-2,1}};

        for (int i = 0; i < 8; i++) {
            int a = row + steps[i][0];
            int b = col + steps[i][1];
            if (a >= 1 && a <= 8 && b >= 0 && b < 11) {
                count++;
            }
        }
        System.out.println(count);
    }
}
