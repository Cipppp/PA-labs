import BellmanFord.BellmanFord;

import java.util.Scanner;

import static BellmanFord.BellmanFord.bellmanford;

public class Main {
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
}