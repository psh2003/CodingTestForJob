package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 시각
 */
public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int h=0,m=0,s=0;
        int cnt = 0;
        while (!("" + h + m + s).equals(n + "5959")) {
            if (("" + h + m + s).contains("3")) {
                cnt++;
            }
            if (s == 60) {
                s = 0;
                m++;
            }
            if (m == 60) {
                m = 0;
                h++;
            }
            s++;
        }
        System.out.println(cnt);
    }
}
