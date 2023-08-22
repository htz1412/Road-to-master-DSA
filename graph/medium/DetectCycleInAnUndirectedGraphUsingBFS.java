/*
 * Problem Link : https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
 */

package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInAnUndirectedGraphUsingBFS {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycle(i, visited, adj))
                    return true;
            }
        }

        return false;
    }

    private boolean detectCycle(int rootNode, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(rootNode);

        while (!q.isEmpty()) {
            int node = q.poll();
            if (visited[node])
                return true;
            visited[node] = true;

            for (Integer adjNode : adj.get(node)) {
                if (!visited[adjNode])
                    q.add(adjNode);
            }
        }

        return false;
    }
}
