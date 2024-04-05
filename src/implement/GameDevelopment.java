package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 게임 개발
 */
public class GameDevelopment {
    public static int x;
    public static int y;
    public static int direction ;
    public static int[] xArr;
    public static int[] yArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int xSize = Integer.parseInt(size[0]);
        int ySize = Integer.parseInt(size[1]);

        String[] loc = br.readLine().split(" ");

        x = Integer.parseInt(loc[0]);
        y = Integer.parseInt(loc[1]);
        direction = Integer.parseInt(loc[2]);

        xArr = new int[]{0, 1, 0, -1};
        yArr = new int[]{-1, 0, 1, 0};
        int[][] arr = new int[ySize][xSize];
        for (int i = 0; i < ySize; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreTokens()) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }
        boolean flag = false;
        int count = 0;
        int turnTime = 0;
        while (!flag) {
            direction -= 1;
            if (direction == -1) {
                direction = 3;
            }
            turnTime++;
            if (arr[x + xArr[direction]][y + yArr[direction]] == 0) {
                arr[x + xArr[direction]][y + yArr[direction]] = 2;
                x = x + xArr[direction];
                y = y + yArr[direction];
                count++;
                turnTime = 0;
            }
            if (turnTime == 4) {
                if (arr[x - xArr[direction]][y - yArr[direction]] == 1) {
                    flag = true;
                } else {
                    arr[x - xArr[direction]][y - yArr[direction]] = 2;
                    x = x - xArr[direction];
                    y = y - yArr[direction];
                    turnTime = 0;
                }
            }
        }
        System.out.println(count);
    }
}
