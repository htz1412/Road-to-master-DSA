/*
 * Problem Link : https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
 */
package easy;

import java.util.ArrayList;

public class DFSOfGraph {
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0, visited, list, adj);
        return list;
    }

    private static void dfs(int node, boolean[] visited, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        list.add(node);

        for (Integer adjNode : adj.get(node)) {
            if (!visited[adjNode])
                dfs(adjNode, visited, list, adj);
        }
    }
}
