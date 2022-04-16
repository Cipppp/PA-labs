package com.company;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 7);
        graph.addEdge(2, 3);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);

        //! DFS and BFS traversal algorithms (one at a time)
//        System.out.println("Following is Depth First Traversal");
//        graph.depthFirstSearch(0); // (1)

        System.out.println("Following is Breadth First Traversal " + "(starting from node 0)");
        graph.breadthFirstSearch(0); // (2)

        //! Find if there is a path between two nodes in an undirected graph
//        int start = 3, end = 5;
//        if (graph.isReachable(start, end))
//            System.out.println("There is a path between (" + start + " - " + end + ").");
//        else
//            System.out.println("There is no path between (" + start + " - " + end + ").");

    }
}
