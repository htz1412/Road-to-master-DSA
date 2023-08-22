/*
 * Problem Link : https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
 */

package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSOfGraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            list.add(node);

            for (Integer adjNode : adj.get(node)) {
                if (!visited[adjNode]) {
                    visited[adjNode] = true;
                    q.add(adjNode);
                }
            }
        }

        return list;
    }
}
