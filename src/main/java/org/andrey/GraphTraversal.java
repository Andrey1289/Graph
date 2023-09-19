package org.andrey;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GraphTraversal {
    static Set<Integer> breadthTraversal(Graph graph, Integer root,Integer endPoint) {
        Set<Integer> visited = new LinkedHashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> pathEndPout = new LinkedHashSet<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            Integer vertex = queue.poll();
            pathEndPout.add(vertex);
            for (Vertex v : graph.getVertices(vertex)) {
                if(v.vertexNumber.equals(endPoint)){
                    return pathEndPout;
                }
                if (!visited.contains(v.vertexNumber)) {
                    visited.add(v.vertexNumber);
                    queue.add(v.vertexNumber);
                }
            }
        }
        return pathEndPout;
    }
    public static void writeToFile(Set<Integer> vertexGraph, Integer endPoint ) throws IOException {
        FileWriter writer = new FileWriter("graph.txt");
        for (Integer integer : vertexGraph) {
            writer.write(integer.toString() +"-");
        }
        writer.write(endPoint.toString());
        writer.write(" Длинна пути: " +   (vertexGraph.size()));
         writer.close();
    }
}
