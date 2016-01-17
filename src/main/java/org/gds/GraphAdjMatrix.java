package org.gds;

import java.util.List;

/**
 * Created by Opeyemi.Folorunsho on 1/17/2016.
 */
public class GraphAdjMatrix extends Graph {

    private int[][] adjMatrix;

    @Override
    public void implementAddVertex() {
        int v = getNumVertices();
        if (v > this.adjMatrix.length) {
            int[][] newAdjMatrix = new int[v * 2][v * 2];
            for (int i = 0; i < adjMatrix.length; i++) {
                for (int j = 0; j < adjMatrix.length; j++) {
                    newAdjMatrix[i][j] = this.adjMatrix[i][j];
                }
            }
            this.adjMatrix = newAdjMatrix;
        }
        for (int i = 0; i < this.adjMatrix[v].length; i++) {
            this.adjMatrix[v][i] = 0;
        }

    }

    @Override
    public List<Integer> getNeighbors(int v) {
        return null;
    }

    @Override
    public void implementAddEdge(int v, int w) {
        this.adjMatrix[v][w] = 1;
    }
}
