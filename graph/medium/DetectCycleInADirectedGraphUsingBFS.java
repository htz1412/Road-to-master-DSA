/*
 * Problme Link : https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1?page=1&category[]=Graph&sortBy=submissions
 */

package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInADirectedGraphUsingBFS {
    public static void main(String[] args) {
        int V = 8;
        int E = 8;

        int[][] input = new int[][]{
            {6, 0},
            {0, 2},
            {2, 4},
            {4, 7},
            {7, 5},
            {5, 1},
            {1, 3},
            {5, 6},
        };

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < V; i++)
            list.add(i, new ArrayList<Integer>());
        for (int i = 0; i < E; i++) {
            int u = input[i][0];
            int v = input[i][1];
            list.get(u).add(v);
        }
        if (new DetectCycleInAnUndirectedGraphUsingDFS().isCyclic(V, list))
            System.out.println("1");
        else
            System.out.println("0");
    }

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycleUsingBFS(i, visited, pathVisited, adj))
                    return true;
            }
        }

        return false;
    }

    public boolean detectCycleUsingBFS(int node, boolean[] visited, boolean[] pathVisited, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        pathVisited[node] = true;

        while (!q.isEmpty()) {
            int curNode = q.poll();
            for (Integer adjNode : adj.get(curNode)) {
                if (!visited[adjNode]) {
                    q.add(adjNode);
                    visited[adjNode] = true;
                    pathVisited[adjNode] = true;
                }
            }
        }
        return false;
    }
}
