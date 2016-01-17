package org.gds;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Opeyemi.Folorunsho on 1/17/2016.
 */
public class GraphAdjList extends Graph {
    private Map<Integer, ArrayList<Integer>> adjListMap;

    @Override
    public void implementAddVertex() {
        int v = getNumVertices();
        ArrayList<Integer> neighbours = new ArrayList<Integer>();
        this.adjListMap.put(v, neighbours);

    }

    @Override
    public List<Integer> getNeighbors(int v) {
        return null;
    }

    @Override
    public void implementAddEdge(int v, int w) {
        (this.adjListMap.get(v)).add(w);
    }
}
