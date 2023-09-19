package org.andrey;

import java.io.IOException;

import static org.andrey.GraphTraversal.breadthTraversal;
import static org.andrey.GraphTraversal.writeToFile;

public class ApplicationRunner {
    public static void main(String[] args) throws IOException {
        Graph graph = Graph.creteGraph();
        writeToFile(breadthTraversal(graph, 3,6),6);
    }
}
