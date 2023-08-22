/*
 * Problem Link : https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
 */

package medium;

import java.util.ArrayList;

public class DetectCycleInAnUndirectedGraphUsingDFS {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycleUsingDFS(i, visited, adj))
                    return true;
            }
        }

        return false;
    }

    public boolean detectCycleUsingDFS(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        for (Integer adjNode : adj.get(node)) {
            if (!visited[adjNode]) {
                if (detectCycleUsingDFS(adjNode, visited, adj))
                    return true;
            } else if (adj.get(adjNode).contains(node))
                return true;
        }

        return false;
    }
}