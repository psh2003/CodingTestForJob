package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * dfs예제 1
 */
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[][] a = {{2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 7}};
        boolean[] visited = new boolean[1000];
        for (int[] n : a) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int n2 : n) {
                temp.add(n2);
            }
            graph.add(temp);
        }

        dfs(graph, 1, visited);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer i : graph.get(v)) {
            if (!visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }
}
