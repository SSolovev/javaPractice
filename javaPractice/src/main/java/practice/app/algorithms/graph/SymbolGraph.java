package practice.app.algorithms.graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SeASolovev on 02.04.2015.
 */
public class SymbolGraph {
    public Graph g;
    public String[] toVertex;
    public Map<String, Integer> fromVertex;


    public SymbolGraph(int v) {
        g = new Graph(v);
        toVertex = new String[v];
        fromVertex = new HashMap<>();
    }

    public Graph G(){
        return g;
    }
    public void addEdge(String v, String w) {
        if(!fromVertex.containsKey(v)){
            toVertex[fromVertex.size()] = v;
            fromVertex.put(v, fromVertex.size());
        }

        if(!fromVertex.containsKey(w)) {
            toVertex[fromVertex.size()] = w;
            fromVertex.put(w, fromVertex.size());
        }
        g.addEdge(fromVertex.get(v), fromVertex.get(w));
    }

    public void adj(String v) {
        g.adj(fromVertex.get(v));
    }

    public int index(String v) {
        return fromVertex.get(v);
    }

    public String name(int v) {
        return toVertex[v];
    }

    public boolean contains(String c) {
        return fromVertex.containsKey(c);
    }
}
