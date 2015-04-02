/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.graph;

import java.util.Arrays;

/**
 *
 * @author sergey
 */
public class ConnectionComponents {

    private boolean[] marked;
    public int[] id;
    private int count;

    public ConnectionComponents(Graph g, int startVertex) {
        marked = new boolean[g.V()];
        id = new int[g.V()];

        for (int i = startVertex; i != g.V(); i++) {
            if (!marked[i]) {
                id[i] = count;
                dfsSearch(g, i);
                count++;
            }
        }

    }

    public void dfsSearch(Graph g, int startVertex) {
        marked[startVertex] = true;
        for (int neighbor : g.adj(startVertex)) {
            if (!marked[neighbor]) {
                id[neighbor] = count;
                dfsSearch(g, neighbor);
            }
        }
    }
    
    public boolean isConnected(int v, int w){
    return id[v]==id[w];
    }
    
    public int conectionId(int v){
        return id[v];
    
    }
}
