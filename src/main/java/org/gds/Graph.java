package org.gds;

import java.util.List;

/**
 * Created by Opeyemi.Folorunsho on 1/17/2016.
 */
public abstract class Graph {
    private int numVertices;
    private int numEdges;

    public Graph() {
        this.numVertices = 0;
        this.numEdges = 0;
    }

    public int getNumVertices() {
        return this.numVertices;
    }

    public int getNumEdges() {
        return this.numEdges;
    }

    public void addVertex() {
        implementAddVertex();
        numVertices++;
    }

    public abstract void implementAddVertex();

    public abstract List<Integer> getNeighbors(int v);

    public abstract void implementAddEdge(int v, int w);
}
