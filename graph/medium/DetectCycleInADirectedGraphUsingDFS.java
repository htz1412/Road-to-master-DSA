/*
 * Problme Link : https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1?page=1&category[]=Graph&sortBy=submissions
 */

package medium;

import java.util.ArrayList;

public class DetectCycleInADirectedGraphUsingDFS {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycleUsingDFS(i, visited, pathVisited, adj))
                    return true;
            }
        }

        return false;
    }

    private boolean detectCycleUsingDFS(int node, boolean[] visited, boolean[] pathVisited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        pathVisited[node] = true;

        for (Integer adjNode : adj.get(node)) {
            if (!visited[adjNode]) {
                if (detectCycleUsingDFS(adjNode, visited, pathVisited, adj))
                    return true;
            } else if (pathVisited[adjNode])
                return true;
        }

        pathVisited[node] = false;
        return false;
    }
}
