package org.andrey;

import java.util.Objects;

public class Vertex {
    Integer vertexNumber;

    public Vertex(Integer vertexGraph){
        this.vertexNumber = vertexGraph;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(vertexNumber, vertex.vertexNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertexNumber);
    }

    @Override
    public String toString() {
        return "--Vertex" +
                "(" + vertexNumber +")--";
    }

}
