// Kruskal's algorithm in Java

class Main {


    public static void main(String[] args) {
        int vertices = 6; // Number of vertices
        int edges = 8; // Number of edges
        KruskalAlgorithm graph = new KruskalAlgorithm(vertices, edges);

        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 4;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 4;

        graph.edge[2].src = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 2;

        graph.edge[3].src = 2;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 3;

        graph.edge[4].src = 2;
        graph.edge[4].dest = 5;
        graph.edge[4].weight = 2;

        graph.edge[5].src = 2;
        graph.edge[5].dest = 4;
        graph.edge[5].weight = 4;

        graph.edge[6].src = 3;
        graph.edge[6].dest = 4;
        graph.edge[6].weight = 3;

        graph.edge[7].src = 5;
        graph.edge[7].dest = 4;
        graph.edge[7].weight = 3;

        graph.KruskalAlgo();
    }
}