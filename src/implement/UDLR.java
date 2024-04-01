package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 상하좌우
 */
public class UDLR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        int x=1,y=1;
        for (String s : sArr) {
            switch (s) {
                case "L" : x = x != 1 ? x-1 : x; break;
                case "R" : x = x != 5 ? x+1 : x; break;
                case "U" : y = y != 1 ? y-1 : y; break;
                case "D" : y = y != 5 ? y+1 : y; break;
            }
        }
        System.out.println(y + " " + x);
    }
}
