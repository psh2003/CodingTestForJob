package bfs;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * bfs 예제1
 */
public class Ex1 {
    static int[][] graph = {{}, {2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
    static boolean[] visited = new boolean[graph.length];

    public static void main(String[] args) {
        bfs(1);
    }

    public static void bfs(int start) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offer(start);
        visited[start] = true;
        while (!deque.isEmpty()) {
            int n = deque.pollFirst();
            System.out.print(n + " ");
            for (int i : graph[n]) {
                if (!visited[i]) {
                    deque.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
