package BellmanFord;


import java.util.HashMap;
import java.util.Scanner;

public class BellmanFord {

    public static class edge {
        int u;
        int v;

        public edge(int u, int v) {
            this.u = u;
            this.v = v;
        }

        public String toString() {
            return this.u + " " + this.v;
        }
    }

    public static class Node {
        int val;
        int dist;
        String path;

        public Node(int val, int dist, String path) {
            this.val = val;
            this.dist = dist;
            this.path = path;
        }

        public String toString() {
            return "Distance of " + this.val + " from source is " + this.dist + " and path followed is " + this.path;
        }

    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int nodes = scn.nextInt();
        int[][] graph = new int[nodes + 1][nodes + 1];
        int numEdges = scn.nextInt();
        for (int edge = 0; edge < numEdges; edge++) {
            int u = scn.nextInt(), v = scn.nextInt(), w = scn.nextInt();
            graph[u][v] = w;
        }

        bellmanford(scn.nextInt(), nodes, numEdges, graph);
    }
    public static edge[] getEdges(int numEdges, int[][] graph) {
        edge[] rv = new edge[numEdges];

        int idx = 0;
        for (int u = 1; u < graph.length && idx < rv.length; u++) {
            for (int v = 1; v < graph[u].length && idx < rv.length; v++) {
                rv[idx] = new edge(u, v);
                idx = graph[u][v] != 0 ? idx + 1 : idx;
            }
        }

        return rv;

    }

    public static void bellmanford(int src, int nodes, int edges, int[][] graph) {

        HashMap<Integer, Node> nodesMap = new HashMap<>();
        for (int i = 1; i < graph.length; i++) {

            nodesMap.put(i, new Node(i, i == src ? 0 : (int) 1e9 + 1, i == src ?
                    Integer.toString(i) : ""));
        }

        /* outer loop will run for vertices - 1 times */
        for (int var = 1; var <= nodes - 1; var++) {
            for (edge e : getEdges(edges, graph)) {
                Node u = nodesMap.get(e.u);
                Node v = nodesMap.get(e.v);

                if (v.dist > u.dist + graph[u.val][v.val]) {
                    v.dist = u.dist + graph[u.val][v.val];
                    v.path = u.path + "->" + Integer.toString(v.val);
                }
            }
        }

        for (edge e : getEdges(edges, graph)) {
            Node u = nodesMap.get(e.u);
            Node v = nodesMap.get(e.v);

            if (v.dist > u.dist + graph[u.val][v.val]) {
                System.out.println("Negative Cycle Detected");
                return;
            }
        }

        for (int node : nodesMap.keySet()) {
            System.out.println(nodesMap.get(node));
        }

    }

}