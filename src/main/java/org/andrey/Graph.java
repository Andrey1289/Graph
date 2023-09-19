package org.andrey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Vertex, List<Vertex>> vertices;

    public Graph() {
        this.vertices = new HashMap<Vertex,List<Vertex>>();
    }


    public Map<Vertex, List<Vertex>> getVertices() {
        return vertices;
    }

    public void setVertices(Map<Vertex, List<Vertex>> vertices) {
        this.vertices = vertices;
    }

    void addVertex(Integer vertexNumber){
        vertices.putIfAbsent(new Vertex(vertexNumber),new ArrayList<>());
    }
    void removeVertex(Integer vertexNumber){
        Vertex vertex = new Vertex(vertexNumber);
        vertices.values().stream().forEach(e ->e.remove(vertex));
    }
    void addEdge(Integer vertexNumber1, Integer vertexNumber2){
        Vertex vertex1 = new Vertex(vertexNumber1);
        Vertex vertex2 = new Vertex(vertexNumber2);
        vertices.get(vertex1).add(vertex2);
        vertices.get(vertex2).add(vertex1);
    }
    void removeEdge(Integer vertexNumber1, Integer vertexNumber2){
        Vertex vertex1 = new Vertex(vertexNumber1);
        Vertex vertex2 = new Vertex(vertexNumber2);
        List<Vertex> listEdge1 = vertices.get(vertex1);
        List<Vertex> listEdge2 = vertices.get(vertex2);
        if(listEdge1 !=null){
            listEdge1.remove(vertex2);
        }
        if(listEdge2 !=null){
            listEdge2.remove(vertex1);
        }
    }
    List<Vertex> getVertices(Integer vertexNumber){
        return vertices.get(new Vertex(vertexNumber));
    }

    static Graph creteGraph(){
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(2,6);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        graph.addEdge(4,6);
        graph.addEdge(5,6);

        return graph;
    }
}