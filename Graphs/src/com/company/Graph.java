package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer> adjList[];
    private boolean visited[];
    public boolean result;

    // Graph creation
    public Graph(int nodes) {
        adjList = new LinkedList[nodes];
        visited = new boolean[nodes];
        result = false;

        for (int index = 0; index < nodes; index++)
            adjList[index] = new LinkedList<Integer>();
    }

    // Add edges
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    // Depth first search
    public void depthFirstSearch(int node) {
        visited[node] = true;
        System.out.println(node + " ");

        for (int adj : adjList[node])
            if (!visited[adj])
                depthFirstSearch(adj);
    }

    // Breadth first search
    public void breadthFirstSearch(int node) {

        LinkedList<Integer> queue = new LinkedList<>();

        visited[node] = true;
        queue.add(node);

        while (queue.size() != 0) {
            node = queue.poll();
            System.out.println(node + " ");

            for (int currentNode : adjList[node]) {
                if (!visited[currentNode]) {
                    visited[currentNode] = true;
                    queue.add(currentNode);
                }
            }
        }
    }

    // Find path between two nodes
    public void searchPathBetween(int node, int end) {
        visited[node] = true;

        if (node == end) {
            result = true;
            return;
        }

        for (int adj : adjList[node])
            if (!visited[adj])
                searchPathBetween(adj, end);
    }

    public Boolean isReachable(int start, int end) {
        searchPathBetween(start, end);
        return result;
    }

}
